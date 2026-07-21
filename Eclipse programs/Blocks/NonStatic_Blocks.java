package com;

public class NonStatic_Blocks {

	int age; //non-static variable
	static int id; //static variable
	
	{
		System.out.println("In non-static block 1");
		age = 20;  //Non-static block initializing age variable to 20.
	}
	
	public static void main(String[] args) {
		NonStatic_Blocks Nb = new NonStatic_Blocks();  //Object creation.
		System.out.println("In main method");
		System.out.println(Nb.age); //displaying a non-static variable initialized by a non-static block.
		
		System.out.println(Nb.id); //displaying a static variable initialized by a non-static block.
	}
	
	{
		System.out.println("In non-static block 2");
		age = 30;  //Non-static block initializing age variable to 30.
	}
	
	{
		System.out.println("In non-static block 3");
		id = 101; //id is a static variable but we have initialized it using a non-static block which is allowed but not a good practice.
	}
}

//Non-static blocks execute only after object creation and they execute in a sequential manner even before the main method.
