package com;

public class Static_Blocks {

	//Blocks are used to initialize the variables.
	static int age;
	
	static {
		System.out.println("In static block 1");
		age = 20;  //Initialized the value of age to 20.
		System.out.println(age);   //20
	}
	
	public static void main(String[] args) {
		System.out.println("In main method");
		System.out.println(age);   //30
	}
	
	static {
		System.out.println("In static block 2");
		age = 30;  //Initialized the value of age to 30.
		System.out.println(age);  //30
	}
}

//Static blocks executes on their own in a sequential manner even before the main method. 
