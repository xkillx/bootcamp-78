package com.xsis.soal;

public class soal_11{
	public void Show(int n){
	System.out.printf("\nHasil Pola 11:\n");
	 int angka=1;
	 int jumlah_j=1;
	 int i=1,j;
	 
	 //tentukan jumlah j maksimum
	 
	 //looping print angka
	 for(i=1;i<=n;i++)
	 {
	 for(j=1;j<=n;j++)
	   {
	   if(i%2==1){if(j<=n-i+1)  {if(j==2) angka=2; System.out.printf("%d ",angka*angka);angka=angka+2;} 
	             }
	   else      {if(j<=n-i+1)  {if(j==2) angka=3; System.out.printf("%d ",angka*angka);angka=angka+2;} 
				 }
	   }
	   System.out.printf("\n");angka=1;
	 }
	
	   }
}
