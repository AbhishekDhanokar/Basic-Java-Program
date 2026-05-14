//34.Determine training performance (Needs Improvement, Satisfactory, Good, Outstanding).

import java.util.Scanner;

public class TrainingPerformance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter performance score (0 - 100): ");
        int score = sc.nextInt();

        if (score < 0 || score > 100)
            System.out.println("Invalid Input");
        else if (score < 50)
            System.out.println("Needs Improvement");
        else if (score < 65)
            System.out.println("Satisfactory");
        else if (score < 80)
            System.out.println("Good");
        else
            System.out.println("Outstanding");

        sc.close();
    }
}