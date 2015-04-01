package com.hungle.example;

import org.junit.Assert;
import org.junit.Test;

import com.hungle.example.test01.HelloWorld;

public class HelloWorldTest {

    @Test
    public void test1() {
        String message = "Hello World!";
        
        HelloWorld hello = new HelloWorld(message);
        
        String msg = hello.getMessage();
        Assert.assertNotNull(msg);
        Assert.assertEquals(message, msg);        
    }
}
