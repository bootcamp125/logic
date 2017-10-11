package com.java.example.inheritance;

public class Test_3 {
	
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
		int addBangun = -n;
		for(int bangun = 0; bangun < n + 1; bangun++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					if(j == 0 || i == n - 1 || i - j == 0){
						int jk = 0;
						for(int pk =0; pk < bangun; pk++){
							data[i+addBangun][j+jk] = "*";
							jk = jk + n;
						}
					}
				}
			}
			addBangun = addBangun + n;
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
		Test_3 test = new Test_3();
		test.getDataArray(4);
	}

}
