package com.luv2code.springdemo.beanannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

@Component
public class AnnotationPingPongCoach implements Coach {
	
	private FortuneService fortuneService;

	@Autowired
	public AnnotationPingPongCoach(FortuneService fortuneService, FortuneService fortuneService2) {
		super();
		this.fortuneService = fortuneService;
		System.out.println(fortuneService == fortuneService2);
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

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
