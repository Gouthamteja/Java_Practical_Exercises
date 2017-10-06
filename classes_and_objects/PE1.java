package classes_and_objects;

import java.util.Scanner;

public class PE1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = new StringBuffer(str1).reverse().toString();
		System.out.println(str2);
		if(str1.equals(str2)) System.out.println("Palindrome");
		else System.out.println("Not a palindrome");

	}
}
