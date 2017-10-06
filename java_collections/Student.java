package java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
	
	private int id; 
	private String name;
	private int age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}

class StudentSorter implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.getAge() == s2.getAge()) {
			
			if(s1.getName().equals(s2.getName())){
				
				return s1.getId() - s2.getId();
				
			} else return s1.getName().compareTo(s2.getName());
			
		} else return s2.getAge() - s1.getAge();
	}
	
}

class Maintest{
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(new Student(1,"Student 1",20));
		arr.add(new Student(2,"Student 2",22));
		arr.add(new Student(3,"Student 3",18));
		arr.add(new Student(4,"Student 4",36));
		arr.add(new Student(5,"Student 5",20));
		arr.add(new Student(6,"Student 6",25));
		

        System.out.println("Unsorted");
        for (int i=0; i<arr.size(); i++) {
        	Student s = arr.get(i);
            System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
        }
		Collections.sort(arr, new StudentSorter());
		

		System.out.println("Sorted");
        for (int i=0; i<arr.size(); i++) {
        	Student s = arr.get(i);
            System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
        }
	}
}
