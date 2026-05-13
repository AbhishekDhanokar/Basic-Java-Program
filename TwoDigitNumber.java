//7)Two Digit Number  (num >= 10 && num <= 99) 

import java.util.Scanner;

class TwoDigitNumber{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Your Number : ");
	int num = sc.nextInt();

	if(num >= 10 && num <=99){
	  System.out.println("Number Is Two Digit");
	}
	else{
	  System.out.println("Number is Not Two Digit");
	}
    }
}