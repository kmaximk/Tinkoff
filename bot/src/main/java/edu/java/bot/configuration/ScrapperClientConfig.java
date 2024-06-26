package edu.java.bot.configuration;

import edu.java.bot.clients.ScrapperClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ScrapperClientConfig {
    @Bean
    public ScrapperClient scrapperClient(ApplicationConfig config, RetryTemplate retryTemplate) {
        return new ScrapperClient(WebClient.builder(), config.scrapperApiUri(), retryTemplate);
    }
}
