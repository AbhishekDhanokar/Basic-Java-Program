//15)Eligible to Marry


import java.util.Scanner;

class CheckEqualityForMarry{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Number: ");
        int num = sc.nextInt();

        if (num>20) {
         System.out.println("Eligible to Marry");
        }
	else{
         System.out.println("Not Eligible to Marry");
        }
}
}