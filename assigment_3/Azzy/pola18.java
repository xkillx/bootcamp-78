package com.xsis.pola;

public class pola18 {
	public void show(){
		int a = 5;
		
		for(int i = 0; i < a; i++){
			System.out.print("1");
			int b = i;
			for (int j=1; j<=i; j++){
				if(i == j){
					System.out.print("1");
				} else {
					System.out.print(b+i);
				}
			}
			
			System.out.println();
		}
	}
}
