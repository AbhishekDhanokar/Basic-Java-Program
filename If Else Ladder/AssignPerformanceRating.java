//5.Assign performance rating (Excellent, Good, Average, Poor)

import java.util.Scanner;

class AssignPerformanceRating{
      public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Score : ");
	int score = sc.nextInt();
	
	if(score >= 90){
          System.out.println("Excellent");
	}
	else if(score >= 70){
          System.out.println("Good");
	}
	else if(score >= 50){
          System.out.println("Average");
	}
        else{
          System.out.println("Poor");
	}
    }
}
