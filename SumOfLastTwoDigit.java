//7)WAP to print sum of last 2 digit in a given number

class SumOfLastTwoDigit{
    public static void main(String [] args){
	int num = 123;
	
	int a = num%10;
	num = num/10;

	int b = num%10;
	
	int c = a+b;

	System.out.println("Sum of : "+ a +" and "+"Sum of b : "+b + " = "+c);


   }
}