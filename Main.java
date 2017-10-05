package com.java.teori;

public class Main {

	public static void main(String args[]){
		//instansiasi / instance / perwujudan
		String name = "adi 2";
		Double salary = 60000.0;
		String address = "jakarta selatan";
		
		/*Employee employee = new Employee();
		employee.setName(name);
		employee.setAddress(address);*/
		
		Employee employee2 = new Employee();
		employee2.setAge(5);
		
		employee2.info();
	}
}
