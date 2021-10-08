package com.fitnessapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	// Field Injection
	//@Autowired
//	@Qualifier("dietFortuneService")
	private FortuneService fortuneService;

//	// Constructor Injection
//	@Autowired	
//	public BaseballCoach(@Qualifier("dietFortuneService") FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
//
//	// Any method Injection
//	@Autowired
//	
//	public void anyMethod(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	// Setter Injection
	@Autowired
	
	public void setFortuneService(@Qualifier("dietFortuneService") FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
 	
	
	@Override
	public String getDailyWorkout() {

		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}
}
