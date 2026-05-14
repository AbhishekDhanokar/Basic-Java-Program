// 45. Categorize file size (Small, Medium, Large, Very Large)

import java.util.Scanner;

public class FileSize {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file size (MB): ");
        double f = sc.nextDouble();

        if (f < 10)
            System.out.println("Small");
        else if (f < 100)
            System.out.println("Medium");
        else if (f < 1000)
            System.out.println("Large");
        else
            System.out.println("Very Large");

        sc.close();
    }
}