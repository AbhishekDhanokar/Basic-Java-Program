//3.Calculate discount percentage based on purchase amount.

import java.util.Scanner;

class CalculateDiscountPercentage{
      public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Amount : ");
	double amount = sc.nextDouble();
	
	if(amount >= 5000)
   	   System.out.println("20% Discount");
	else if(amount >= 2000)
    	   System.out.println("10% Discount");
	else
    	  System.out.println("No Discount");
      }
}