package inheritance_and_classes;

import java.util.Scanner;

public class PE3 {
	public static void main(String[] args) {
		String line = "";
		Scanner sc = new Scanner(System.in);
		while((line = sc.nextLine()) != "") {
			System.out.println(line.replaceAll("[aeiou]", ""));
		}
	}
}
