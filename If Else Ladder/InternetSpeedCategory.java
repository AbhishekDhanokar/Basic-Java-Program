//12.Categorize internet speed into Slow, Moderate, Fast, Ultra-Fast.

import java.util.Scanner;

public class InternetSpeedCategory {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter internet speed (in Mbps): ");
        double speed = sc.nextDouble();

        if (speed < 5) {
            System.out.println("Speed Category: Slow");
        } 
        else if (speed < 20) {
            System.out.println("Speed Category: Moderate");
        } 
        else if (speed < 50) {
            System.out.println("Speed Category: Fast");
        } 
        else {
            System.out.println("Speed Category: Ultra-Fast");
        }

        sc.close();
    }
}