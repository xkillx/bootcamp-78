package com.xsis.soal;

public class soal_9a{
	public void Show(int n){
	System.out.printf("\nHasil Pola 9a (tanpa if-else):\n");
	 int angka=1;
	 int jumlah_j=1;
	 int i=1,j,batas,a;
	 
	 //tentukan jumlah j maksimum
	 
	 //looping print angka
	 for(i=1;i<=n;i++)
	 { 
	 for(j=0;j<i;j++)
	   {
	   angka=(i+j)%2;System.out.printf("%d",angka);
	   //cetak new line
	   
	   
	   }   
	   System.out.printf("\n");
	 }
	
	
	   }
}
