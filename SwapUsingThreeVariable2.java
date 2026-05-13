//3. WAP to swap two values without using third variable using * and / 

class SwapUsingThreeVariable2{
     public static void main(String [] args){
	int a = 10;
	int b = 20;

	a = a*b;
	b = a/b;
        a = a/b;

	System.out.println("a : "+a);
	System.out.println("b : "+b);

    }
}