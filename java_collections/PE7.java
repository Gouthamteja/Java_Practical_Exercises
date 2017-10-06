package java_collections;

import java.util.ArrayList; 

public class PE7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> c1= new ArrayList<String>();
		c1.add("Java");
		c1.add("C");
		c1.add("C++");
		c1.add("Python");
		c1.add("JavaScript");
		
		ArrayList<String> c2= new ArrayList<String>();
		c2.add("Java");
		c2.add("Angular");
		c2.add("C++");
		c2.add("JavaScript");
		
		ArrayList<String> ret = new ArrayList<String>();
		
		for(int i = 0; i < c1.size(); i++) {
			if(c2.contains(c1.get(i))) ret.add("Yes");
			else ret.add("No");
		}
		
		for(int i = 0; i < ret.size(); i++) System.out.println(ret.get(i));
	}

}
