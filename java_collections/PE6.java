package java_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PE6 {
	
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();

		System.out.println("Enter an array: ");
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		
		System.out.println("Before sorting: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			tree.add(arr[i]);
		}

		System.out.println();
		System.out.println("After sorting: ");
		
		Iterator<String> it = tree.iterator(); 
		ArrayList<String> str = new ArrayList<String>(tree);
		String s;
		
		while(it.hasNext()) {
			s = it.next();
			System.out.print(s + " "); 
		}
		
		System.out.println();
		System.out.println("After sorting (ArrayList): ");
		
		for(int i = 0; i < str.size(); i++) System.out.print(str.get(i)  + " ");
		sc.close();
		
	}

}
