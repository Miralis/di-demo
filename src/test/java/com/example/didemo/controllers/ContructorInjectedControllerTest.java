package com.example.didemo.controllers;

import com.example.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContructorInjectedControllerTest {

    private ContructorInjectedController contructorInjectedController;

    @Before
    public void setUp() {
        this.contructorInjectedController = new ContructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, contructorInjectedController.sayHello());
    }
}