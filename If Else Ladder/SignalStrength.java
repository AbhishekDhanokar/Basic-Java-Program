
//28.Determine internet signal strength (No Signal, Weak, Good, Strong).

import java.util.Scanner;

public class SignalStrength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal strength (0-100): ");
        int speed = sc.nextInt();

        if (speed < 10)
            System.out.println("No Signal");
        else if (speed < 30)
            System.out.println("Weak");
        else if (speed < 70)
            System.out.println("Good");
        else
            System.out.println("Strong");

        sc.close();
    }
}