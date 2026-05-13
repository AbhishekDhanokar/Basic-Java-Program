//3 Greater of Two Numbers

import java.util.Scanner;

class GreaterOfTwoNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Num1 is greater");
        } else if (num2 > num1) {
            System.out.println("Num2 is greater");
        } else {
            System.out.println("Both numbers are equal");
        }

        sc.close();
    }
}


