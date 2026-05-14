// 38. Categorize investment risk (Low, Moderate, High, Very High)

import java.util.Scanner;

public class InvestmentRisk {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double amt = sc.nextDouble();

        if (amt < 10000)
            System.out.println("Low Risk");
        else if (amt < 50000)
            System.out.println("Moderate Risk");
        else if (amt < 100000)
            System.out.println("High Risk");
        else
            System.out.println("Very High Risk");

        sc.close();
    }
}