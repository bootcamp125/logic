package com.java.logic.day1;

public class CustomeSegitiga {

	private int dimX = 0;
	private int dimY = 0;
	private String[][] data;
	
	public void setCanvas(int input){
		this.dimX = input;
		this.dimY = input/ 2 + 1;
		
		data = new String[dimY][dimX];
		for(int i = 0; i < dimY; i++){
			for(int j = 0; j < dimX; j++){
				if(i == 0 && j == input / 2){
					getPola(data, input);
				}
			}
		}
	}
	
	public String[][] getPola(String[][] data, int n){
		for(int bangun = 0; bangun < n / 2 + 1; bangun++){
			for(int i = 0+ bangun; i < 1+bangun; i++){
				for(int j = (n / 2) -bangun; j < (n / 2 + 1)+bangun; j++  ){
					data[i][j] = "R";
				}
			}
		}
		
		return data;
	}
	
	public void showDataArray(int input){
		setCanvas(input);
		
		for(int i = 0; i < dimY; i++){
			for(int j = 0; j < dimX; j++){
				System.out.print(this.data[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String args[]){
		CustomeSegitiga soal = new CustomeSegitiga();
		try{
			soal.showDataArray(7);
		}catch(Exception e){
			System.out.println("harus bilangan ganjil");
		}
		
	}
}
