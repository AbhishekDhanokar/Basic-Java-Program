//17.Determine insurance premium slab based on age group.

import java.util.Scanner;

public class InsurancePremiumSlab {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age!");
        } 
        else if (age <= 18) {
            System.out.println("Premium Slab: Child (Low Risk)");
        } 
        else if (age <= 30) {
            System.out.println("Premium Slab: Young Adult (Low Premium)");
        } 
        else if (age <= 45) {
            System.out.println("Premium Slab: Adult (Moderate Premium)");
        } 
        else if (age <= 60) {
            System.out.println("Premium Slab: Senior Adult (High Premium)");
        } 
        else {
            System.out.println("Premium Slab: Senior Citizen (Very High Premium)");
        }

        sc.close();
    }
}