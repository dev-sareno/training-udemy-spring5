package com.luv2code.springdemo.beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach theCoach = context.getBean("theCoach", PingPongCoach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
