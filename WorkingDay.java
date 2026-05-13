//10)Working Day (1–5)  (condition day >= 1 && day <= 5 )

import java.util.Scanner;

class WorkingDay{
    public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Day (1 to 7)");
	int day = sc.nextInt();

       if(day >= 1 && day <= 7){
	   if(day >= 1 && day <= 5){
	      System.out.println("Working Day");
	   }else{
	      System.out.println("Weekend");
	     }
          }
        else{
	 System.out.println("Invalid Input");
      }
    }
}