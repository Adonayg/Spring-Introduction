package com.adonayg.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "english"})
public class HelloWorldServiceEnglishImpl implements HelloWorldService{
    @Override
    public String getGreeting() {
        return "Hello World!";
    }
}