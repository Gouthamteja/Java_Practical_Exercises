package classes_and_objects;

import java.util.Scanner;

public class MemberVariable {
	public static void main(String[] args) { 
		Member member = new Member("Harry Potter",30,2500.3);
		System.out.println("Member's Name: " + member.getName());
		System.out.println("Member's Age: " + member.getAge());
		System.out.println("Member's Salary: " + member.getSalary());
	}
}
