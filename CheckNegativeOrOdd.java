import java.util.Scanner;

class CheckNegativeOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if (num < 0 || num % 2 != 0) {
            System.out.println("Negative OR Odd");
        } else {
            System.out.println("Not Negative and Not Odd");
        }
    }
}