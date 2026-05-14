//11.Age based ticket price

import java.util.Scanner;

class AgeBasedTicketPrice{
     public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Age : ");
	int age = sc.nextInt();

	if(age < 12)
    	  System.out.println("Child Ticket");
	else if(age <= 60)
    	 System.out.println("Adult Ticket");
	else
    	 System.out.println("Senior Citizen Discount");
     }
}

