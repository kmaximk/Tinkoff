package edu.java.scrapper.clients;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import edu.java.scrapper.clients.github.GitHubClient;
import edu.java.scrapper.clients.github.GitHubResponse;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GitHubClientTest {

    @RegisterExtension
    private static WireMockExtension wireMockExtension =
        WireMockExtension.newInstance().options(wireMockConfig().dynamicPort()).build();

    private GitHubClient gitHubClient;

    private final RetryTemplate retryTemplate = new RetryTemplate();

    @BeforeEach
    public void setup() {
        gitHubClient = new GitHubClient(WebClient.builder(), wireMockExtension.baseUrl(), retryTemplate);
    }

    @Test
    public void getUpdatesTest() {
        wireMockExtension.stubFor(get("/repos/octocat/Hello-World")
            .willReturn(okJson("""
                {
                  "id": 1296269,
                  "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
                  "name": "Hello-World",
                  "full_name": "octocat/Hello-World",
                  "private": false,
                  "created_at": "2011-01-26T19:01:12Z",
                  "updated_at": "2024-02-23T19:58:00Z",
                  "pushed_at": "2024-02-23T12:43:59Z",
                  "open_issues_count": 10
                }""")));
        GitHubResponse response = gitHubClient.getRepositoryInfo("octocat", "Hello-World");
        assertEquals(OffsetDateTime.parse("2024-02-23T19:58:00Z"), response.updatedAt());
        assertEquals(OffsetDateTime.parse("2011-01-26T19:01:12Z"), response.createdAt());
        assertEquals(OffsetDateTime.parse("2024-02-23T12:43:59Z"), response.pushedAt());
        assertEquals(10, response.openIssuesCount());
    }
}
