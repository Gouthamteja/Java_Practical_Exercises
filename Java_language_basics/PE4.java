 
import java.util.Scanner;

public class PE4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		for(int i = 1; i < num+1 ; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(i);
			}
		}
	}

}
