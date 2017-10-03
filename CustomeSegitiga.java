package com.java.loglic.custome;

public class CustomeSegitiga {

	private int dimX = 0;
	private int dimY = 0;
	private String[][] data;
	
	public void setDataArray(int input){
		this.dimX = input;
		this.dimY = input;
		
		data = new String[dimY][dimX];
		for(int i = 0; i < dimY; i++){
			for(int j = 0; j < dimX; j++){
				if(i == j){
					this.data[i][j] = "*";
				}
			}
		}
	}
	
	public void showDataArray(int input){
		setDataArray(input);
		
		for(int i = 0; i < dimY; i++){
			for(int j = 0; j < dimX; j++){
				System.out.print(this.data[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String args[]){
		CustomeSegitiga soal = new CustomeSegitiga();
		soal.showDataArray(7);
	}
}
