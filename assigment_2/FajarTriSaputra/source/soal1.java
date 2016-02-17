package com.xsis.soal; //--SOAL 1---
import com.xsis.*;
import java.util.Scanner;

public class soal1 {

	public void show () {
	
	Scanner in = new Scanner(System.in);
	
		int n;
		
		System.out.print("masukan 'n' : ");
		n = in.nextInt();
		
		for ( int a=1;a<=n;a++)	
		{
			for (int b=1;b<=a;b++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		}
	}