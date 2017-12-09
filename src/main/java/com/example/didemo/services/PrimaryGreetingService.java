package com.example.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary means that if there is more than one Bean that qualifies, it will use this one.
@Service
@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting Service";
    }
}
