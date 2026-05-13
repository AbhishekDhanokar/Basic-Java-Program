//9)Character is Lowercase or not

import java.util.Scanner;

class ChekCharacterIsLowerCaseOrNot{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Character  :");
	char ch = sc.next().charAt(0);
	
	if(Character.isUpperCase(ch))v{
	  System.out.println("Uppercase");
	}
	else{
	  System.out.println("LowerCase");
	}

    }

}