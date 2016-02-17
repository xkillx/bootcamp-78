package com.xsis.soal;

public class soal_4{
	public void Show(int x){
	System.out.printf("\nHasil Pola 4:\n");
	 int angka=1,i,j;
	 for(i=1;i<=x;i++)
	 for(j=1;j<=x;j++)
	   {
	   if(j<=(x-(x-i))) {System.out.printf("%d",angka);angka++;}
	   else {System.out.printf(" ");angka++;}
	   if(j==x) {System.out.printf("\n");angka=1;}
	   //angka++;
	   }
	
	
	   }
}
