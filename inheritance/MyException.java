package com.java.example.inheritance;

public class MyException {
	
	//pembahasan try catch
	Double dana = 3.0;  //class reference
	double dana2 = 4.0; //tipe data primitive
	
	Integer dana3;
	int dana4;
	
	long dana5;
	Long dana6;
	
	/*
	 * throw exception 
	 * try catch exception
	 * */
	
	public void myExample() throws Exception{
		String[] data = new String[3];
		//try{
			data[0] = "jakarta";
			data[1] = "surabaya";
			data[2] = "solo";
			data[3] = "bandung";
		/*} catch(Exception e){
			e.printStackTrace();
		}*/
		
		
	}
	
	public static void main(String args[]){
	
		try {
			MyAbstractClass ma = new PersistanceA();
			MyAbstractClass ma2 = new PersistanceB();
			ma.save();
			ma.saveDefault();
			ma2.save();
			ma.saveDefault();
			
			System.out.println("database interface : "+ 
								MyPersitanceInterface.PERSISTANCE_NAME);
			//new MyException().myExample();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("horeey!!");
	}

}
