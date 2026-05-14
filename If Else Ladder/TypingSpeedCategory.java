//26.Determine typing speed category based on WPM.

import java.util.Scanner;

public class TypingSpeedCategory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter typing speed (WPM): ");
        int wpm = sc.nextInt();

        if (wpm < 20)
            System.out.println("Slow Typing");
        else if (wpm <= 40)
            System.out.println("Average Typing");
        else if (wpm <= 60)
            System.out.println("Fast Typing");
        else
            System.out.println("Very Fast Typing");

        sc.close();
    }
}