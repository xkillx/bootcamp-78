package com.xsis.bootcamp;

import java.util.Scanner;

public class soal_19 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Input n = ");
		int n = scan.nextInt();
		int a = n;
        int e = n-1;
       
        for(int c=1;c<=n;c++){
        int b = 1;
            for(int d=1;d<=a;d++){
                if (b<=e){
                    System.out.print(" ");
                    b++;
                    }else if(d==b||d==a||e==0){
                        
                        System.out.print(c);
                    }else{
                        System.out.print(" ");
                    }
            }
        e--;
        a++;
        System.out.println(" ");
        }
    }
}
 
		