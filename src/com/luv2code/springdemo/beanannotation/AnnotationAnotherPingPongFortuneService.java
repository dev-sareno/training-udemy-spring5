package com.luv2code.springdemo.beanannotation;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.FortuneService;

@Component
public class AnnotationAnotherPingPongFortuneService implements FortuneService {
	
	@Value("${foo.fortunes}")
	private String fortunes;

	@Override
	public String getFortune() {
		return this.fortunes.split("\\u007C")[new Random().nextInt(this.fortunes.split("\\u007C").length)];
	}

}
