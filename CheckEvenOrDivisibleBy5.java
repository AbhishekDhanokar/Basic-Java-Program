//2)Check Even OR Divisible by 5  (num % 2 == 0 || num % 5 == 0 )

import java.util.Scanner;

class CheckEvenOrDivisibleBy5{
     public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Number :");
	int num = sc.nextInt();

      String res = (num%2==0 || num%5==0) ? 
		   "Given no is Even Or Divisible By 5" 
		   : "Given no is nither Even Nor dividsible by 5";
	System.out.println(res);
   }
}