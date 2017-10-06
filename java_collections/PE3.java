package java_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class PE3 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		System.out.println("Enter an array: ");
		Scanner sc = new Scanner(System.in);
		String[] splitted = sc.nextLine().split(" ");
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
        HashMap<String, Boolean> ret = new HashMap<String, Boolean>();
	    while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         if((int) me.getValue() >= 2) ret.put((String) me.getKey(), true);
	         else ret.put((String) me.getKey(), false);
	    }
	    Iterator r = ret.entrySet().iterator();
	    while(r.hasNext()) {
	    	Map.Entry me = (Map.Entry)r.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	    }
        sc.close();
	}
}
