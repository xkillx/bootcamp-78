package com.xsis.soal;

public class soal_13{
	public void Show(int n){
	System.out.printf("\nHasil Pola 13:\n");
	 int angka=1;
	 int jumlah_j=1;
	 int i=1,j;
	 
	//tentukan jumlah j 
	 
	//looping print angka
	 for(i=1;i<=n;i++)
	{
	 for(j=1;j<=i+(i-1);j++)
	   {
	   System.out.printf("%d",angka);
	   
	   if(j<((i+(i-1))/2)+1)  angka++; //jika j kurang dr nilai tengah ++
	   else angka--;   //jika lebih --
        
	   }
	   System.out.printf("\n"); angka=i+1;
	 }
	
	   }
}
