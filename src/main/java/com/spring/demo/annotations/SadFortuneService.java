package com.spring.demo.annotations;

public class SadFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "I am so sad.Today is a sad day!";
    }
}
