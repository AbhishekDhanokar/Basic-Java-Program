//6 Pass or Fail


import java.util.Scanner;

class PassOrFail{
     public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number : ");
	int marks = sc.nextInt();
	
	if(marks>=35){
	System.out.println("Pass");
	}
	else{
	System.out.println("Fail");
	}

     }


}