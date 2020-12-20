package com.greenfox.programmerfoxclub.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Fox {

    private String name;
    private List<String> tricks;
    private String food;
    private String drink;

    @Autowired
    public Fox() {
        this.name = "";
        this.tricks = new ArrayList<>();
        this.food = "";
        this.drink = "";
    }

    public Fox(String name) {
        new Fox();
        this.setName(name);
    }

    public Fox(String name, List<String> tricks, String food, String drink) {
        this.name = name;
        this.tricks = tricks;
        this.food = food;
        this.drink = drink;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void addTrick(String trick) {
        if (!tricks.contains(trick)) {
            tricks.add(trick);
        }
    }

    public int getNumberOfTricks() {
        return tricks.size();
    }

    public String toString() {
        return name;
    }

}
