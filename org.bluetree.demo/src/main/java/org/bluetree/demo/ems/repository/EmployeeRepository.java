package org.bluetree.demo.ems.repository;

import org.bluetree.demo.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
