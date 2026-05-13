//10)Check Number is Zero or Not 

import java.util.Scanner;

class CheckNumberIsZero{
	public static void main(String [] args){
           
	  Scanner sc = new Scanner(System.in);

	  System.out.println("Enter Your Number : ");
	  int num = sc.nextInt();

	  if(num==0){
	    System.out.println("Number is 0");
	  }
	  else{
	    System.out.println("Number Is Not 0");
	  }
   	}
}