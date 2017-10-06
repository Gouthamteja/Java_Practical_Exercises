package classes_and_objects;

import java.util.Scanner;

public class PE2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double log = Math.log(num)/Math.log(4);
		if(log % 1 == 0) System.out.println("Power of 4");
		else System.out.println("Not power of 4");
	}
}
