//12)WAP to delete last 2 digit in a given number 

class DeleteLastTwoNumber{
     public static void main(String [] args){
	int num = 4563;
	num = (num/10)/10;

	System.out.println("After Deleting Last 2 Number :"+num);
     }
}