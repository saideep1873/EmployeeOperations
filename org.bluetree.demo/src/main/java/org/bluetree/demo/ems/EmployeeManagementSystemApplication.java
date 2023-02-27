package org.bluetree.demo.ems;

import org.bluetree.demo.ems.repository.EmployeeRepository;	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
	
	}

}
