package com.spring.demo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args){
        //load the configuration file
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);


        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
