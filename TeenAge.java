//11)Teen Age (13–19) 

import java.util.Scanner;

class TeenAge{
   public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Age");
	int age = sc.nextInt();

	if(age <= 13){
	  System.out.println("Child");
	}
	else if(age >= 13 && age <= 19){
	  System.out.println("Teen Age");
	}
	else{
	  System.out.println("Adult");
	}
   }
}