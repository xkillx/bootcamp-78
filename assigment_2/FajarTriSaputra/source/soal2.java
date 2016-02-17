package com.xsis.soal; //SOAL 2
import com.xsis.*; //bintang untuk load semua package
import java.util.Scanner;

public class soal2 {

	public void show () {
	
	Scanner in = new Scanner(System.in);
	
	int n;
	int c = 1;
	
	System.out.print("masukan angka : ");
		n = in.nextInt();
	
	for ( int a=1;a<=n;a++)	
		{
			for (int b=1;b<=a;b++)
			{
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
		System.out.println();
	}
}