package com.xsis.soal;

public class soal_20{
	public void Show(int n){
	System.out.printf("\nHasil Pola 20:\n");
	 int angka=1;
	 int jumlah=((n*2)-1);
	 int i=1,j;
	
	 
	//looping print *
	 for(i=1;i<=jumlah;i++)
	 for(j=1;j<=jumlah;j++)
	 
	   {  //segitiga atas
	     if(i<=n)              { if ((j>=(n-i)+1)&&(j<=n+i-1)) System.out.printf("*"); else System.out.printf(" ");
								
							   }
		  //segitiga bawah
	     else                  {
								if((j>i-n)&&(j<=n+jumlah-i)) System.out.printf("*"); else System.out.printf(" ");
							   }
	    //cetak newline
		 if(j==jumlah) {System.out.printf("\n"); angka=1;}
	   }
	  
	 
	
	   }
}
