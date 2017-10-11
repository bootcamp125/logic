package com.java.example.inheritance;

public class Test_6 {
	
	int baris= 0;
	int kolom=0;
	String[][] data;
	
	public int getMaxWidth(int n, int n2){		
		return n*n2;
	}
	
	public int getMaxHeigth(int n, int n2){
		return n*n2;
	}
	
	public void setDataArray(int n, int n2){
		this.baris = getMaxHeigth(n, n2);
		this.kolom = getMaxWidth(n, n2);
		
		data = new String[this.baris][this.kolom];
		int addBlock = 0;
		for(int block = 0; block < n2; block++){
			int addBangun = 0;
			for(int bangun = 0; bangun < n2; bangun++){
				for(int i = 0; i < n; i++){
					for(int j = 0; j < n; j++){
						if(j == 0 || i == 0 || i == n - 1 || j == n - 1){
							if(bangun == 0 || bangun - block == 0 || block == n2 - 1){
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
	
	public void getDataArray(int n,int n2){
		this.setDataArray(n, n2);
		for(int i = 0; i < baris; i++){
			for(int j = 0; j < kolom; j++){
				System.out.print(data[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	
	public static void main(String args[]){
		Test_6 test = new Test_6();
		test.getDataArray(3, 4);
	}

}
