//11)Largest of Three Numbers 

import java.util.Scanner;

class LargestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter Number 3: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Num1 is the largest : "+num1);
        } 
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Num2 is the largest : "+num2);
        } 
        else {
            System.out.println("Num3 is the largest : "+num3);
        }
    }
}