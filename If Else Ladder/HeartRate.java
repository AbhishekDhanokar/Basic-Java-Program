// 41. Categorize heart rate (Low, Normal, Elevated, High)

import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter heart rate: ");
        int hr = sc.nextInt();

        if (hr < 60)
            System.out.println("Low");
        else if (hr <= 100)
            System.out.println("Normal");
        else if (hr <= 120)
            System.out.println("Elevated");
        else
            System.out.println("High");

        sc.close();
    }
}