package com.benz.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.benz.entity.Student;
import com.benz.entity.StudentAddress;

public class HibernateConfig {
	private static Session session = null;

	public static Session getHibernateConfig() {
		if (session == null) {
			System.out.println("calling create new session");
			Configuration configuration = new Configuration()
					.setProperty("hibernate.dialect",
							"org.hibernate.dialect.Oracle10gDialect")
					.setProperty("hibernate.connection.driver_class",
							"oracle.jdbc.driver.OracleDriver")
					.setProperty("hibernate.connection.url",
							"jbdc:oracle:thin:@localhost:1521:xe")
					.setProperty("hibernate.connection.username", "practice")
					.setProperty("hibernate.connection.password", "varun")
					.setProperty("hibernate.hbm2ddl.auto", "update")
					.setProperty("hibernate.show_sql", "true")
					.addAnnotatedClass(Student.class)
					.addAnnotatedClass(StudentAddress.class);

			return configuration.buildSessionFactory()
					.openSession();
			

		}
		System.out.println("calling existing session ");
		return session;
	}

}
