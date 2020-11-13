package com.luv2code.springdemo.beanannotation;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Coach;
//import com.luv2code.springdemo.FortuneService;

@Component("theCoach")
public class AnnotationPingPongCoach implements Coach {
	
//	private FortuneService fortuneService;
//
//	public AnnotationPingPongCoach(FortuneService fortuneService) {
//		super();
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		return "Ping Pong coach | Using annotation";
	}

//	public FortuneService getFortuneService() {
//		return fortuneService;
//	}
//
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

}
