//1.	Calculate income tax based on different tax slabs.

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter Income : ");
        double income = sc.nextDouble();

        if (income <= 250000){
            System.out.println("No Tax");
	}        
        else if (income <= 500000){
            System.out.println("5% Tax");
	}
        else if (income <= 1000000){
            System.out.println("20% Tax");
	}
        else{
            System.out.println("30% Tax");
	}
    }
}
