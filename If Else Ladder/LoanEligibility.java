//7.Determine loan eligibility based on salary range

import java.util.Scanner;

class LoanEligibility{
      public static void main(String [] args){
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter Salary : ");
	 double salary = sc.nextDouble();

	if (salary >= 80000) {
    	  System.out.println("Eligible for High Loan");
	} 
	else if (salary >= 50000) {
    	  System.out.println("Eligible for Medium Loan");
	} 
	else if (salary >= 30000) {
    	  System.out.println("Eligible for Low Loan");
	} 
	else {
    	  System.out.println("Not Eligible for Loan");
	}
      }
}