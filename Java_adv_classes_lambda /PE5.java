import java.util.Scanner;

public class PE5 {
	public static void main(String[] args) {
		PE5 pe = new PE5(); 
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		DemoInterface demoInterface = (string) -> System.out.println(string.length());
		demoInterface.testMethod(str);
		sc.close();
	} 
}
@FunctionalInterface
interface DemoInterface{
	void testMethod(String str);
}