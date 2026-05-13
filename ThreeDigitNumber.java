//8)Three Digit Number  (num >= 100 && num <= 999 )

import java.util.Scanner;

class ThreeDigitNumber{
   public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Your Number : ");
	int num = sc.nextInt();

	if(num >= 100 && num <=999){
	 System.out.println("Three Digit");
	}
	else{
	 System.out.println("Not Three Digit");
	}
   }
}