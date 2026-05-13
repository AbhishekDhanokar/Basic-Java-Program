//9)WAP to print  product of last 2 digit in a given number

class ProductOfLastTwoNumber{
    public static void main(String [] args){
	int num = 123;
	
	int a = num%10;
	num = num/10;

	int b = num%10;
	
	int product = a*b;

	System.out.println("Product of "+a +" and "+b + " is : "+product);


    }
}