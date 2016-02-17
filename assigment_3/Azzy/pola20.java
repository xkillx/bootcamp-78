package com.xsis.pola;

public class pola20 {
	public void show(){
		int n = 3;
		int b = 1;
		
		for (int i =1; i<=n; i++){
			for(int j = n; j>=i;j--){
				System.out.print(" ");
			}
			
			for (int k = 1; k <=b;k++){
				System.out.print("*");
			}
			b+=2;
		System.out.println();
		}
		b-=4;
		for (int i =1; i<=n; i++){
			for(int j = 0; j<=i;j++){
				System.out.print(" ");
			}
			
			for (int k = 1; k <=b;k++){
				System.out.print("*");
			}
			b-=2;
		System.out.println();
		}
		
	}

}
