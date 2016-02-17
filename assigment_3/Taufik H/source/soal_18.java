package com.xsis.soal;

public class soal_18{
	public void Show(int n){
	System.out.printf("\nHasil Pola 18:\n");
	 int angka=4;
	
	 int i,j;
	 
	//tentukan jumlah j 
	 
	//looping print angka
	 for(i=1;i<=n;i++){
	 for(j=1;j<=i;j++)
	   {
	     if((j==1)||(j==i)) System.out.printf("%d",1);
		 else  System.out.printf("%d",angka);
	   }
	  System.out.printf("\n"); if(i>=3)angka=angka+2;
	 }
	
	   }
}
