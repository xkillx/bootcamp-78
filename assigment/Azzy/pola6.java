package com.xsis.pola;

public class pola6{
	public void show(){
		int n = 5;
		for(int i = 1; i<=n;i++){
			for(int j = 1; j<i; j++){
				System.out.print("  ");
			}
			for(int k = 0+i; k<=n*2-i;k++){
				System.out.print(k+" ");
				//j++;
			}
			System.out.println();
		}
	}
}