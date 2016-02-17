package com.xsis.soal;

public class soal_10{
	public void Show(int n){
	System.out.printf("\nHasil Pola 10:\n");
	 int angka=1;
	 int jumlah_j=1;
	 int i=1,j;
	 
	 //tentukan jumlah j maksimum
	 
	 //looping print angka
	 for(i=1;i<=n;i++)
	 for(j=1;j<=n;j++)
	   {
	   if(j>n-i) {System.out.printf("%d",angka);angka--;}
	   else {System.out.printf(" ");}
	   if(j==n) {System.out.printf("\n"); angka=i+1;}
	   }
	
	
	   }
}
