// 47. Determine software version category

import java.util.Scanner;

public class SoftwareVersion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter version (1-4): ");
        int v = sc.nextInt();

        if (v == 1)
            System.out.println("Outdated");
        else if (v == 2)
            System.out.println("Stable");
        else if (v == 3)
            System.out.println("Latest");
        else if (v == 4)
            System.out.println("Beta");
        else
            System.out.println("Invalid Version");

        sc.close();
    }
}