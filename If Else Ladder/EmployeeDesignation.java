//18.Categorize employee designation based on years of experience.

import java.util.Scanner;

public class EmployeeDesignation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter years of experience: ");
        int exp = sc.nextInt();

        if (exp < 0) {
            System.out.println("Invalid experience!");
        } 
        else if (exp <= 1) {
            System.out.println("Designation: Trainee");
        } 
        else if (exp <= 3) {
            System.out.println("Designation: Junior Developer");
        } 
        else if (exp <= 5) {
            System.out.println("Designation: Senior Developer");
        } 
        else if (exp <= 8) {
            System.out.println("Designation: Team Lead");
        } 
        else {
            System.out.println("Designation: Project Manager");
        }

        sc.close();
    }
}