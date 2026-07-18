class evenReverse {
  public static void main(String[] args){
	
	for(int x = 10; x > 1; x-=2){
	System.out.print(x+" ");
	}

	System.out.println("_");

	for(int i = 10; i > 1; i--){
	if(i % 2==0){
	  System.out.print(i+" ");
	  }
	}

	System.out.println("_");
	
	int w = 10;
	while(w>1){
	System.out.print(w+" ");
	w-=2;
	}
	
	System.out.println("_");
	
	int y = 10;
	while(y>1){
	  if(y%2 == 0){
	  System.out.print(y+" ");
	  }
	y--;
	}

	System.out.println("_");

	int z = 10;
	do{
	System.out.print(z+" ");
	z-=2;
	}
	while(z>1);

	System.out.println("_");
	
  }
}