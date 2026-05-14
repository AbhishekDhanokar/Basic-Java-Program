//16.Determine data plan category based on GB usage.

import java.util.Scanner;

class DataPlanCategory{
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Data Uses In GB :");
      double gb = sc.nextDouble();

      if(gb <= 2){
	System.out.println("Basic Plan");
      }
      else if(gb <= 10){
	System.out.println("Standard Plan");
      }
      else if(gb <= 2){
	System.out.println("Premium Plan");
      }
      else if(gb <= 20){
	System.out.println("Unlimited Lite Plan");
      }
      else{
        System.out.println("Unlimited Ultra Plan");
      }
    sc.close();
 }
}