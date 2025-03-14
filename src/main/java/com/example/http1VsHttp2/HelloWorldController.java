package com.example.http1VsHttp2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public Mono<String> hello(@RequestParam(value = "id", defaultValue = "1") int id) {
        String message = String.format("Message %d", id);
        var delay = Duration.ofMillis(5000);
        return Mono.delay(delay).then(Mono.just(message));
    }
}