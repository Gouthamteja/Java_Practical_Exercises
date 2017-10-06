package classes_and_objects;

import java.util.Scanner;

public class PE5 {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Is even: " + isEven(sc.nextInt()));
	}
	public static boolean isEven(int number) {
		return (number%2==0) ;
	}
}
