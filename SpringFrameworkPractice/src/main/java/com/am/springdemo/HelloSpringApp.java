package com.am.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // load the spring configuration file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SportsConfig.class);

        // retrieve bean from spring container
        Coach trackCoach = context.getBean("trackCoach", Coach.class);
        Coach baseBallCoach = context.getBean("baseballCoach", Coach.class);
        Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);

        // call methods on the bean
        System.out.println("Track Coach");
        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyFortune());// HappyFortuneService Bean injected by Spring Container Using setter dependency Injection
        // call methods on the bean
        System.out.println("BaseBall Coach");
        System.out.println(baseBallCoach.getDailyWorkout());
        System.out.println(baseBallCoach.getDailyFortune());// HappyFortuneService Bean injected by Spring Container Using setter dependency Injection
        // call methods on the bean
        System.out.println("Cricket Coach");
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());// HappyFortuneService Bean injected by Spring Container Using setter dependency Injection

        context.close();
    }

}
