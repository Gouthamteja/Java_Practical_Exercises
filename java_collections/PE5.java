package java_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PE5 {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>(); 
		hm.put("val1","mars");
		hm.put("val2","saturn");
		Iterator i = hm.entrySet().iterator();
		System.out.println("Before changes ");
	    while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	    }
	    System.out.println();
		hm.put("val2",hm.get("val1"));
		hm.put("val1", "");
		
		Iterator<Entry<String, String>> i1 = hm.entrySet().iterator();

		System.out.println("After changes ");
	    while(i1.hasNext()) {
	         Map.Entry me = (Map.Entry)i1.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	    }
	    System.out.println();
	}
}
