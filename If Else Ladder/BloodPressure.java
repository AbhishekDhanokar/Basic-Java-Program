//21.Classify blood pressure level (Low, Normal, High).

import java.util.Scanner;

public class BloodPressure {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter blood pressure value: ");
        int bp = sc.nextInt();

        if (bp < 80) {
            System.out.println("Blood Pressure Level: Low");
        }
        else if (bp <= 120) {
            System.out.println("Blood Pressure Level: Normal");
        }
        else {
            System.out.println("Blood Pressure Level: High");
        }

        sc.close();
    }
}