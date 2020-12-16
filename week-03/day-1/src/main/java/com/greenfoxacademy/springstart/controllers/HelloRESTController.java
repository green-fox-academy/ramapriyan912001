package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    /*@RequestMapping ("/greeting")
    public Greeting greeting() {
        return new Greeting(1, "Greetings!");
    }*/

    /*@RequestMapping ("/greeting")
    public Greeting greeting(@RequestParam ("name") String name) {
        return new Greeting(1, "Hello " + name);
    }*/

    @RequestMapping ("/greeting")
    public AtomicLong greeting(@RequestParam ("name") String name) {
        return new AtomicLong("Hello " + name);
    }

}
