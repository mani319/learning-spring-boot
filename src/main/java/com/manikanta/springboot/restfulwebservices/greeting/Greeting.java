package com.manikanta.springboot.restfulwebservices.greeting;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Greeting {

    private Long id;
    private String content;
}
