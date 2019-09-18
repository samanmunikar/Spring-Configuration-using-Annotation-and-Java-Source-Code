package com.spring.demo.annotations;

import jdk.nashorn.internal.objects.annotations.ScriptClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println("Tennis Coach: inside default constructor");
    }
//
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("Setter method for fortune service");
//        this.fortuneService = fortuneService;
//    }
//
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        System.out.println("Autowiring method for doSomeCrazyStuff");
//        this.fortuneService = fortuneService;
//    }

    //define init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("Do my start up stuff");
    }

    @PreDestroy
    //define destroy method
    public void doMyCleanupStuff(){
        System.out.println("Do my clean up stuff");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune(){
        return this.fortuneService.getFortune();
    }
}
