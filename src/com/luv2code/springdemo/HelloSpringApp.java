package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		System.out.println("emailAddress=" + cricketCoach.getEmailAddress());
		System.out.println("team=" + cricketCoach.getTeam());
		
		context.close();
	}
}
