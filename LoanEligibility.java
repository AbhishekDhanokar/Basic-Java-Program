//16) Loan Eligibility 

import java.util.Scanner;

class LoanEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your creditScore : ");
        int creditScore = sc.nextInt();

        if (creditScore>=500) {
         System.out.println("Eligible For Loan");
        }
	else{
         System.out.println("Not Eligible For Loan");
        }
}
} 