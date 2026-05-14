//10.	Marks classification

import java.util.Scanner;

class MarksClassification{
      public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Marks :");
	int marks = sc.nextInt();

	if(marks < 35){
    	   System.out.println("Fail");
	}
	else if(marks < 60){
 	  System.out.println("Pass");
	}
	else if(marks < 75){
         System.out.println("First Class");
	}
	else{
    	 System.out.println("Distinction");
	}
      }
}


