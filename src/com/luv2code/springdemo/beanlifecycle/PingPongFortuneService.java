package com.luv2code.springdemo.beanlifecycle;

import com.luv2code.springdemo.FortuneService;

public class PingPongFortuneService implements FortuneService, BeanLifecycle {

	@Override
	public String getFortune() {
		return "This is your Ping Pong fortune service!";
	}

	@Override
	public void onInit() {
		System.out.println("PingPongFortuneService#onInit()");
	}

	@Override
	public void onDestroy() {
		System.out.println("PingPongFortuneService#onDestroy()");
		
	}

}
