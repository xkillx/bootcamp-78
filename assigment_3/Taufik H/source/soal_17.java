package com.xsis.soal;

public class soal_17{
	public void Show(int n){
	System.out.printf("\nHasil Pola 17:\n");
	 int angka=1;
	 int jumlah_j=1;
	 int i=1,j,s=1;
	 
	 
for(i=1;i<=n;i++)
{
	 while(s<=2)
	 {
	            for(j=1;j<=n;j++)
				{
					if(j<=n-i+1) System.out.print("*"); else  System.out.printf(" ");	
				}
		  if((j==n+1)&&(s==2)) System.out.printf("\n");
		  s++;
	  }
	  s=1;
} 
	 
	
	   }
}
