package com.greenfox.programmerfoxclub.controllers;

import com.greenfox.programmerfoxclub.models.Fox;
import com.greenfox.programmerfoxclub.repositories.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MainController {

    public static FoxRepository foxRepository;

    @Autowired
    public MainController(FoxRepository foxRepository){
        this.foxRepository = foxRepository;
    }

    @RequestMapping(value = "/index")
    public String basicIndexPage(Model model) {
        model.addAttribute("fox", new Fox("Mr Fox"));
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexPage(Model model, @RequestParam("name") String name) {
        Fox newFox;
        if (!foxRepository.containsFox(name)) {
            newFox = new Fox(name, new ArrayList<>(), "Burgers","Sprite");
            foxRepository.add(newFox);
        } else {
            newFox = foxRepository.getFoxByName(name);
        }
        model.addAttribute("fox", newFox);
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGET(Model model) {
        model.addAttribute("name", "");
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPOST(@RequestParam("name") String name) {
        return "redirect:/?name=" + name;
    }

    @RequestMapping(value = "/nutritionStore", method = RequestMethod.GET)
    public String nutrition(Model model) {
        model.addAttribute("name", "");
        return "Nutrition_Store";
    }

    @RequestMapping(value = "/trickcenter", method = RequestMethod.GET)
    public String trickCenter(Model model) {
        model.addAttribute("name", "");
        return "trick_center";
    }

    @RequestMapping(value = "/trickcenterPost", method = RequestMethod.POST)
    public String trickCenter(Model model, String name, String tricks) {
        Fox newfox;
        if (MainController.foxRepository.containsFox(name)) {
            newfox = MainController.foxRepository.getFoxByName(name);
        } else {
            newfox = new Fox(name);
            MainController.foxRepository.add(newfox);
        }
        if (!newfox.getTricks().contains(tricks)) {
            newfox.addTrick(tricks);
        }
        return "redirect:/?name=" + name;
    }

}
