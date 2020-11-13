package com.luv2code.springdemo.beanannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

@Component
public class AnnotationPingPongCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public AnnotationPingPongCoach() {
		System.out.println("AnnotationPingPongCoach() constructor called.");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		return "Your Ping Pong daily fortune is " + this.fortuneService.getFortune();
	}

	@Autowired
	public void notASetterMethodWithMultipleParameter(FortuneService fortuneService, FortuneService fortuneService2) {
		System.out.println("notASetterMethodWithMultipleParameter() called.");
		System.out.println("is equal=" + (fortuneService == fortuneService2));
		this.fortuneService = fortuneService;
	}

	@Autowired
	public void notASetterMethodWithMultipleParameter2(FortuneService fortuneService) {
		System.out.println("notASetterMethodWithMultipleParameter2() called.");
	}

	@Autowired
	public void notASetterMethodWithMultipleParameter3(FortuneService fortuneService) {
		System.out.println("notASetterMethodWithMultipleParameter3() called.");
		this.fortuneService = fortuneService;
	}

}
