package com.xsis.soal;

public class soal_7{
	public void Show(int x){
	System.out.printf("\nHasil Pola 7:\n");
	 int angka=1;
	 int jumlah_j=1;
	 int i=1,j;
	 
	 //tentukan jumlah j maksimum
	 
	 //looping print angka
	 for(i=1;i<=x;i++)
	 for(j=1;j<=x;j++)
	   {
	   if(j>i) {System.out.printf("*");}
	   else {System.out.printf("%d",j);}
	   if(j==x) {System.out.printf("\n");}
	   }
	
	
	   }
}
