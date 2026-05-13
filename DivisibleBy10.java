//17)Divisible by 10 

import java.util.Scanner;

class DivisibleBy10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();

        if (num%10==0) {
         System.out.println("Number Is divisible by 10");
        }
	else{
         System.out.println("Not Number Is divisible by 10");
        }
}
} 