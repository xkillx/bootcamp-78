package com.xsis.pola;

public class pola12 {
	
	public void show(){
		int a = 9;
		int gan = 1;
		//int b = a + 1;
		
		for(int i = 1; i<=a;i++){
			
			for(int l = a+1; l >i;l--){
				System.out.print("+");
			}
			
			for(int j = 1; j<=gan;j++){
				if(j == 1 || j == gan){
					System.out.print("@");
				} else {
					System.out.print("-");
				}
				
			}
			gan +=2;
			
			for(int m = a; m>=i;m--){
				System.out.print("+");
				
			}
			System.out.println();
		}
	}
	
}
