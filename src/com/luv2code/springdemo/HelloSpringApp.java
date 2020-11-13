package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach cricketCoach = context.getBean("cricketCoach", Coach.class);

		System.out.println("cricketCoach=" + cricketCoach.getDailyFortune());
		
		context.close();
	}
}
