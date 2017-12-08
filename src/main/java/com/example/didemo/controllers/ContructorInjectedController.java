package com.example.didemo.controllers;

import com.example.didemo.services.GreetingService;

public class ContructorInjectedController {

    public GreetingService greetingService;

    public ContructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
