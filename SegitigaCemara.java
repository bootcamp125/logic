package com.java.logic.day5;

public class SegitigaCemara {

	int baris = 0;
	int kolom = 0;
	String[][] data;
	
	public int getMaxArea(int n){
		int max = 0;
		for(int i = 1; i <= n; i++){
			max = max + i;
		}
		
		return max;
	}
	
	public void setDataArray(int n){
		this.baris = getMaxArea(n);
		this.kolom = getMaxArea(n);
		data = new String[this.baris][this.kolom];
		
		int start=0;
		int end = 0;
		for(int bangun = 1; bangun <= n; bangun++){
			end = end + bangun;
			for(int i = start; i < end; i++){
				for(int j = start;j < end; j++){
					data[i][j] = "*";
				}
			}
			start = start + bangun;
		}
		
		/*
		for(int i = 0 + 1 ; i < 1 + 2; i++){
			for(int j = 0 + 1;j < 1 + 2; j++){
				data[i][j] = "*";
			}
		}*/
		
		/*for(int i = 0 + 1 + 2; i < 1 + 2 + 3; i++){
			for(int j = 0 + 1 + 2;j < 1 + 2 + 3; j++){
				data[i][j] = "*";
			}
		}*/
		
		showDataArray();
	}
	
	
	public void showDataArray(){
		for(int i = 0; i < baris; i++){
			for(int j = 0; j < kolom; j++){
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		SegitigaCemara cClass= new SegitigaCemara();
		try{
			cClass.setDataArray(5);
		}catch(Exception e){
			System.out.println("harus menggunakan format ganjil");
		}
		
	}
}
