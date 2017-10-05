package com.java.teori;

import java.util.Date;

//encapsulation / bean / POJO
public class Employee extends Object {
	
	//empty constructor 
	public Employee(){
		System.out.println("constructor executed!!");
	}
	
	//parameter constructor / overloading constructor => harus berbeda untuk
	//jumlah parameternya atau class referencenya.
	public Employee(String name, String address, int age, String gender, Date birthDay, Double saldo, Double salary) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.birthDay = birthDay;
		this.saldo = saldo;
		this.salary = salary;
	}



	//property
	private String name;
	private String address;
	private int age;
	private String gender;
	private Date birthDay;
	private Double saldo;
	private Double salary;
	
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	//method
	public void info(){
		System.out.println("name : "+ name);
		System.out.println("address : "+ address);
		System.out.println("salary : "+ salary);
	}
}

/*
 *1. buat name object untuk java class
 *2. buat property
 *3. setter dan getter atas property
 *4. constructor kosong
 *5. constructor yang ada parameternya
 * */
