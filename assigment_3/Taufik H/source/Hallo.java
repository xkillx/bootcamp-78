//package com.xsist.bootcamp78;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import com.xsis.Kamus;
import com.xsis.soal.soal_1;
import com.xsis.soal.soal_2;
import com.xsis.soal.soal_3;
import com.xsis.soal.soal_4;
import com.xsis.soal.soal_5;

public class Hallo{
	public static void main(String args[]){
	//
	//JOptionPane.showMessageDialog(null,"Hello Java Alert");
	Kamus km =new Kamus();
	int hasil=km.getJumlah();
	System.out.println("Jumlah "+hasil);
	int n=9,i=1;
	while(i<n){
	System.out.printf("%d ",i); i++;
	}
	System.out.printf("\n");
	int x;
	x=5;
	int j;
	//pola 1
	for(i=1;i<=x;i++)
	for(j=1;j<=x;j++)
	   {
	   if(j<=(x-(x-i))) System.out.printf("*");
	   else System.out.printf(" ");
	   if(j==x) System.out.printf("\n");
	   }
	   
	 //Pola 2
	 int angka=1;
	 for(i=1;i<=x;i++)
	 for(j=1;j<=x;j++)
	   {
	   if(j<=(x-(x-i))) {System.out.printf("%d",angka);angka++;}
	   else {System.out.printf(" ");}
	   if(j==x) {System.out.printf("\n");}
	   //angka++;
	   }
	   
	 //Pola 3
	 System.out.printf("\nHasil Pola 3:\n");
	 x=7;angka=1;
	 for(i=1;i<=x;i++)
	 for(j=1;j<=x;j++)
	   {
	   if(j<=(x-(x-i))) {System.out.printf("%d",angka);}
	   else {System.out.printf(" ");}
	   if(j==x) {System.out.printf("\n");angka++;}
	   //angka++;
	   }
	 //Pola 4
	 System.out.printf("\nHasil Pola 4:\n");
	 x=6;angka=1;
	 for(i=1;i<=x;i++)
	 for(j=1;j<=x;j++)
	   {
	   if(j<=(x-(x-i))) {System.out.printf("%d",angka);angka++;}
	   else {System.out.printf(" ");angka++;}
	   if(j==x) {System.out.printf("\n");angka=1;}
	   //angka++;
	   }
	 
	  //Pola 5
	 System.out.printf("\nHasil Pola 5:\n");
	 x=5;angka=1;
	 int jumlah_j=1;
	 i=1;
	 //tentukan jumlah j maksimum
	 while(i<x) {
	 jumlah_j=jumlah_j+2;
	 i++;}
	 //System.out.println(jumlah_j);
	 int batas=0;//batas j tiap baris
	 
	 for(i=1;i<=x;i++)
	 for(j=1;j<=jumlah_j;j++)
	   {
	   if(j<=(jumlah_j-batas)) {System.out.printf("%d",angka);angka++;}
	   else {System.out.printf(" ");}
	   if(j==jumlah_j) {System.out.printf("\n");angka=i+1;batas=batas+2;}
	   //angka++;
	   }
	 
	 
	}
}
	