package javaExercises;

import java.util.Arrays; 
import java.util.Scanner;

public class PE7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String str[] = sc.nextLine().split(""); 
		Arrays.sort(str);
		int sum = 0,num;
		System.out.print("Sorted number in non-increasing order : ");
		for(int i = str.length-1;i>=0;i--) {
			System.out.print(str[i]);
			num = Integer.parseInt(str[i]);
			if(num%2 == 0) sum += num;
		}
		System.out.println();
		if(sum>15) System.out.println("True");
		else System.out.println("False");
		
	}
}
