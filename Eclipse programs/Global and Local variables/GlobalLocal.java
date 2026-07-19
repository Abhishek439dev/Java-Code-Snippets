package com;

class GlobalLocal {

	double height = 5.5;  //Global or member variable
	
	void display() {
		  double height = 4.4;    //Local variable
		  System.out.println(height);   //local variable dominated the member variable.
		  System.out.println(this.height);  //Member variable called with the help of 'this' calling statement.
		}
	
	public static void main(String[] args) {
		
		GlobalLocal g = new GlobalLocal();      //Object created to load the non-static properties.
		g.display();                            //Method calling
		
		System.out.println(g.height);           //member variable calling.
	}
}
