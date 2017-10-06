import java.util.Scanner;

public class PE6 {
	public static void main(String[] args) {
		PE6 pe = new PE6();
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		Demo demo = (a) -> a*2; 
		System.out.println(demo.multiply(i));
	}  
}
@FunctionalInterface
interface Demo{
	int multiply(int i);
}
