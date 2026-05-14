// 39. Determine reward points category based on purchase value

import java.util.Scanner;

public class RewardPoints {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase value: ");
        double amt = sc.nextDouble();

        if (amt < 500)
            System.out.println("Low Points");
        else if (amt < 2000)
            System.out.println("Medium Points");
        else if (amt < 5000)
            System.out.println("High Points");
        else
            System.out.println("Premium Points");

        sc.close();
    }
}