//5) Salary Bonus Eligibility  (condition salary >= 25000 && exp >= 2 )

import java.util.Scanner;

class SalaryBounsEligibility{
     public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Your Salary : ");
	int salary = sc.nextInt();
	
	System.out.println("Enter Exprence :");
	int exp = sc.nextInt();

	if(salary >= 25000 && exp >=2 ){
	  System.out.println("Bonus Eligible");
	}else{
	  System.out.println("NOT BONUS ELIGIBLE");
	}
     }

}