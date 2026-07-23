package com;

import java.util.Scanner;                     //scanner class imported to use scanner function.

public class Hierarchial_Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);      //Scanner function used by object creation.
		
		System.out.println("Enter your pet name");  //Prompt to take input of user.
		String petName = scan.next();               // User input stored in a variable.
		
		Hierarchial_Child1 HC1 = new Hierarchial_Child1();   //Objects of child classes to gain access to their properties as well as of the parent class.
		Hierarchial_Child2 HC2 = new Hierarchial_Child2();
		
		if(petName.equalsIgnoreCase(HC1.petName1)) {           //Logic to compare the user input with the child class variables.
			System.out.println(HC1.petType);                   //Parent variable accessed.
			HC1.petAnimals();
			System.out.println(HC1.age1);                     //Child 1 variables.
			HC1.petSound1();
		}
		else if(petName.equalsIgnoreCase(HC2.petName2)) {
			System.out.println(HC2.petType);                 //Parent variables
			HC2.petAnimals();                                 
			System.out.println(HC2.age2);                    //Child 2 variables.
			HC2.petSound2();
		}
		
		scan.close();
	}
	
	
	
}
