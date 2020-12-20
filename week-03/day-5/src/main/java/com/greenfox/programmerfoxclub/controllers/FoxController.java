package com.greenfox.programmerfoxclub.controllers;

import com.greenfox.programmerfoxclub.models.Fox;
import com.greenfox.programmerfoxclub.repositories.FoxRepository;
import com.sun.tools.javac.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class FoxController {

    @RequestMapping(value = "/nutritionPost", method = RequestMethod.POST)
    public String nutritionPost(Model model, String name, String food, String drink) {
        if (MainController.foxRepository.containsFox(name)) {
            Fox newfox = MainController.foxRepository.getFoxByName(name);
            newfox.setFood(food);
            newfox.setDrink(drink);
        } else {
            Fox newFox = new Fox(name, new ArrayList<>(), food, drink);
            MainController.foxRepository.add(newFox);
        }
        return "redirect:/?name=" + name;
    }
}
