package com.retailbanking.util;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.retailbanking.beans.Employee;
import com.retailbanking.dao.EmployeeDAO;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/login")
public class LoginUtility extends HttpServlet {
	
	
	public void doPost(HttpServletRequest request ,HttpServletResponse response) throws IOException, ServletException {
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		String source = request.getParameter("source");
		if(source.equals("login") && uname != null && pass != null) {
			EmployeeDAO employee = new EmployeeDAO();
			String redirectTo="index.jsp";
			
			try {
				Employee emp = employee.getEmployee(uname,pass);
				System.out.println(emp);
				if(emp != null) {
					HttpSession session = request.getSession();
					session.setAttribute("emp",emp);
					redirectTo="HomePage.jsp";
				}
				else {
					String message = "Invalid email/password";
	                request.setAttribute("message", message);
	    
				}
				
				RequestDispatcher dispatcher = request.getRequestDispatcher(redirectTo);
				dispatcher.forward(request, response);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	

}
