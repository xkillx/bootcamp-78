package com.xsis.soal;

public class soal_9{
	public void Show(int n){
	System.out.printf("\nHasil Pola 9:\n");
	 int angka=1;
	 int jumlah_j=1;
	 int i=1,j;
	 
	 //tentukan jumlah j maksimum
	 
	 //looping print angka
	 for(i=1;i<=n;i++)
	 for(j=1;j<=i;j++)
	   {
	   if((i%2==0)&&(j==1)) {angka=0;System.out.printf("%d",angka);}
	   else if ((i%2==1)&&(j==1)) {angka=1;System.out.printf("%d",angka);}
	   else {if(angka==0) angka=1; else angka=0; System.out.printf("%d",angka);}
	   //cetak new line
	   if(j==i) {System.out.printf("\n");}
	   }
	
	
	   }
}
