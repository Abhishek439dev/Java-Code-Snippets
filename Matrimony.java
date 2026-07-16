class Matrimony{
	public static void main(String[] args){
	char gender = 'F';
	int age = 25;

	  if(gender == 'M'){
		if(age>=21){
		  System.out.println("You are a male and you can marry");
		}
		else{
		 System.out.println("You need to be older than 21yrs to marrry");
		}

	  }
	  else if(gender == 'F'){
		if(age>=18){
		  System.out.println("You are a female and you can marry");
		}
		else{
		 System.out.println("You need to be older than 18yrs to marrry");
		}
          }
	  else{
	    System.out.println("Invalid input");
	}
	


}

}