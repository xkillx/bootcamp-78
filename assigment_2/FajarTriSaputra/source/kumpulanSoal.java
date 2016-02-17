package com.xsis.soal;
import com.xsis.*; //bintang untuk load semua package

public class kumpulanSoal {

	public static void main (String args[]) {
		/*
		System.out.println("hello");
		kamus km = new kamus();
		int hasil = km.getJumlah();
		System.out.println("jumlah "+ hasil); 
		//System.out.println("city"+ args[0]); <<contoh array
		*/
			soal1 a = new soal1();
			soal2 b = new soal2();
			soal3 c = new soal3();
			soal4 d = new soal4();
			soal5 e = new soal5();
			
			a.show();
			b.show();
			c.show();
			d.show();
			e.show();
		}
}