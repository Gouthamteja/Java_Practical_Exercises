package inheritance_and_classes;

import java.util.Scanner;

public class PE1 {
	public static void main(String[] args) { 
		System.out.println("Enter number of rows and colums: ");
		Scanner sc1 = new Scanner(System.in);
		
		int numOfRows = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int numOfCols = sc2.nextInt();
		System.out.println();
		try {
			Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the first matrix: "); 
		String firstMatrix[] = sc.nextLine().trim().split("\\s+");
		
		System.out.println("Enter the elements of the second matrix: "); 
		String secondMatrix[] = sc.nextLine().trim().split("\\s+");
		
		
		int[][] matrix1 = new int[numOfRows][numOfCols];
		int[][] matrix2 = new int[numOfRows][numOfCols];
		
		//Forming 2 dimensional matrices from one dimensional even though not really required for the problem purposes only for practice purposes
		
		for(int i = 0; i < numOfRows*numOfCols; i++) {
			//System.out.println(firstMatrix[i] + " " + secondMatrix[i]);
			matrix1[i/numOfRows][i%numOfCols] = Integer.parseInt(firstMatrix[i]);
			matrix2[i/numOfRows][i%numOfCols] = Integer.parseInt(secondMatrix[i]);
			//System.out.println(matrix1[i/numOfRows][i%numOfCols] + matrix2[i/numOfRows][i%numOfCols]);
		} 
		
		for(int i = 0; i < numOfRows; i++) {
			for(int j = 0; j < numOfCols; j++) {
				System.out.println("result[" + i + "][" + j + "]: " + (matrix1[i][j] + matrix2[i][j]));
			}
		}
		sc.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
