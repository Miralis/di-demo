package com.example.didemo.controllers;

import com.example.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    // The Type is the Interface, but the Property-Name matches the Bean-Name.
    // -> Spring will use the Bean matching the Property-Name.
    // -> Shortcut for not using the @Qualifier. - Probably better to use the @Qualifier tho.
    // It will still use the @Primary Service if there is one.
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}
