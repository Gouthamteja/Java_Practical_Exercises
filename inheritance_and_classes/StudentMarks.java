package inheritance_and_classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		System.out.println("Enter number of students: ");
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		int stuGrades[] = new int[numOfStudents];
		int total = 0, grades_min = 101, grades_max = -1;
		try {
		for(int i = 0; i<numOfStudents; i++) {
			System.out.println("Enter the grade for Student" + (i+1) + ": ");
			stuGrades[i] = sc.nextInt();
			if(stuGrades[i]<0 || stuGrades[i]>100) throw new Exception();
			total += stuGrades[i];
			grades_min = Math.min(stuGrades[i], grades_min);
			grades_max = Math.max(stuGrades[i], grades_max);
		}
		System.out.println("The average is " + (double) total/numOfStudents);
		System.out.println("The minimum is " + grades_min); 
		System.out.println("The maximum is " + grades_max);
		}catch(Exception e) {
			System.out.println("Please input the grades between 0 and 100!");
		}
	}
}
