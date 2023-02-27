package org.bluetree.demo.ems.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "employeename", nullable = false)
	private String employeename;
	
	@Column(name = "email", nullable =false)
	private String email;
	
	@Column(name = "dateofbirth", nullable=false)
	private Date dateofbirth;
	
	@Column(name = "age")
	private int age;
	
	@Column(name="salary" , nullable=false)
	private int salary;
	
	@Column(name ="status", nullable =false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean status;
	
	

	public Employee(Long id, String employeename, String email, Date dateofbirth, int age, int salary, boolean status) {
		super();
		this.id = id;
		this.employeename = employeename;
		this.email = email;
		this.dateofbirth = dateofbirth;
		this.age = age;
		this.salary = salary;
		this.status=status;
		
	}

	public Employee() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	

	


	
	
	
}
	
