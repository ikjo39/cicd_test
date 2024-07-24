package com.ikjo.cicd_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/public")
    public String mainPublic() {
        return "mainPublic";
    }

    @GetMapping("default")
    String mainDefault() {
        return "mainDefault";
    }

    @GetMapping("/protected")
    protected String mainProtected() {
        return "mainProtected";
    }

    @GetMapping("/private")
    private String mainPrivate() {
        return "mainPrivate";
    }
}
