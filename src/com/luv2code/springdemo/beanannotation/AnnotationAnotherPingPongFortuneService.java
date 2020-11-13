package com.luv2code.springdemo.beanannotation;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.FortuneService;

@Component
public class AnnotationAnotherPingPongFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Fortune from AnnotationAnotherPingPongFortuneService()";
	}

}
