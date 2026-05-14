//23.Categorize percentage into Grade A+, A, B, C, Fail.

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        double per = sc.nextDouble();

        if (per < 0 || per > 100) {
            System.out.println("Invalid percentage!");
        }
        else if (per >= 85) {
            System.out.println("Grade: A+");
        }
        else if (per >= 70) {
            System.out.println("Grade: A");
        }
        else if (per >= 55) {
            System.out.println("Grade: B");
        }
        else if (per >= 35) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}