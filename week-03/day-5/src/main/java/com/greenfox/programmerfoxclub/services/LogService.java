package com.greenfox.programmerfoxclub.services;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class LogService {
    public void log(Object object, String methodName) {
        System.out.println(LocalDateTime.now() + " Class: " + object.getClass().getSimpleName()
                + " Method: " + methodName );
    }
}
