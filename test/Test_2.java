package com.java.example.inheritance;

public class Test_2 {
	
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
		
		int startI = 0;
		int endI = n;
		int ab = 2;
		for(int bangun = 0; bangun < n; bangun++){
			for(int i = startI; i < endI; i++){
				for(int j = startI; j < endI; j++){
					if(i == startI || j == startI || i == endI - 1 || j == endI - 1 || (i == ab && j == ab - 1)){
						if(i != ab - 1 || j != startI ){
							data[i][j] = "*";
						}
					}
				}
			}
			
			startI = startI + 2;
			endI = endI - 2;
			ab = ab + 2;
		}
		
		/*for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				if(i == 0 || j == 0 || i == 8 || j == 8 || (i == 2 && j == 1)){
					if(i != 1 || j != 0 ){
						data[i][j] = "*";
					}
				}
			}
		}
		
		for(int i = 2; i < 7; i++){
			for(int j = 2; j < 7; j++){
				if(i == 2 || j == 2 || i == 6 || j == 6 || (i == 4 && j == 3)){
					if( i != 3 || j != 2){
						data[i][j] = "#";
					}
					
				}
			}
		}
		
		for(int i = 4; i < 5; i++){
			for(int j = 4; j < 5; j++){
				if(i == 4 || j == 4 || i == 4 || j == 4 || (i == 6 && j == 5)){
					if( i != 5 || j != 4){
						data[i][j] = "%";
					}
				}
			}
		}*/
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
		Test_2 test = new Test_2();
		test.getDataArray(9);
	}

}
