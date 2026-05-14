// 40. Categorize loan tenure into Short, Medium, Long term

import java.util.Scanner;

public class LoanTenure {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan tenure (years): ");
        int y = sc.nextInt();

        if (y <= 2)
            System.out.println("Short Term");
        else if (y <= 5)
            System.out.println("Medium Term");
        else
            System.out.println("Long Term");

        sc.close();
    }
}