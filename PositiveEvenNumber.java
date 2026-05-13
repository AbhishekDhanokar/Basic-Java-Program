//2)Check Positive Even Number

import java.util.Scanner;

class PositiveEvenNumber{
     public static void main(String [] arge){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number : ");
	int num = sc.nextInt();  

	if(num > 0 && num%2==0){
	  System.out.println("Positive Even");
	}else{
	  System.out.println("NOT POSTIVE EVEN");
	}
	
     }

}