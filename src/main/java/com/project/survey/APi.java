package com.project.survey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class APi {
    @GetMapping("/hello")
    public Collection<String> sayHello() {
        System.out.println("hiiii");
        return IntStream.range(0, 10)
                .mapToObj(i -> "Hello number " + i)
                .collect(Collectors.toList());
    }
}
