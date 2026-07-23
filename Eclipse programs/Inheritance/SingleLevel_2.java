package com;

public class SingleLevel_2 extends SingleLevel_1{  //extends keyword is used to create Is-A relationship between classes.
	
	int age2 = 30;                                //Some more variables for class 2
	String name2 = "Tom";
	
	void display2() {                                                //A Method for class 2
		System.out.println("This method is from child class.");
	}
	
	public static void main(String[] args) {
		                  
		SingleLevel_2 Sl2 = new SingleLevel_2(); //Object-creation to access properties. 
		
		System.out.println(Sl2.age+" "+Sl2.name);  //Properties of first class are accessed without its object creation because of Inheritance(Is-A relationship).
		Sl2.display();
		
		System.out.println(Sl2.age2+" "+Sl2.name2);  //Properties of second class can be accessed obviously.
		Sl2.display2();
	
	}
}