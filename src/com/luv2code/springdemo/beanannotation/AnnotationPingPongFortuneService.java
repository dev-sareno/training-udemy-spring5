package com.luv2code.springdemo.beanannotation;

import com.luv2code.springdemo.FortuneService;

public class AnnotationPingPongFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Ping Pong coach | Using annotation";
	}

}
