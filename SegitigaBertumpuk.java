package com.java.loglic.custome;

public class SegitigaBertumpuk {
	int baris = 3;
	int kolom = 3;
	String[][] data;
	/*
	 * 1 = 1
	 * 2 = 4
	 * 3 = 9
	 * */
	
	public int getMaxY(int n){
		int res = 0;
		for(int i = 1; i <=n; i++){
			res = res + i;
		}
		
		return  res;
	}
	
	public int getSlice(int n){
		int res = 0;
		res = 0 + (n-1)*3 +(n - 1)*(n - 2)*3 / 2; 
		return res;
	}
	
	public void setDataArray(int n){
		
		this.baris = getMaxY(n);
		this.kolom = n*n;
		data = new String[this.baris][this.kolom];
		
		int a = 0;
		for(int bangun = 1; bangun <= n; bangun++ ){
			int start = getMaxY(bangun - 1);
			int end = getMaxY(bangun);
			int startJ = a * a;
			int endJ = bangun * bangun;
	
			for(int i =start; i < end; i++){
				for(int j=startJ; j< endJ; j++){
					if(i >= j - start && i + j >= getSlice(bangun)){
						data[i][j] = "@";
					}
					
				} 
			}
			a++;
		}
		
		
		
		/*for(int i =0; i < 1; i++){
			for(int j=0; j< 1; j++){
				data[i][j] = "s";
			}
		}
		
		for(int i =1; i < 3; i++){
			for(int j=1; j<4; j++){
				data[i][j] = "s2";
			}
		}
		
		for(int i =3; i < 6; i++){
			for(int j=4; j<9; j++){
				
					data[i][j] = "s3";
				} 
			}
		}*/
		
		showData();
	}

	public void showData(){
		for(int i =0; i < this.baris; i++){
			for(int j=0; j< this.kolom; j++){
				
				System.out.print(data[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args){
		SegitigaBertumpuk segitigaBertumpuk = new SegitigaBertumpuk();
		segitigaBertumpuk.setDataArray(4); 
	}

}
