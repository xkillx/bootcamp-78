package com.xsis.soal;

public class soal_8{
	public void Show(int n,int c){
	System.out.printf("\nHasil Pola 8:\n");
	 int angka=1;
	 int jumlah_j=1;
	 int i=1,j;
	 
	 //tentukan jumlah j maksimum
	 
	 //looping print angka
	 for(i=1;i<=n;i++)
	 for(j=1;j<=c;j++)
	   {
	   if(j==i) {System.out.printf("%d",1);}
	   else {System.out.printf("%d",0);}
	   if(j==c) {System.out.printf("\n");}
	   
	   }
	
	
	   }
}
