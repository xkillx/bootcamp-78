package com.xsis.pola;

public class pola17 {
	public void show(){
		int a = 9;
		
		for (int i = 1; i <= a; i++){			
			for (int k = a; k >= i; k--){
				System.out.print("+");
			}
			
			for (int j = 1; j < i; j++){
				System.out.print(" ");
			}
			
			for (int k = a; k >= i; k--){
				System.out.print("+");
			}
			
		System.out.println();
		}
	}
}
