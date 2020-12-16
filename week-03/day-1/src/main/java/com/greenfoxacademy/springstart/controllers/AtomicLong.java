package com.greenfoxacademy.springstart.controllers;

public class AtomicLong {

    public static long count = 0;
    public long greetCount;
    public String content;


    public AtomicLong(String content) {
        count++;
        this.greetCount = count;
        this.content = content;
    }
}
