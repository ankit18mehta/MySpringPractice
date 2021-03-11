package com.am.springdemo;

import org.springframework.stereotype.Component;

@Component
public class LuckyNumberFortuneService implements FortuneService {

    public String getFortune() {
        return "Your Lucky Number Is 7";
    }

}
