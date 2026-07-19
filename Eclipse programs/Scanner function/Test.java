package com;

import java.util.Scanner; //This library is important to import in order to use the Scanner function.

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //Scanner function is used after its object creation.
		
;		ScannerFunction sF = new ScannerFunction();  //This is an object of the class ScannerFunction to use the method for checing number.

		//This is a for loop for repeating the same process of accepting new user inputs and checking them for 5 times.
		for(int i=1; i<=5; i++) {                    
			System.out.println("Enter a number");
			int a = sc.nextInt();
			
			sF.checkPositiveOrNegative(a);
			System.out.println("_________________");
		}
		sc.close();      //This close() method closes the scanner function which is necessary to prevent resource leaks and fee up the resources.
	}
	
	
}
