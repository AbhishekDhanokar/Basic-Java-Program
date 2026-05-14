//30.Determine water level status (Empty, Low, Medium, Full, Overflow).

import java.util.Scanner;

public class WaterLevelStatus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water level percentage: ");
        int level = sc.nextInt();

        if (level < 0)
            System.out.println("Invalid Input");
        else if (level == 0)
            System.out.println("Empty");
        else if (level <= 30)
            System.out.println("Low");
        else if (level <= 70)
            System.out.println("Medium");
        else if (level <= 100)
            System.out.println("Full");
        else
            System.out.println("Overflow");

        sc.close();
    }
}