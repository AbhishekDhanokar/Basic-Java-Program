//13) Digit Check  (ch >= '0' && ch <= '9' )

import java.util.Scanner;

class DigitCheck{
   public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your Number :");
	char ch = sc.next().charAt(0);

	if(ch >= '0' && ch <= '9'){
	  System.out.println("Given Number Is Digit");
	}
	else{
	  System.out.println("Given Number Is Not Digit");
	}

  }
}