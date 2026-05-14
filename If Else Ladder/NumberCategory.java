//24.Categorize a number as Very Small (<10), Small, Medium, Large, Very Large (>1000).

import java.util.Scanner;

public class NumberCategory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 10)
            System.out.println("Very Small");
        else if (n <= 100)
            System.out.println("Small");
        else if (n <= 500)
            System.out.println("Medium");
        else if (n <= 1000)
            System.out.println("Large");
        else
            System.out.println("Very Large");

        sc.close();
    }
}