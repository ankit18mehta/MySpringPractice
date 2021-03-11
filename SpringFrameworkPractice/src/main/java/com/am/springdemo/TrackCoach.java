package com.am.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
        super();
        System.out.println("Inside no-arg Constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Run 5k";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
