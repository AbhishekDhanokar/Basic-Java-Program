//15.Determine mobile recharge bonus based on recharge amount.

import java.util.Scanner;

public class MobileRechargeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter recharge amount: ");
        double amount = sc.nextDouble();

        double bonus = 0;

        if (amount < 100) {
            bonus = 0;
        } 
        else if (amount < 200) {
            bonus = 10;
        } 
        else if (amount < 500) {
            bonus = 25;
        } 
        else if (amount < 1000) {
            bonus = 50;
        } 
        else {
            bonus = 100;
        }

        System.out.println("Recharge Amount: " + amount);
        System.out.println("Bonus Received: " + bonus);

        sc.close();
    }
}