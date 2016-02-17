package com.xsis.pola;

public class pola9{
	public void show(){
		int n = 9;
		//int c = 6;
		for(int i = 1; i<n;i++){
			for(int j = 0; j<i; j++){
				int b = (i+j)%2;
				System.out.print(b);
			}
			System.out.println();
		}
	}
}