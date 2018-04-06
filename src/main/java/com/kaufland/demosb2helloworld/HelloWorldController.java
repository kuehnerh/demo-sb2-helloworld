package com.kaufland.demosb2helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String getHelloWorld() {
        return "Hello World!";
    }
}
