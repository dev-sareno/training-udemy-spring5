package com.luv2code.springdemo.config;

import com.luv2code.springdemo.FortuneService;

public class ConfigFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "ConfigFortuneService#getFortune()";
	}

}
