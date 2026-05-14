//25.Determine body temperature status: Hypothermia, Normal, Fever, High Fever

import java.util.Scanner;

public class BodyTemperatureStatus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter body temperature (°C): ");
        double temp = sc.nextDouble();

        if (temp < 35.0)
            System.out.println("Hypothermia");
        else if (temp <= 37.0)
            System.out.println("Normal");
        else if (temp <= 38.5)
            System.out.println("Fever");
        else
            System.out.println("High Fever");

        sc.close();
    }
}