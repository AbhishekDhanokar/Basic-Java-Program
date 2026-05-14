//19.	Determine movie ticket price based on age and time slot.
 
import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter time slot (1 = Morning, 2 = Afternoon, 3 = Evening): ");
        int slot = sc.nextInt();

        double price = 0;

        if (age < 0 || age > 120) {
            System.out.println("Invalid age!");
            return;
        }

        if (slot == 1) {
            if (age <= 12) {
                price = 100;
            } else if (age <= 60) {
                price = 150;
            } else {
                price = 120;
            }
        } 
        else if (slot == 2) {
            if (age <= 12) {
                price = 120;
            } else if (age <= 60) {
                price = 180;
            } else {
                price = 150;
            }
        } 
        else if (slot == 3) {
            if (age <= 12) {
                price = 150;
            } else if (age <= 60) {
                price = 220;
            } else {
                price = 180;
            }
        } 
        else {
            System.out.println("Invalid time slot!");
            return;
        }

        System.out.println("Movie Ticket Price: " + price);

        sc.close();
    }
}