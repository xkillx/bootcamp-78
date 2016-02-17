package com.xsis.bootcamp;

import java.util.Scanner;

public class soal_20 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Input n = ");
		int n = scan.nextInt();
			
		for(int i=1; i<=n; i++){
			for(int j=n-1; j>=i; j--){
			System.out.print(" ");
		
			}
			for(int a=1; a<=2*i-1; a++){
				System.out.print("*");
			}
			System.out.println("");
		
	}
	for(int x=n-1; x>=1; x-- ){
			for(int y=1; y<=n-x; y++){
			System.out.print(" ");
		
			}
			for(int z=1; z<=2*x-1; z++){
			System.out.print("*");
	
			}
			System.out.println("");
		
	}
}
}