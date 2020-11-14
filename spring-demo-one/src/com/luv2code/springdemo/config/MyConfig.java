package com.luv2code.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

@Configuration
@PropertySource("classpath:sport.properties")
public class MyConfig {
	
	@Bean
	public FortuneService tennisFortuneService() {
		return new ConfigFortuneService();
	}

	@Bean
	public Coach tennisCoach() {
		return new ConfigTennisCoach();
	}
	
}
