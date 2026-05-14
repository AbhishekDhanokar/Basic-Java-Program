//36.Attendance-based eligibility (Not Eligible, Eligible, Excellent Record).

import java.util.Scanner;

public class AttendanceEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        int att = sc.nextInt();

        if (att < 0 || att > 100)
            System.out.println("Invalid Input");
        else if (att < 60)
            System.out.println("Not Eligible");
        else if (att < 85)
            System.out.println("Eligible");
        else
            System.out.println("Excellent Record");

        sc.close();
    }
}