package com.xsis.soal;

public class soal_5{
	public void Show(int x){
	System.out.printf("\nHasil Pola 5:\n");
	 int angka=1;
	 int jumlah_j=1;
	 int i=1,j;
	 //tentukan jumlah j maksimum
	 while(i<x) {
	 jumlah_j=jumlah_j+2;
	 i++;}
	 //System.out.println(jumlah_j);
	 int batas=0;//batas j tiap baris
	 
	 for(i=1;i<=x;i++)
	 for(j=1;j<=jumlah_j;j++)
	   {
	   if(j<=(jumlah_j-batas)) {System.out.printf("%d",angka);angka++;}
	   else {System.out.printf(" ");}
	   if(j==jumlah_j) {System.out.printf("\n");angka=i+1;batas=batas+2;}
	   //angka++;
	   }
	
	
	   }
}
