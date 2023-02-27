package org.bluetree.demo.ems.service;

import java.util.List;

import org.bluetree.demo.ems.entity.Employee;
import org.springframework.stereotype.Service;
@Service
public interface EmployeeService {
	List<Employee> getAllEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);
}
