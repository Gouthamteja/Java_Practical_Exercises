package classes_and_objects;

public class PE8 {
	public static void main(String[] args) { 
		int i = 1;
		long fact = 1;  
		while(true) {
			if(fact <= (Long.MAX_VALUE/i)){
				System.out.println("The factorial of " + i + " is " + i*fact);
				fact *= i;
			}else{
				System.out.println("The factorial of " + i + " is over the range.");
				break;
			}
			i++;  
		} 
	}
}
