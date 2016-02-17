package com.xsis.bootcamp;

import java.util.Scanner;

public class soal_14 {	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Input n = ");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++){
		int a=1;
			for(int j=n; j>=i; j--){
			
			System.out.print(a+" ");
				a+=2;
			}
			System.out.println(" ");
		}
		for(int d=2; d<=n; d++){
		int r=1;
			for(int e=1; e<=d; e++){
			System.out.print(r+" ");
				r+=2;
			}
			System.out.println(" ");
			}
			
		}
	}
	//}

//}
//}