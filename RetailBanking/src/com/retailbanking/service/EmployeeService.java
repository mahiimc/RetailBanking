package com.retailbanking.service;

import java.sql.SQLException;

import com.retailbanking.beans.Employee;
import com.retailbanking.dao.EmployeeDAO;

public class EmployeeService {
	EmployeeDAO emp = new EmployeeDAO();

	public Employee getEmployee(String username , String password) throws SQLException {
		return emp.getEmployee(username, password);
	}

}
