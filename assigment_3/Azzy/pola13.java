package com.xsis.pola;

public class pola13 {
	public void show(){
		int a = 6;
		//int b = 1;
		
		for (int i = 1; i < a;i++){
			
			int c = i;
			for (int j = 1; j <=i; j++){
				System.out.print(c);
				c++;
			}
			c-=2;
			
			for (int k = c; k >=i; k--){
				System.out.print(c);
				c--;
			}
			
		System.out.println();
		}
	}
}
