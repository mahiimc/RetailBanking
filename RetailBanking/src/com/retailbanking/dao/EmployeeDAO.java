package com.retailbanking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.retailbanking.beans.Employee;
import com.retailbanking.util.DataBaseUtil;

public class EmployeeDAO {

	public  Employee getEmployee(String username , String password) throws SQLException {
		Connection connection = DataBaseUtil.openConnection();
		PreparedStatement ps =connection.prepareStatement("select e1.EMP_ID,e1.EMP_NAME,e2.ROLE from BankEmployee e1,ROLES e2 Where EMP_USERNAME = ? and EMP_PASSWORD=? and e1.emp_role=e2.id ");
		ps.setString(1,username);
		ps.setString(2, password);
		ResultSet rs =ps.executeQuery();
		Employee e = null;
		if(rs.next()) {
			e= new Employee();	
			e.setId(rs.getInt("EMP_ID"));
			e.setName(rs.getString("EMP_NAME"));
			e.setRole(rs.getString("ROLE"));
			
		}
		connection.close();
		return e;	
	}

}