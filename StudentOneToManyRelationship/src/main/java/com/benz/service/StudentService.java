package com.benz.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.benz.entity.Student;
import com.benz.util.HibernateConfig;




public class StudentService {

	Session session = HibernateConfig.getHibernateConfig();
	
	private static StudentService studentService = null;

	private StudentService() {

	}

	public static StudentService getStudentService() {
		if (studentService == null) {
			studentService = new StudentService();
		}
		return studentService;

	}

	public void getStudentInsertOparation(Student student) {
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.save(student);
		transaction.commit();

	}

}