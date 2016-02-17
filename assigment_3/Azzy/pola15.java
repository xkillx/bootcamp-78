package com.xsis.pola;

public class pola15 {
	public void show(){
		int kolom = 3;
		int data = 9;
		
		for(int a = 1; a <= data; a++){
			System.out.print(a);
			if(a%kolom == 0){
				System.out.println();
			}
		}
	}
}
