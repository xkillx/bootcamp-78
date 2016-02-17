package com.xsis.soal;
import com.xsis.*; //bintang untuk load semua package

public class hallo {

	public static void main (String args[]) {
		
		System.out.println("hello");
		kamus km = new kamus();
		int hasil = km.getJumlah();
		System.out.println("jumlah "+ hasil); 
		
		//System.out.println("city"+ args[0]); <<contoh array
		
		}
}