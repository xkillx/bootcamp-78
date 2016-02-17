package com.xsis.soal;

public class soal_12{
	public void Show(int n){
	System.out.printf("\nHasil Pola 12:\n");
	 int angka=1;
	 int jumlah_j=(n*2)+1;
	 int i=1,j;
	 int nilai_tengah=n+1;
	 //tentukan jumlah j maksimum
	 
	 //looping print angka
	 for(i=1;i<=n;i++)
	 {
	 for(j=1;j<=jumlah_j;j++)
	   {
	   if((j==nilai_tengah-i+1)||(j==nilai_tengah+i-1))  {System.out.printf("@");}
	   else if((j<=nilai_tengah-i)||(j>=nilai_tengah+i)) {System.out.printf("+");}	   
       else System.out.printf("-");	   
	   }
	   System.out.printf("\n");
	 }
	
	   }
}
