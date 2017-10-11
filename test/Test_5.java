package com.java.example.inheritance;

public class Test_5 {
	
	int baris= 0;
	int kolom=0;
	String[][] data;
	
	public int getMaxWidth(int n){
		return n;
	}
	
	public int getMaxHeigth(int n){
		return n;
	}
	
	public void setDataArray(int n){
		this.baris = getMaxHeigth(n);
		this.kolom = getMaxWidth(n);
		
		data = new String[this.baris][this.kolom];
		int a = 0;
		for(int i = 0; i < baris; i++){
			a = a + 2;
			for(int j = 0; j < kolom; j++){
				if(i - j == 0 || j == 0 || i == n - 1 ){
					data[i][j] = a + "";
				}
			}
		}
		
	};
	
	
	
	public void getDataArray(int n){
		this.setDataArray(n);
		for(int i = 0; i < baris; i++){
			for(int j = 0; j < kolom; j++){
				System.out.print(data[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	
	public static void main(String args[]){
		Test_5 test = new Test_5();
		test.getDataArray(5);
	}

}
