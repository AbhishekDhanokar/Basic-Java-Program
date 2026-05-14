//4.Classify temperature as cold, normal, hot, very hot.

import java.util.Scanner;

class Temperature{
     public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Temperature : ");
	int temp = sc.nextInt();

	if(temp < 10)
   	   System.out.println("Cold");
	else if(temp <= 25)
    	   System.out.println("Normal");
	else if(temp <= 35)
    	   System.out.println("Hot");
	else
    	  System.out.println("Very Hot");

     }
}