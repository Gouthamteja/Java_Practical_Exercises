package classes_and_objects;

public class PE7 {
	public static void main(String[] args) {
		int i = 1;
		int fact = 1; 
		while(true) {
			if(fact <= (Integer.MAX_VALUE/i)){
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
