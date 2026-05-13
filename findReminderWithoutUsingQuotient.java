//13)WAP to find Remainder without using quotient  

class findReminderWithoutUsingQuotient{
     public static void main(String [] args){
	int a = 17;
	int b = 5;
	int quotient = a/b;
	int reminder = a - (b*quotient);
	System.out.println(reminder);
     }
}