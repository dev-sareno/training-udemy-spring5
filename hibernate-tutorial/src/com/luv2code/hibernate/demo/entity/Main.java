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
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			long epoch = System.currentTimeMillis();
			
			Student student = new Student("Fname-" + epoch, "Lname" + epoch, "contact." + epoch + "@gmail.com");
			
			session.beginTransaction();
			
			session.save(student);
			
			System.out.println("New student saved!");
			
			
			// Retrieve
			Student fromDb = session.get(Student.class, student.getId());
			
			System.out.println("From db=" + fromDb.getFirstName() + " " + fromDb.getLastName());
			
			
			// Query
			List<Student> allStudents = session.createQuery("from Student", Student.class)
					.getResultList();
			for (int i = 0; i < allStudents.size(); i++) {
				Student iStudent = allStudents.get(i);
				System.out.println("index at " + i + " id=" + iStudent.getId());
			}
			
			
			// Update
			fromDb.setEmail(fromDb.getEmail() + ".ph");
			session.update(fromDb);
			System.out.println("Email is appended with .ph!");
			
			
			session.getTransaction().commit();
			
		} finally {
			sessionFactory.close();
		}

	}

}
