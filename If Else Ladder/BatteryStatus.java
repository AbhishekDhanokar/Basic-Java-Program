//27.Categorize battery percentage: Critical, Low, Medium, High, Full.

import java.util.Scanner;

public class BatteryStatus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter battery percentage: ");
        int battery = sc.nextInt();

        if (battery <= 10)
            System.out.println("Critical");
        else if (battery <= 30)
            System.out.println("Low");
        else if (battery <= 70)
            System.out.println("Medium");
        else if (battery <= 90)
            System.out.println("High");
        else
            System.out.println("Full");

        sc.close();
    }
}