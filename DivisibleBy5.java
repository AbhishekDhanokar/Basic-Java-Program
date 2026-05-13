//7 Divisible by 5

import java.util.Scanner;

class DivisibleBy5{
	public static void main(String [] args){
           
	  Scanner sc = new Scanner(System.in);

	  System.out.println("Enter Your Number : ");
	  int num = sc.nextInt();

	  if(num%5==0){
	    System.out.println("Number is Divisible By 5");
	  }
	  else{
	    System.out.println("Number Is Not Divisible by 5");
	  }
   	}
}