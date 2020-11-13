package com.luv2code.springdemo.beanannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanAnnotation-applicationContext.xml");
		
		Coach theCoach = context.getBean("theCoach", AnnotationPingPongCoach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
