package com.luv2code.springdemo;

public class BasketballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "10mins jmping jack";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
}
