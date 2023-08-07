package com.java.marko.chatApp.controllers;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Getter
@NoArgsConstructor
public class MessageReceiver {

    private String message;

    @RequestMapping
    public String receiveMessage(String message) {
        this.message = message;
        return "index";
    }
}
