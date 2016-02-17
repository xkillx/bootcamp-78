package com.xsis.bootcamp;

import java.util.Scanner;

public class soal_18 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Input n = ");
		int n = scan.nextInt();
			
		for(int i=0; i<n; i++){
			System.out.print("1");	
			for(int j=1; j<=i; j++){

			int a=i;
			if(i==j){
			System.out.print("1");
			}else{
			System.out.print(a+i);
			}
		
		}
		System.out.println(" ");
		}
		
		}
		}