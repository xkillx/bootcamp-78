package com.xsis.pola;

public class pola14 {
	public void show(){
		int a = 10;
		//int b = a*2;
		
		
		for (int i = 1; i <= a; i++){
			int b = 1;
			for (int j = a; j >= i;j--){
				System.out.print(b);
				b+=2;
			}
		System.out.println();
		}
		
		for (int i = 2; i <= a; i++){
			int b = 1;
			for (int j = 1; j <= i;j++){
				System.out.print(b);
				b+=2;
			}
		System.out.println();
		}
	}
}
