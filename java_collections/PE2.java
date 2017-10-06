package java_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class PE2 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		System.out.println("Enter an array: ");
		Scanner sc = new Scanner(System.in);
		String[] splitted = sc.nextLine().split("\\s|[^a-zA-Z0-9]");
        for (String part : splitted) { 
            if(part.matches("[a-zA-Z0-9]+")) {
            	try {
            		hm.put(part,hm.get(part)+1); 
            	}catch(Exception e) {
            		hm.put(part, 1);
            	}
            }
        }
        Iterator i = hm.entrySet().iterator();
	    while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	    }
	    System.out.println();
        sc.close();
	}
}
