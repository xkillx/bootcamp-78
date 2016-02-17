package com.xsis.soal;

public class soal_14{
	public void Show(int n){
	System.out.printf("\nHasil Pola 14:\n");
	 int angka=1;
	 int jumlah_i=n*2-1;
	 int jumlah_j=n;
	 int nt_i=(jumlah_i/2)+1;
	 int i=1,j;
	 
	//tentukan jumlah j 
	 
	//looping print angka
	 for(i=1;i<=jumlah_i;i++)
	 for(j=1;j<=jumlah_j;j++)
	   {
	     if(i<=nt_i)           { if (j<=(n-i)+1) System.out.printf("%d ",angka);
								angka=angka+2;
							   }
	     else                  {
								if(j<=(i-nt_i)+1) System.out.printf("%d ",angka);
								angka=angka+2;
							    }
	    //cetak newline
		 if(j==jumlah_j) {System.out.printf("\n"); angka=1;}
	   }
	  
	 
	
	   }
}
