package com.luv2code.springdemo.beanlifecycle;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

public class PingPongCoach implements Coach, BeanLifecycle {
	
	private FortuneService fortuneService;
	
	public PingPongCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	@Override
	public void onInit() {
		System.out.println("PingPongCoach#onInit()");
	}

	@Override
	public void onDestroy() {
		System.out.println("PingPongCoach#onDestroy()");
		
	}

}
