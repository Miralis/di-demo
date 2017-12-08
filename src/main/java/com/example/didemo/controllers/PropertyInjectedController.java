package com.example.didemo.controllers;

import com.example.didemo.services.GreetingServiceImpl;

// Example of everything NOT to do
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
