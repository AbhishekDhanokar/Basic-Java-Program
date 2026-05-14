// 44. Determine hydration level based on water intake

import java.util.Scanner;

public class Hydration {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water intake (liters): ");
        double w = sc.nextDouble();

        if (w < 2)
            System.out.println("Low Hydration");
        else if (w <= 3)
            System.out.println("Normal Hydration");
        else
            System.out.println("Well Hydrated");

        sc.close();
    }
}