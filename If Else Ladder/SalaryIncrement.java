//13.Determine salary increment percentage based on performance rating.

import java.util.Scanner;

public class SalaryIncrement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter performance rating (1 to 5): ");
        int rating = sc.nextInt();

        double increment = 0;
        double newSalary;

        if (rating == 5) {
            increment = 20;
        } 
        else if (rating == 4) {
            increment = 15;
        } 
        else if (rating == 3) {
            increment = 10;
        } 
        else if (rating == 2) {
            increment = 5;
        } 
        else if (rating == 1) {
            increment = 0;
        } 
        else {
            System.out.println("Invalid rating! Please enter between 1 to 5.");
            sc.close();
            return;
        }

        newSalary = salary + (salary * increment / 100);

        System.out.println("Increment Percentage: " + increment + "%");
        System.out.println("New Salary: " + newSalary);

        sc.close();
    }
}