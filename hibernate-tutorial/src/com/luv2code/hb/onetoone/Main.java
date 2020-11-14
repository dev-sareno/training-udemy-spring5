package com.luv2code.hb.onetoone;

import java.util.List;

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

			/*
			// Create 3 Instructor and Instructor detail
			for (int i = 0; i < 3; i++) {
				session = sessionFactory.getCurrentSession();
				
				long epoch = System.currentTimeMillis();
				Instructor tmpInstructor = new Instructor("John." + epoch, "Doe." + epoch, "jdoe" + epoch + "@example.com");
				InstructorDetail tmpInstructorDetail = new InstructorDetail("www.youtube.com/" + epoch, "coding java " + epoch);
				tmpInstructor.setInstructorDetail(tmpInstructorDetail);

				session.beginTransaction();
				
				session.save(tmpInstructor);
				
				session.getTransaction().commit();
				
				System.out.println("Instructor saved!");
			}
			 */
			
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			List<InstructorDetail> resultList = session.createQuery("from InstructorDetail", InstructorDetail.class)
					.getResultList();
			
			session.getTransaction().commit();
			
			if (!resultList.isEmpty()) {
				InstructorDetail instructorDetail = resultList.get(0);
				System.out.println("Got an instructor detail. id=" + instructorDetail.getId());

				session = sessionFactory.getCurrentSession();
				
				session.beginTransaction();
				
				session.delete(instructorDetail);
				
				session.getTransaction().commit();
				
				System.out.println("Successfully deleted an instructor detail. id=" + instructorDetail.getId());
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			sessionFactory.close();
		}
	}

}
