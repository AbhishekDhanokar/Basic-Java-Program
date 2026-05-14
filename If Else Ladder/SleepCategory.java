// 42. Categorize sleep duration (Insufficient, Adequate, Oversleep)

import java.util.Scanner;

public class SleepCategory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sleep hours: ");
        int h = sc.nextInt();

        if (h < 5)
            System.out.println("Insufficient");
        else if (h <= 8)
            System.out.println("Adequate");
        else
            System.out.println("Oversleep");

        sc.close();
    }
}