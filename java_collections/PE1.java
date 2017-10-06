package java_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PE1 {
	public static void main(String[] args) {
		System.out.println("Enter an array: ");
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		sc.close();
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("List is instance of ArrayList: " + (list instanceof ArrayList));
	}
}
