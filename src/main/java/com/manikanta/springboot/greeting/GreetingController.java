package com.manikanta.springboot.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @Autowired
    private MessageSource messageSource;

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

    @GetMapping("/greet/greetInternationalize")
    public String greetInternationalize() {
        return messageSource.getMessage("good.morning.message", null,
                LocaleContextHolder.getLocale());
    }
}
