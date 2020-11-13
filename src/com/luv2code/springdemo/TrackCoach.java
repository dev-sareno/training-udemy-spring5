package com.luv2code.springdemo;

import java.util.Random;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	private long timestamp;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		this.timestamp = new Random().nextInt(Integer.MAX_VALUE);
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it! " + this.fortuneService.getFortune();
	}

	public long getTimestamp() {
		return timestamp;
	}

}
