package com.xsis.pola;

public class pola7{
	public void show(){
		int n = 7;
		for(int i = 1; i<=n;i++){
			for(int j = 1; j<=i; j++){
				System.out.print(j);
			}
			
			for(int k = n; k>i; k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}