package com.xsis.soal;

public class soal_3{
	public void Show(int x){
	System.out.printf("\nHasil Pola 3:\n");
	 int i,j,angka=1;
	 for(i=1;i<=x;i++)
	 for(j=1;j<=x;j++)
	   {
	   if(j<=(x-(x-i))) {System.out.printf("%d",angka);}
	   else {System.out.printf(" ");}
	   if(j==x) {System.out.printf("\n");angka++;}
	   //angka++;
	   }
	
	
	   }
}
