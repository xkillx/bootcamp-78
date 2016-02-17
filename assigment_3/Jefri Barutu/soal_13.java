package com.xsis.bootcamp;

import java.util.Scanner;

public class soal_13 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Input n = ");
		int n = scan.nextInt();
		
		//int a=1;
		
		for(int i=1; i<=n; i++){
			int a=i;
			for(int j=1; j<=i; j++){
				System.out.print(a);
				a++;
			}
			a-=2;
			for(int b=a; b>=i; b--){
			
			System.out.print(b);
			
			}
			System.out.println(" ");
		}
	}

}
//}