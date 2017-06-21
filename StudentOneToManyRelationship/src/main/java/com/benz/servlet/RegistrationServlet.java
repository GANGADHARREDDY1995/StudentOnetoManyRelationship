package com.benz.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.benz.entity.Student;
import com.benz.entity.StudentAddress;
import com.benz.service.StudentService;

public class RegistrationServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Date dateFormat = null;
		String date = request.getParameter("date");
		SimpleDateFormat format = new SimpleDateFormat("mm-dd-yyyy");
		try {
			dateFormat = format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String name = request.getParameter("name");
		String father = request.getParameter("father");
		String mother = request.getParameter("mother");
		int addmissionClass = Integer.parseInt(request
				.getParameter("admissionClass"));
		String source = request.getParameter("source");
		long mobileNumber = Long
				.parseLong(request.getParameter("mobile"));

		StudentAddress address = new StudentAddress(
				request.getParameter("doorNumber"),
				request.getParameter("street"), request.getParameter("area"),
				request.getParameter("mandal"),
				request.getParameter("district"), 
				Integer.parseInt(request
						.getParameter("pincode")));
		
		Student student = new Student(name, father, address, mother,
				dateFormat, addmissionClass, source, mobileNumber);
		
		StudentService service=StudentService.getStudentService();
		service.getStudentInsertOparation(student);
		
		

	}
}
