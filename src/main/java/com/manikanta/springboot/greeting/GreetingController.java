package com.manikanta.springboot.greeting;

import com.manikanta.springboot.greeting.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String MESSAGE_TEMPLATE = "Hello, %s!";
    private static final AtomicLong counter = new AtomicLong();

    @GetMapping("/greet")
    public Greeting greetParam(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(MESSAGE_TEMPLATE, name));
    }

    @GetMapping("/greet/name/{name}")
    public Greeting greetPath(@PathVariable String name) {
        return new Greeting(counter.incrementAndGet(), String.format(MESSAGE_TEMPLATE, name));
    }
}
