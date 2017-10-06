import java.util.Scanner;

public class PE7 {
	public static void main(String[] args) {
		PE6 pe = new PE6();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		DemoInt demo = (a,b) -> a%b==0; 
		System.out.println(demo.isFactor(i,j));
	} 
}
@FunctionalInterface
interface DemoInt{
	boolean isFactor(int a,int b);
}