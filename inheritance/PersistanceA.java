package com.java.example.inheritance;

public class PersistanceA extends MyAbstractClass 
						implements MyPersitanceInterface {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("saving to persistance A");
	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("get data from persistance A");
	}

	@Override
	public void savingInterface() {
		// TODO Auto-generated method stub
		System.out.println("saving interface from persistance A");
	}

	@Override
	public Employee getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

}
