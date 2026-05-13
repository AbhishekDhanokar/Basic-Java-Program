//5 Eligible to Vote

import java.util.Scanner;

class EligibleToVote{
     public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number : ");
	int num = sc.nextInt();
	
	if(num>18){
	System.out.println("Eligible To Vote : ");
	}
	else{
	System.out.println("Not Eligible To Vote : ");
	}

     }

}