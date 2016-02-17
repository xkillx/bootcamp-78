package com.xsis.pola;

public class pola16 {
	public void show(){
		int a = 9;
		
		for (int i = 1; i <= a; i++){
			for (int j = a; j > i; j--){
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i*2-1; k++){
				System.out.print("+");
			}
			
			for (int j = a; j > i; j--){
				System.out.print(" ");
			}
			
			for (int j = a; j > i; j--){
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i*2-1; k++){
				System.out.print("+");
			}
			
		System.out.println();
		}
	}
}
