//15)WAP to Reverse a 3 digit number

class ReverseThreeNumber{
     public static void main(String [] args){
	int num = 123;

	int Last = num%10;
	int Middle = (num/10)%10;
	int First = num/100;
       
	int res = Last*100+Middle*10+First;
	System.out.println(res);
     }


}