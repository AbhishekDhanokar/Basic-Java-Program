//32.Determine fuel tank status (Empty, Reserve, Half, Full).

import java.util.Scanner;

public class FuelTankStatus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fuel level percentage: ");
        int fuel = sc.nextInt();

        if (fuel < 0 || fuel > 100)
            System.out.println("Invalid Input");
        else if (fuel == 0)
            System.out.println("Empty");
        else if (fuel <= 15)
            System.out.println("Reserve");
        else if (fuel <= 60)
            System.out.println("Half");
        else
            System.out.println("Full");

        sc.close();
    }
}