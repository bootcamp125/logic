package com.xsis.training125.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
    @Column(name="NAME", nullable=false)
	private String name;
	private String address;
	@Column(unique=true)
	private String email;
	private Double salary;
	@Column(name="birth_day")
	
	@Temporal(TemporalType.DATE)
	private Date birthDay;
	
	public Employee(){}
	
	public Employee(int id, String name, String address, String email, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.salary = salary;
	}
	
	public Date getBirthDay() {
		return birthDay;
	}
	
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}
