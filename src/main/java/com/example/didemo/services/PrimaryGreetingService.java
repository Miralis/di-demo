package com.example.didemo.services;

//@Primary means that if there is more than one Bean that qualifies, it will use this one.
// The default-Profile is only active, when other profiles are not active!
public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
