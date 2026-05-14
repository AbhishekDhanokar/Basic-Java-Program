//22.Determine eligibility for scholarship based on marks and income.

import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter family income: ");
        double income = sc.nextDouble();

        if (marks >= 75 && income <= 200000) {
            System.out.println("Eligible for Scholarship");
        }
        else if (marks >= 60 && income <= 150000) {
            System.out.println("Partially Eligible for Scholarship");
        }
        else {
            System.out.println("Not Eligible for Scholarship");
        }

        sc.close();
    }
}