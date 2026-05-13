//8)WAP to print sum of last 3 digit in a given number 

class SwapAndAddLastThreeNumber{
      public static void main(String [] args){
	int num = 1234;
 	
	int a = num%10;
	num = num/10;

	int b = num%10;
	num = num/10;

	int c = num%10;
		
	 int sum = a+b+c;

	System.out.println("Sum of All Number are "+sum);
     }
}