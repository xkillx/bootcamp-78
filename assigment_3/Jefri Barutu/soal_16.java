package com.xsis.bootcamp;

import java.util.Scanner;

public class soal_16 {
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

}
}