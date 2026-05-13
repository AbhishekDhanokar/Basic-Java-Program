//14)ASCII Character Check 

import java.util.Scanner;

class ASCIICharacterCheck{
     public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter ASCII value : ");
	int num = sc.nextInt();;

	if(num >= 0 && num <= 127){
 	  System.out.println("ASCII Value");
	}
	else{
	 System.out.println("Not ASCII Value");
	}
     }
}