package com.xsis.soal; //SOAL 3

import com.xsis.*; //bintang untuk load semua package

public class soal3 {

	public void show () {
		
		int n = 5;
		
		for ( int a=1;a<=n;a++)	
		{
			for (int b=1;b<=a;b++)
			{
				System.out.print(a);
			}
			System.out.println("");
		}
	}
}