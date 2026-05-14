//6.Determine shipping charges based on weight slabs.

import java.util.Scanner;

class ShippingCharges{
      public static void main(String [] args){
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter Weight : ");
	 int weight = sc.nextInt();

	 if(weight <= 1){
 	    System.out.println("Charges are 50");
	 }
	else if(weight <= 5){
 	    System.out.println("Charges are 100");
	 }
	 else if(weight <= 10){
 	    System.out.println("Charges are 150");
	 }
	 else{
	    System.out.println("Charges are 200");
	 }
	 
      }
}