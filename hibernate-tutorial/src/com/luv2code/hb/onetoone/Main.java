package com.luv2code.hb.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session;
		
		try {
			session = sessionFactory.getCurrentSession();

			Instructor tmpInstructor = new Instructor("InsJohn", "InsDoe", "insjdoe@example.com");
			InstructorDetail tmpInstructorDetail = new InstructorDetail("www.youtube.com/hb", "coding java");
			tmpInstructor.setInstructorDetail(tmpInstructorDetail);

			session.beginTransaction();
			
			session.save(tmpInstructor);
			
			session.getTransaction().commit();
			
			System.out.println("Instructor saved!");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			sessionFactory.close();
		}
	}

}
