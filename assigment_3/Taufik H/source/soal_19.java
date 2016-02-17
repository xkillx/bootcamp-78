package com.xsis.soal;

public class soal_19{
	public void Show(int n){
	System.out.printf("\nHasil Pola 19:\n");
	 int angka=1;
	 int jumlah_j=1;
	 int i=1,j;
	 
	//looping print angka
	 for(i=1;i<=n;i++)
	 for(j=1;j<=(n+i)-1;j++)
	 
	   { //cetak angka
	     if(i==n) System.out.printf("%d",i);
	     else if((j==n-i+1)||(j==n+i-1)) System.out.printf("%d",i);
	     else  System.out.printf(" ");
							   
	    //cetak newline
		 if(j==(n+i)-1) {System.out.printf("\n");}
	   }
	  
	 
	
	   }
}
