package com.xsis.pola;

public class pola19 {
	public void show(){
		int a = 9;
		int b=1;
		for (int i = 1; i<=a;i++){
			
			for(int j = a-1; j>=i;j--){
				System.out.print(" ");
			}
			
			for (int k = 1; k<=b;k++){
				if(k==1||k==b || i==a){
					System.out.print(i);
				}else{
					System.out.print(" ");
				}
				
			}
			b+=2;
			System.out.println();
		}
	}
}
