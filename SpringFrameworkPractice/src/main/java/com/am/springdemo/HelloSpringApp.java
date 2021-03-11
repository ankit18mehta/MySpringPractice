package com.am.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach trackCoach = context.getBean("myCoach", Coach.class);
        Coach baseballCoach = context.getBean("myNewCoach", Coach.class);
        Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);

        // call methods on the bean
        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyFortune());// HappyFortuneService Bean injected by Spring Container Using setter dependency Injection
        System.err.println("BaseBall Coach");
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(baseballCoach.getDailyFortune());// HappyFortuneService Bean injected by Spring Container Using constructor dependency Injection

        System.err.println("Cricket Coach");
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());// HappyFortuneService Bean injected by Spring Container Using constructor dependency Injection
        // close the context
        context.close();
    }

}
