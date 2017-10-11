package com.java.example.inheritance;

public class Test_1 {
	
	int baris= 0;
	int kolom=0;
	String[][] data;
	
	public int getMaxWidth(int n){
		
		int result = 0;
		for(int i = n; i > 0; i--){
			result = result + i;
		}
		
		return result;
	}
	
	public int getMaxHeigth(int n){
		return n;
	}
	
	public void setDataArray(int n){
		this.baris = getMaxHeigth(n);
		this.kolom = getMaxWidth(n);
		
		data = new String[this.baris][this.kolom];
		int cond_1 = 0;
		int cond_2 = 0;
		int loop = n;
		int loop2 = n + 1;
		for(int bangun = 0; bangun < n; bangun++){
			for(int i = 0; i < baris; i++){
				for(int j = 0; j < kolom; j++){
					if(i - j >= -cond_1 && j >= cond_2 && (j == cond_2 || i - j == -cond_1)){
						data[i][j] = "#";
					}
				}
			}
			/*System.out.println("cod 1 : "+ cond_1 );
			System.out.println("cod 2 : "+ cond_2 );*/
			
			loop--;
			loop2--;
			cond_1 = cond_1 + loop; 
			cond_2 = cond_2 + loop2;
			
		}
		
		/*for(int i = 0; i < baris; i++){
			for(int j = 0; j < kolom; j++){
				if(i - j >= 0 && j >= 0 && (j == 0 || i - j == 0) ){
					data[i][j] = "#";
				}
			}
		}
		
		for(int i = 0; i < baris; i++){
			for(int j = 0; j < kolom; j++){
				if(i - j >= -3 && j >= 4 && (j == 4 || i - j == -3) ){
					data[i][j] = "@";
				}
			}
		}
		
		for(int i = 0; i < baris; i++){
			for(int j = 0; j < kolom; j++){
				if(i - j >= -5 && j >= 7 && (j == 7 || i - j == -5)){
					data[i][j] = "@";
				}
			}
		}
		
		for(int i = 0; i < baris; i++){
			for(int j = 0; j < kolom; j++){
				if(i - j >= -6 && j >= 9){
					data[i][j] = "%";
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
		Test_1 test = new Test_1();
		test.getDataArray(5);
	}

}
