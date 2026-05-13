//19)Area of Rectangle 

import java.util.Scanner;

class AreaOfRectangle{
   public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Number : ");
	int length = sc.nextInt();
	System.out.println("Enter Second Number : ");
	int breadth = sc.nextInt();

	int area = length*breadth;
	System.out.println("Area of Rectangle is : " + area);


  }

}