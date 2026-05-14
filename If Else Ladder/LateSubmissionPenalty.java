//20.Determine penalty based on late submission days.

import java.util.Scanner;

public class LateSubmissionPenalty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of late days: ");
        int days = sc.nextInt();

        int penalty = 0;

        if (days <= 0) {
            penalty = 0;
        }
        else if (days <= 3) {
            penalty = days * 10;
        }
        else if (days <= 7) {
            penalty = days * 20;
        }
        else {
            penalty = days * 50;
        }

        System.out.println("Penalty: " + penalty);

        sc.close();
    }
}