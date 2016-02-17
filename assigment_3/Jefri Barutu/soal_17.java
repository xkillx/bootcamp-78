package com.xsis.bootcamp;

import java.util.Scanner;

public class soal_17 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Input n = ");
		int n = scan.nextInt();
			
		for(int i=1; i<=n; i++){
			for(int j=n; j>=i; j--){
			System.out.print("*");
		
			}
			for(int a=2; a<=i; a++){
			System.out.print(" ");
			}
			for(int x=n; x>=i; x--){
			System.out.print("*");
		}
			System.out.println(" ");
			
		
	}

}

}