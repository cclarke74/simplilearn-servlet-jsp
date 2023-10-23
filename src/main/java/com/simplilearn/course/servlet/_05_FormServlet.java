package com.simplilearn.course.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet implementation class FormServlet
 */

@WebServlet("/FormServlet")
public class _05_FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
			
			
			
		request.getRequestDispatcher("user_form.jsp").forward(request, response);

			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String birth = request.getParameter("birth");
				
		System.out.println("firstname: " + firstname);
		System.out.println("lastname: " + lastname);
		System.out.println("email: " + email);
		System.out.println("birth: " + birth);
		request.getRequestDispatcher("user_table.jsp").forward(request, response);
		
		
	
	}

}
