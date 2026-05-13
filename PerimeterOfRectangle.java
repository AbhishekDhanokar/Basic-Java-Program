//20)Perimeter of Rectangle 

import java.util.Scanner;

class PerimeterOfRectangle {
   public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Number : ");
	int length = sc.nextInt();
	System.out.println("Enter Second Number : ");
	int breadth = sc.nextInt();

	int perimeter = 2*(length+breadth);
	System.out.println("Area of Rectangle is : " + perimeter);


  }

}