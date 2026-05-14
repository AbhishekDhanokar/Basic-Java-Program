//37.Categorize credit card limit based on salary range.

import java.util.Scanner;

public class CreditCardLimit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly salary: ");
        double salary = sc.nextDouble();

        if (salary < 0)
            System.out.println("Invalid Input");
        else if (salary < 20000)
            System.out.println("Credit Limit: ₹10,000");
        else if (salary < 40000)
            System.out.println("Credit Limit: ₹25,000");
        else if (salary < 70000)
            System.out.println("Credit Limit: ₹50,000");
        else
            System.out.println("Credit Limit: ₹1,00,000+");

        sc.close();
    }
}