package com.luv2code.hibernate.demo.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session;
		
		try {
			
			Student firstStudent = null;
			
			for (int i = 0; i < 2; i++) {
				session = sessionFactory.getCurrentSession();

				long epoch = System.currentTimeMillis();
				Student student = new Student("Fname-" + epoch, "Lname" + epoch, "contact." + epoch + "@gmail.com");

				session.beginTransaction();
				
				session.save(student);
				
				if (firstStudent == null) {
					firstStudent = student;
				}
				
				session.getTransaction().commit();
			}
			
			session = sessionFactory.getCurrentSession();

			session.beginTransaction();
			
			// Delete last inserted Student
			session.delete(firstStudent);
			
			session.getTransaction().commit();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			sessionFactory.close();
		}

	}

}
