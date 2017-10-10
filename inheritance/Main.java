package com.java.example.inheritance;

public class Main {
	Employee emp1, emp2, emp3, emp4; 
	Manager manager;
	Admin admin;
	
	public void example(){
		emp1 = new Employee();
		emp1.setName("aldi employee");
		emp1.setEmail("aldi@yahoo.com");
		emp1.setBonus(5000.0);
		
		//polimorphism
		emp2 = new Manager();
		emp2.setName("Giri manager");
		emp2.setAddress("giri@yahoo.com");
		emp2.setBonus(5000.0);
		
		Manager dirMan = new Director();
		dirMan.getAllowance(5000.0, "A");
		
		/*manager = (Manager) new Employee();
		manager.setName("mng employee");
		manager.setEmail("mng@yahoo.com");*/
		
		System.out.println("name emp1 : "+ emp1.getName());
		System.out.println("bonus emp1 : "+ emp1.getBonus());
		
		System.out.println("name emp2 : "+ emp2.getName());
		System.out.println("bonus emp2 : "+ emp2.getBonus());
		
		//System.out.println("name manager : "+ manager.getName());
		
	}
	
	public static void main(String[] args){
		
		new Main().example();
	}

}
