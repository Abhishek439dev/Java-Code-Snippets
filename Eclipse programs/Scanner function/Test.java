package com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
;		ScannerFunction sF = new ScannerFunction();
		
		for(int i=1; i<=5; i++) {
			System.out.println("Enter a number");
			int a = sc.nextInt();
			
			sF.checkPositiveOrNegative(a);
			System.out.println("_________________");
		}
		sc.close();
	}
	
	
}
