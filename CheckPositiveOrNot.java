//14)Write a program to check number is +ve or not

import java.util.Scanner;

class CheckPositiveOrNot{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Number: ");
        int num = sc.nextInt();

        if (num>0) {
         System.out.println("Number is Positive");
        }
	else if (num<0) {
         System.out.println("Number is Negative");
        }
	else{
         System.out.println("Number is Zero");
        }
   }
}
