// 43. Categorize sugar level (Low, Normal, Prediabetic, Diabetic)

import java.util.Scanner;

public class SugarLevel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sugar level: ");
        int s = sc.nextInt();

        if (s < 70)
            System.out.println("Low");
        else if (s <= 99)
            System.out.println("Normal");
        else if (s <= 125)
            System.out.println("Prediabetic");
        else
            System.out.println("Diabetic");

        sc.close();
    }
}