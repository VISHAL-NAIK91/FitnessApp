package com.fitnessapp;

import org.springframework.stereotype.Component;

@Component
public class DietFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Eat 6 Eggs Daily";
	}

}
