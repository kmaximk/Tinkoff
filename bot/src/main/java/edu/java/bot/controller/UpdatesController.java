package edu.java.bot.controller;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import edu.java.dto.LinkUpdateRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UpdatesController implements UpdatesApi {

    private final TelegramBot bot;

    @PostMapping("/updates")
    public ResponseEntity<Void> update(@Valid @RequestBody LinkUpdateRequest linkUpdate) {
        log.info("links updated {}", linkUpdate.url());
        linkUpdate.tgChatIds().forEach(chat -> bot.execute(new SendMessage(chat, linkUpdate.description())));
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
