//13)Check Equality 

import java.util.Scanner;

class CheckEquality{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Number: ");
        int num1 = sc.nextInt();

	System.out.print("Enter Your Second Number: ");
        int num2 = sc.nextInt();

        if (num1==num2) {
         System.out.println("Equal");
        }
	else{
         System.out.println("Not Equal");
        }
}
}
