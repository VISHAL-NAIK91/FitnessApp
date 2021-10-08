package com.fitnessapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class FitnessAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(FitnessAppApplication.class, args);

	ConfigurableApplicationContext context = SpringApplication.run(SportConfig.class);

		Coach theCoach = context.getBean("baseballCoach",Coach.class);
		
		//Coach theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	}

}
