//4)Multiple of 3 OR 7 

import java.util.*;

class MultipleOf3Or7{
     public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number Here : ");
	int num = sc.nextInt();

	if(num/3==0 || num/7==0){
	  System.out.println("Number is Multiple of 3 Or Number Is multiple of 7"); 
	}else{
          System.out.println("Number is not Multiple of 3 Or Number Is not multiple of 7");
	}
     }
}