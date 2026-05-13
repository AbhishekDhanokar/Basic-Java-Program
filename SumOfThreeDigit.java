//16)WAP to perform sum of 3 digit

class SumOfThreeDigit{
    public static void main(String [] args){
	int num = 456;
	
	int first = num%10;
	int middle = (num/10)%10;
	int last = num/100;

	int sum = first+middle+last;
	System.out.println(sum);

    }

}