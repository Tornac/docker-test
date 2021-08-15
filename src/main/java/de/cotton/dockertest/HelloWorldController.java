package de.cotton.dockertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String getHelloWorld() {
        return "Hello World! It's " + LocalDateTime.now();
    }
}
