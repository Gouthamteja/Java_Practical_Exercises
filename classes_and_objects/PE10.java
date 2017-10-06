package classes_and_objects;

import java.io.BufferedReader;
import java.io.File; 
import java.io.FileReader;
import java.io.IOException; 
import java.util.*; 

public class PE10 {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the complete directory path for reading files: ");
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		File file = new File(path); 
		BufferedReader in = null;
		try {
		    in = new BufferedReader(new FileReader(file));
		    String read = null;
		    HashMap<String, Integer> hm = new HashMap<String, Integer>();
		    while ((read = in.readLine()) != null) {
		        String[] splitted = read.split(" ");
		        for (String part : splitted) {
		            if(part.matches("[a-zA-Z0-9]+")) {
		            	try {
		            		hm.put(part,hm.get(part)+1); 
		            	}catch(Exception e) {
		            		hm.put(part, 1);
		            	}
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
		} catch (IOException e) {
		    System.out.println("There was a problem: " + e);
		    e.printStackTrace();
		} finally {
		    try {
		        in.close();
		    } catch (Exception e) {
		    }
		}
	}
}
