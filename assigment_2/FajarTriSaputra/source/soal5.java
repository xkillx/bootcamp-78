package com.xsis.soal; //SOAL 5
import com.xsis.*; //bintang untuk load semua package

public class soal5 {

	public void show () {
	
		int n = 0;
		
        for ( int i = 9; i >= 1; i--) 
		{
            for ( int j = n + 1; j <= i; j++) 
			{
                System.out.print(j);
            }
            System.out.println("");
			n++;
        }
	}
}