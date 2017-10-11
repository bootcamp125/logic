package com.java.example.inheritance;

public class Test_4 {
	
	int baris= 0;
	int kolom=0;
	String[][] data;
	
	public int getMaxWidth(int n){		
		return n*n;
	}
	
	public int getMaxHeigth(int n){
		return n*n;
	}
	
	public void setDataArray(int n){
		this.baris = getMaxHeigth(n);
		this.kolom = getMaxWidth(n);
		
		data = new String[this.baris][this.kolom];
		int addBlock = 0;
		for(int block = 0; block < n; block++){
			int addBangun = 0;
			for(int bangun = 0; bangun < n; bangun++){
				for(int i = 0; i < n; i++){
					for(int j = 0; j < n; j++){
						if(j == 0 || i == 0 || i == n - 1 || j == n - 1){
							if(block == 0 || bangun == 0 || block == n-1 || bangun == n - 1){
								data[i + addBangun][j+addBlock] = "*";
							}
						}
						
					}
				}
				addBangun = addBangun + n;
			}
			addBlock = addBlock + n;
		}
		
	}
	
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
		Test_4 test = new Test_4();
		test.getDataArray(4);
	}

}
