package javaExercises;

import java.util.Scanner;

public class PE6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); 
		if(str.matches("[a-z]+")) System.out.println("Smallcase letter.");
		else if(str.matches("[A-Z]+")) System.out.println("Capital letter.");
		else if(str.matches("[0-9]+")) System.out.println("Digit");
		else System.out.println("Special symbol.");
	}

}
