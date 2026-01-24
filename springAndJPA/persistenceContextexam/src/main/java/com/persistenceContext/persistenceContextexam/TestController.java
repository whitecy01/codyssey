package com.persistenceContext.persistenceContextexam;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping("/test")
    public String test() {
        testService.tx();
        return "ok";
    }
}
