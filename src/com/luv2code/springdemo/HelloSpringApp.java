package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach basketballCoach = context.getBean("basketballCoach", Coach.class);
		Coach trackCoach = context.getBean("trackCoach", Coach.class);

		System.out.println("basketballCoach=" + basketballCoach.getDailyFortune());
		System.out.println("trackCoach=" + trackCoach.getDailyFortune());
		
		context.close();
	}
}
