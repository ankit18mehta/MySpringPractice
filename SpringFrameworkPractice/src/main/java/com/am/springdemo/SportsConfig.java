package com.am.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.am.springdemo")
public class SportsConfig {

    @Bean
    public Coach trackCoach() {
        TrackCoach trackCoach = new TrackCoach();
        return trackCoach;
    }

    @Bean
    public Coach baseballCoach() {
        BaseballCoach baseballCoach = new BaseballCoach(happyFortuneService());
        return baseballCoach;
    }

    @Bean
    public Coach myCricketCoach() {
        CricketCoach myCricketCoach = new CricketCoach();
        return myCricketCoach;
    }

    @Bean
    public FortuneService happyFortuneService() {
        HappyFortuneService happyFortuneService = new HappyFortuneService();
        return happyFortuneService;
    }

    @Bean
    public FortuneService luckyNumberFortuneService() {
        LuckyNumberFortuneService luckyNumberFortuneService = new LuckyNumberFortuneService();
        return luckyNumberFortuneService;
    }

}
