//33.Assign GPA category (Fail, Pass, Merit, Distinction, Honors).

import java.util.Scanner;

public class GPACategory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GPA (0 - 10): ");
        double gpa = sc.nextDouble();

        if (gpa < 0 || gpa > 10)
            System.out.println("Invalid GPA");
        else if (gpa < 4.0)
            System.out.println("Fail");
        else if (gpa < 5.5)
            System.out.println("Pass");
        else if (gpa < 7.0)
            System.out.println("Merit");
        else if (gpa < 8.5)
            System.out.println("Distinction");
        else
            System.out.println("Honors");

        sc.close();
    }
}