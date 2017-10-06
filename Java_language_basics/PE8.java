package javaExercises;

import java.util.Scanner;
import java.util.Random;

public class PE8 {
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Guess a number between 1 and 100!"); 
		Random rand = new Random(); 
		int num,n = rand.nextInt(100) + 1; 
		do{
			num = sc.nextInt();
			if(num>n) System.out.println("Number guessed is more than original number.");
			if(num<n) System.out.println("Number guessed is less than original number.");
			if(num==n) {
				System.out.println(" Number guessed matches the original number.");break;
			}
		}while(num != n);
	}
}
