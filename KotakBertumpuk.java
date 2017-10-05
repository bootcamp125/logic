package com.java.loglic.custome;

public class KotakBertumpuk {

	int baris = 0;
	int kolom = 0;
	String[][] data;
	
	public int getMaxArea(int n){
		int res = 0;
		for(int i =1; i <= n; i++){
			res = res + i;
		}
		
		return res;
	}
	
	public void setDataArray(int n){
		this.kolom = getMaxArea(n);
		this.baris = getMaxArea(n);
	    data = new String[this.baris][this.kolom];
	    
	    int loopFromZero = 0;
		for(int bangun = 1; bangun <= n; bangun++){
			int start = getMaxArea(loopFromZero);
			int end = getMaxArea(bangun);
			
			for(int i = start; i < end ; i++){
				for(int j = start; j < end; j++){
					data[i][j] = "*";
				}
			}
			loopFromZero++;
		}
	    
	    
	    /*for(int i = 0 + 1; i < 1 + 2 ; i++){
			for(int j = 0 + 1; j < 1 + 2; j++){
				data[i][j] = "*";
			}
		}
	    
	    for(int i = 0 + 1 + 2; i < 1 + 2 + 3; i++){
			for(int j = 0 + 1 + 2; j < 1 + 2 + 3; j++){
				data[i][j] = "*";
			}
		}*/
		
		showData();
		
	}
	
	public void showData(){
		for(int i = 0; i < this.baris ; i++){
			for(int j = 0; j < this.kolom; j++){
				System.out.print(data[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args){
		KotakBertumpuk kb = new KotakBertumpuk();
		kb.setDataArray(1);
	}
}
