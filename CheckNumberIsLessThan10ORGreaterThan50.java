//1)Check Number is Less than 10 OR Greater than 50 

import java.util.Scanner;

class CheckNumberIsLessThan10ORGreaterThan50{
      public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number : ");
	int num  = sc.nextInt();

	if(num < 10 || num > 50){
	   System.out.println("With In Range");
	}else{
	  System.out.println("Not In Range");
	}
      }
}