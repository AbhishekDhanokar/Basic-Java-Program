//8.	Check whether a number is multiple of 2, 3, 5, or none.

import java.util.Scanner;

class CheckWetherNumberIsMultipleOf2OreOr5{
      public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your Number : ");
	int num = sc.nextInt();

	if(num % 2 == 0){
    	  System.out.println("Multiple of 2");
	}
	else if(num % 3 == 0){
    	  System.out.println("Multiple of 3");
	}
	else if(num % 5 == 0){
    	 System.out.println("Multiple of 5");
	}
	else{
	  System.out.println("Not Multiple Of Any Number");
	}
    }
}

