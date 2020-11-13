package com.luv2code.springdemo.config;

import org.springframework.beans.factory.annotation.Value;

import com.luv2code.springdemo.FortuneService;

public class ConfigFortuneService implements FortuneService {
	
	@Value("${config.fortune}")
	String fortune;

	@Override
	public String getFortune() {
		return this.fortune;
	}

}
