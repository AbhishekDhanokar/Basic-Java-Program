//10)WAP to print product of last 3 digit in a given number 

class ProductOfLastThreeNumber{
     public static void main(String [] args){
	int num = 3462;

	int a = num%10;
	num = num/10;

	int b = num%10;
	num = num/2;

	int c = num%10;
 	num = num/10;

	int product = a*b*c;
	System.out.println("Product of " + a +","+ b +","+ c + " = " + product);

    }
}