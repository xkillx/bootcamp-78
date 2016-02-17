package com.xsis.soal;

public class soal_16{
	public void Show(int n){
	System.out.printf("\nHasil Pola 16:\n");
	 int angka=1;
	 int jumlah_j=1;
	 int i=1,j;
	 while(i<n) {
	 jumlah_j=jumlah_j+2;
	 i++;}
	 int nt=(jumlah_j/2)+1;
	 //System.out.print(nt);
	//tentukan jumlah j 
	 
	//looping print angka
	 for(i=1;i<=n;i++)
	 for(j=1;j<=(nt+i)-1;j++)
	   {
	     if(j>nt-i)           {  System.out.print("*");
							   }
	     else                  {
								 System.out.printf(" ");
							   }
	    //cetak newline
		 if(j==(nt+i)-1) {System.out.printf("\n");}
	   }
	  
	 
	
	   }
}
