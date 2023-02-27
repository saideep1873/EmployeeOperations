package org.bluetree.demo.ems.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import org.bluetree.demo.ems.entity.Employee;
import org.bluetree.demo.ems.repository.EmployeeRepository;
import org.bluetree.demo.ems.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	// handler method to handle list students and return mode and view

	@GetMapping("/employees")
	public String listEmployees(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployees());
		return "employees";
	}

	@GetMapping("/employees/new")
	public String createEmployeeForm(Model model) {

		// create student object to hold student form data
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "employeecreation";

	}

	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute("employees") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}

	@GetMapping("/employees/edit/{id}")
	public String editEmployeeForm(@PathVariable Long id, Model model) {
		model.addAttribute("employee", employeeService.getEmployeeById(id));
		return "editemployees";
	}

	@PostMapping("/employees/{id}")
	public String updateEmployee(@PathVariable Long id, @ModelAttribute("employee") Employee employee, Model model) {

		// get student from database by id
		Employee existingEmployee = employeeService.getEmployeeById(id);
		existingEmployee.setId(id);
		existingEmployee.setEmployeename(employee.getEmployeename());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setDateofbirth(employee.getDateofbirth());
		existingEmployee.setAge(employee.getAge());
		existingEmployee.setSalary(employee.getSalary());
		existingEmployee.setStatus(employee.getStatus());

		// save updated student object
		employeeService.updateEmployee(existingEmployee);
		return "redirect:/employees";
	}

	// handler method to handle delete student request

	@GetMapping("/employees/{id}")
	public String deleteEmployees(@PathVariable Long id) {
		employeeService.deleteEmployeeById(id);
		return "redirect:/employees";
	}
	
	

}
