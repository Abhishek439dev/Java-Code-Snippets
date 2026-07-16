package com;

class Solutions {
  public static void main(String[] args) {
	 //Object-creation or instantiation.
	Employee e1 = new Employee();              
	Employee e2 = new Employee();
	Employee e3 = new Employee();

	 //Initialization of the variables to new values for each object.
	e1.id = 1;                                
	e1.name = "Abhishek";
	e1.salary = 50000;
	
	e2.id = 2;
	e2.name = "Honey";
	e2.salary = 150000;
	
	e3.id = 3;
	e3.name = "Ram";
	e3.salary = 60000;

	  //Display of the outputs.
	System.out.println("Employee with id "+e1.id+" is "+e1.name+" and has a salary of "+e1.salary);
	System.out.println("Employee with id "+e2.id+" is "+e2.name+" and has a salary of "+e2.salary);
	System.out.println("Employee with id "+e3.id+" is "+e3.name+" and has a salary of "+e3.salary);
}
}
