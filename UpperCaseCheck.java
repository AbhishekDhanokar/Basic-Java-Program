//6)Character Uppercase Check 

import java.util.Scanner;

class UpperCaseCheck{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Character : ");
	char ch = sc.next().charAt(0);

	if(Character.isUpperCase(ch)){
	   System.out.println("UpperCase");
	}else{
	  System.out.println("LowerCase");
	}
   }

}