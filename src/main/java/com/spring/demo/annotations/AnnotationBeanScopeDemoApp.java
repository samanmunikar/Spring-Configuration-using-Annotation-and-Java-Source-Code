package com.spring.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args){

        //load spring config file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from the spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        //call methods
        boolean result = (theCoach == alphaCoach);
        System.out.println("Pointing to the same result " + result);
        System.out.println("Memory location for theCoach " + theCoach);
        System.out.println("Memory location for alphaCoach " + alphaCoach);


        //close the context
        context.close();
    }
}
