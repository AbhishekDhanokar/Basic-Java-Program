//3) Check Negative Odd Number

import java.util.Scanner;

class NegativeOddNumber{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Number : ");
 	int num = sc.nextInt();

	if(num%5==0 && num%10==0){
	  System.out.println("Divisible");
	}
	else{
	  System.out.println("Not Divisible");
	}
    }

}