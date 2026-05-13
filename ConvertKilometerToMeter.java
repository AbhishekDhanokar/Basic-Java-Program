//31)Convert Kilometers to Meters

import java.util.Scanner;

class ConvertKilometerToMeter{
      public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Distance in kilometers : ");
	double kilometers = sc.nextDouble();

	double meters = kilometers * 1000;
        System.out.println(meters);
  }
}
