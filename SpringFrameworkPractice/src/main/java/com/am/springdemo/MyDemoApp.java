package com.am.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDemoApp {

    public static void main(String args[])

    {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container

        Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);

        // call methods on the bean
        System.err.println("Cricket Coach");
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());// HappyFortuneService Bean injected by Spring Container Using constructor dependency Injection
        // close the context
        context.close();

    }
}
