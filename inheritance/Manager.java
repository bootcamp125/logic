package com.java.example.inheritance;

public class Manager extends Employee{
	
	@Override
	public void setBonus(Double bonus) { //5000
		// TODO Auto-generated method stub
		super.setBonus(bonus);
	}

	@Override
	public Double getBonus() {
		// TODO Auto-generated method stub
		return super.getBonus() * 2;
	}
	
	//over loading
		public void getAllowance(Double data){
			System.out.println("uang : "+ data);
		}
		
		public void getAllowance(Double data, String a){
			if(a.equals("A")){
				System.out.println("uang : "+ data * 2);
			} else {
				System.out.println("uang : "+ data);
			}
		}
}
