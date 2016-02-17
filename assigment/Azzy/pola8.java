package com.xsis.pola;

public class pola8{
	public void show(){
		int n = 9;
		int c = 6;
		for(int i = 1; i<=n;i++){
			
			for(int j = 0; j<=c; j++){
				if(j+1==i){
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}