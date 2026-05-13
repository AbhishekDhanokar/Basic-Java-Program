//18)Smallest of Three Numbers 

class SmallestOfThreeNumber{
    public static void main (String [] args){
	int a = 24;
	int b = 22;
	int c = 56;

	if(a<b && a<c){
	 System.out.println("a is smaller");
	}
	else if(b<a && b<c){
	 System.out.println("b is smaller");
	}
	else{
	 System.out.println("c is smaller");
	}

    }
}