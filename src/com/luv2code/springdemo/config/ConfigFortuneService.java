package com.luv2code.springdemo.config;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.FortuneService;

@Component
public class ConfigFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "ConfigFortuneService#getFortune()";
	}

}
