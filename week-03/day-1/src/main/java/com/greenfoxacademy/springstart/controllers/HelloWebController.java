package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/web")
public class HelloWebController {

    public static int counter = 0;
    /*@RequestMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", " World");
        return "greeting";
    }*/

    @RequestMapping("/greeting")
    public String webGreet(Model model, @RequestParam() String name, @RequestParam() String size) {
        counter++;
        model.addAttribute("count", counter);
        model.addAttribute("name", name);
        model.addAttribute("size", size);
        return "greeting";
    }
}
