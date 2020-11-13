package com.luv2code.springdemo.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.Coach;

public class Main {

	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(MyConfig.class);
		
		Coach coach = context.getBean(ConfigTennisCoach.class);
		
		System.out.println(coach.getDailyFortune());
		
		context.close();

	}

}
