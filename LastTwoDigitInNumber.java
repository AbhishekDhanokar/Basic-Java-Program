//6)WAP to print last 2 digit in a given number 

class LastTwoDigitInNumber{
     public static void main (String [] args){
	int num = 123;

	int a = num % 10;
	num = num/10;

	int b = num%10;

	System.out.println("Last First Number is : "+ a);
	System.out.println("Last Second Number is : "+ b);


     }
}
