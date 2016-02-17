package com.xsis.soal;

public class soal_15{
	public void Show(int n,int k){
	System.out.printf("\nHasil Pola 15:\n");
	 int angka=1;
	 int jumlah_i; if(n%k==0)jumlah_i=n/k; else jumlah_i=(n/k)+1;
	 int jumlah_j=k;
	 int i,j;
	 
	//tentukan jumlah j 
	 
	//looping print angka
	 for(i=1;i<=jumlah_i;i++)
	 for(j=1;j<=jumlah_j;j++)
	   {
	     if(angka<=n) System.out.printf("%d ",angka);
		 angka++;
	    
	    //cetak newline
		 if(j==jumlah_j) {System.out.printf("\n"); }
	   }
	  
	 
	
	   }
}
