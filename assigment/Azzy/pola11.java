package com.xsis.pola;

public class pola11{
	public void show(){
		int n = 11;
		//int c = 6;
		int j;
		for(int i = 1; i<=n;i++){
			int k = (i+1)%2;
			System.out.print("1 ");
			for(int l = 1; l<=n-i;l++){
				k += 2;
				System.out.print(pangkat(k)+" ");
			}
			System.out.println();
		}
	}
	
	public static int pangkat(int p){
		int hasil = p*p;
		return hasil;
	}
}