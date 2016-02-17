package com.xsis.soal;

public class soal_1{
	public void Show(int x){
	System.out.printf("\nHasil Pola 1:\n");
	 int angka=1,i,j;
	 for(i=1;i<=x;i++)
	 for(j=1;j<=x;j++)
	   {
	   if(j<=(x-(x-i))) {System.out.printf("%d",angka);angka++;}
	   else {System.out.printf(" ");}
	   if(j==x) {System.out.printf("\n");}
	   //angka++;
	   }
}
}