package classes_and_objects;

import java.util.Scanner;

public class PE6 {
	public static void main(String[] args) {
		System.out.println("Enter number of students: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int grades[] = new int[n];
		int total = 0, grades_min = 101, grades_max = -1;
		for(int i = 0; i<n; i++) {
			System.out.println("Enter the grade for Student" + (i+1) + ": ");
			grades[i] = sc.nextInt();
			total += grades[i];
			grades_min = Math.min(grades[i], grades_min);
			grades_max = Math.max(grades[i], grades_max);
		}
		System.out.println("The average is " + (double) total/n);
		System.out.println("The minimum is " + grades_min); 
		System.out.println("The maximum is " + grades_max);
	}
}	
