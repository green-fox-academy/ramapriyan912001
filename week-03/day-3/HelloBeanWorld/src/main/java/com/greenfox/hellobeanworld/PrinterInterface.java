package com.greenfox.hellobeanworld;

import org.springframework.stereotype.Component;

@Component
public interface PrinterInterface {

    public void log(String message);
}
