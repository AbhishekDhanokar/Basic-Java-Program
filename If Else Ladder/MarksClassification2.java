//14.Classify marks into Fail (<35), Pass, First Class, Distinction.

import java.util.Scanner;

public class MarksClassification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0 - 100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks!");
        }
        else if (marks < 35) {
            System.out.println("Result: Fail");
        }
        else if (marks < 60) {
            System.out.println("Result: Pass");
        }
        else if (marks < 75) {
            System.out.println("Result: First Class");
        }
        else {
            System.out.println("Result: Distinction");
        }

        sc.close();
    }
}