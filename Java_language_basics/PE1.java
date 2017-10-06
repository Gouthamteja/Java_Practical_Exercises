import java.util.Scanner;

public class PE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		String str = sc.nextLine();
		
		boolean palin = true;
		int n = str.length(), res = 0, num1, num2;
		
		for(int i = 0; i < n/2;i++) { 
		    
			if( str.charAt(i) != (str.charAt(n-1-i)) ){
				palin = false;
				break;
			}
			
			num1 = str.charAt(i)-'0';
			num2 = str.charAt(n-1-i) - '0';
			
			if(num1%2 == 0)res += num1;
			if(num2%2 == 0)res += num2; 
		}
		
		if(palin) {
		    
			if(n%2 == 1) res += str.charAt(n/2)-'0';
			
			System.out.print(str + " is palindrome and the sum of even numbers is ");
			
			if(res>=25) {
				System.out.println("greater than 25.");
			} else {
				System.out.println("less than 25.");
			}
			
		} else {
			System.out.println(str + " is not a palindrome.");
		}
		
	}

}
