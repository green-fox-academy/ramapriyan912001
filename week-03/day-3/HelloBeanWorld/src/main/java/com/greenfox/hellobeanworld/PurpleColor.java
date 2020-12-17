package com.greenfox.hellobeanworld;

import org.springframework.stereotype.Service;

@Service
public class PurpleColor implements MyColor {
    @Override
    public void printColor() {
        System.out.println("THIS IS PURPLE BRO");
    }
}
