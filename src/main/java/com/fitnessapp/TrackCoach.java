package com.fitnessapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	// Field Injection
	// @Autowired
	// @Qualifier("dietFortuneService")
	private FortuneService fortuneService;

//	// Constructor Injection
//	@Autowired
//	public TrackCoach(@Qualifier("dietFortuneService") FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

//	// Any Method Injection
//	@Autowired
//	public void anyMethod(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	// Setter Injection
	@Autowired
	public void setFortuneService(@Qualifier("dietFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
