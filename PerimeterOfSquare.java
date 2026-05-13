//21)Program: Perimeter of Square

import java.util.Scanner;

class PerimeterOfSquare{
    public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter side of square : ");
	int side = sc.nextInt();
	

	int perimeter =  4 * side;
	System.out.println("Perimeter of Square  is : " + perimeter);


  }

}