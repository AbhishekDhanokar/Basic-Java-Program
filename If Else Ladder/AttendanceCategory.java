//29.Categorize exam attendance percentage (Poor, Average, Good, Excellent).

import java.util.Scanner;

public class AttendanceCategory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        int att = sc.nextInt();

        if (att < 0 || att > 100)
            System.out.println("Invalid input");
        else if (att < 50)
            System.out.println("Poor");
        else if (att < 65)
            System.out.println("Average");
        else if (att < 80)
            System.out.println("Good");
        else
            System.out.println("Excellent");

        sc.close();
    }
}