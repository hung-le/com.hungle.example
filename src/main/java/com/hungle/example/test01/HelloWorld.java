package com.hungle.example.test01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {
    private static final Logger log = LogManager.getLogger(HelloWorld.class);

    private String message;

    public HelloWorld(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        String message = "Hello World!";

        HelloWorld hello = new HelloWorld(message);
        log.info(hello.getMessage());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
