//35.Categorize coding test score (Beginner, Intermediate, Advanced, Expert).

import java.util.Scanner;

public class CodingTestCategory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coding test score (0 - 100): ");
        int score = sc.nextInt();

        if (score < 0 || score > 100)
            System.out.println("Invalid Input");
        else if (score < 40)
            System.out.println("Beginner");
        else if (score < 60)
            System.out.println("Intermediate");
        else if (score < 80)
            System.out.println("Advanced");
        else
            System.out.println("Expert");

        sc.close();
    }
}