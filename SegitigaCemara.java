package com.java.loglic.custome;

public class CustomeSegitiga {

	private int dimX = 0;
	private int dimY = 0;
	private String[][] data;
	
	public void setDataArray(int input, int n2){
		this.dimX = input * n2;
		this.dimY = ((input+1)/2)*n2;
		data = new String[dimY][dimX];
		int baris = ((input+1)/2);
		System.out.println("baris : "+ baris);
		int inc = 0;
		for(int bidangY = 0; bidangY < n2; bidangY++){
			int inc2 = 0;
			for(int bidangX = 0; bidangX < n2; bidangX++){
				for(int i = 0; i < this.dimY; i++){
					for(int j = 0; j < this.dimX; j++){
						if(i + j >= input - (input/2 +1) && i > j - input/2 - 1 && i <= (input)/2){
							data[i+inc][j+inc2] =  "*";
						} 
					}
				}
				inc2 = inc2 + input;
			}
			inc=inc+baris;
		}
		
		
	}
	
	public void showDataArray(int input, int n2){
		setDataArray(input, n2);
		
		for(int i = 0; i < dimY; i++){
			for(int j = 0; j < dimX; j++){
				System.out.print(this.data[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String args[]){
		CustomeSegitiga soal = new CustomeSegitiga();
		soal.showDataArray(5, 3);
	}
}
