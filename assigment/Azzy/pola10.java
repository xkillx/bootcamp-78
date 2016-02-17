package com.xsis.pola;

public class pola10{
	public void show(){
		int n = 9;
		//int c = 6;
		for(int i = 1; i<=n;i++){
			for(int l = 1; l<=n-i;l++){
				System.out.print(" ");
			}
			for(int j = i; j>=1; j--){
				//int b = j%2;
				System.out.print(j);
			}
			System.out.println();
		}
	}
}