import java.util.Scanner;

public class PE2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		if(num < 30 && num > 20) {
			if(num%2 == 0) System.out.println("Tom");
			else System.out.println("Jerry");
		}
	}
}
