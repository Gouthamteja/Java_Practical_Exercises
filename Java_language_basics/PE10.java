package javaExercises;

import java.util.Scanner;

public class PE10 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); 
		Integer num = sc.nextInt();
		System.out.print(str);
		for(int i = 0; i<num;i++) {
			System.out.print(str.substring(str.length()-num));
		}
	}
}
