package org.bluetree.demo.ems.service.impl;

import java.util.List;		

import org.bluetree.demo.ems.entity.Employee;
import org.bluetree.demo.ems.repository.EmployeeRepository;
import org.bluetree.demo.ems.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public  class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);	
	}
	
	

	

}
