package com.luv2code.springdemo.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.TrackCoach;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		TrackCoach theCoach00 = context.getBean("myCoach", TrackCoach.class);
		TrackCoach theCoach01 = context.getBean("myCoach", TrackCoach.class);

		System.out.println("theCoach00 timestamp=" + theCoach00.getTimestamp());
		System.out.println("theCoach01 timestamp=" + theCoach01.getTimestamp());

	}

}
