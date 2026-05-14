//31.Categorize screen brightness level (Very Dim to Very Bright).

import java.util.Scanner;

public class ScreenBrightness {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brightness level (0-100): ");
        int b = sc.nextInt();

        if (b < 0 || b > 100)
            System.out.println("Invalid Input");
        else if (b <= 20)
            System.out.println("Very Dim");
        else if (b <= 40)
            System.out.println("Dim");
        else if (b <= 60)
            System.out.println("Normal");
        else if (b <= 80)
            System.out.println("Bright");
        else
            System.out.println("Very Bright");

        sc.close();
    }
}