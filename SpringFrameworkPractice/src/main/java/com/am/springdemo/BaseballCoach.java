package com.am.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired

    public BaseballCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        super();
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return fortuneService.getFortune();
    }

}
