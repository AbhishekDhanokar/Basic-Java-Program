//12)Discount Eligibility  (amount >= 3000 && amount <= 10000 )

import java.util.Scanner;

class DiscountEligibility{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter the amount to make the payment: ");
 	double amount = sc.nextDouble();

	if(amount >= 3000 && amount <= 10000){
	  System.out.println("Your are Eligible to Discount");
	}else if (amount < 3000){
	  System.out.println("To avail the offer, please buy products worth this : " +(3000-amount));
	} else{
	  System.out.println("you not Eligible");
	}

   }

}

