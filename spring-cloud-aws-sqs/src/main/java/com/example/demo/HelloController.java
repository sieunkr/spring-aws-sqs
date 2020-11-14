package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HelloController {

    private final AmazonSQSApiCaller amazonSQSApiCaller;

    @GetMapping("/send")
    public String send() {
        amazonSQSApiCaller.sendMessage("test");

        return "OK";
    }
}
