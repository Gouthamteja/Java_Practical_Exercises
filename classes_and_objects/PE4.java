package classes_and_objects;

import java.io.*;

public class PE4 {
	public static void main(String[] args) throws IOException {
		try{
			InputStream f = new FileInputStream("/home/akshay/Downloads/Practice/04 Spring/01 Practical Exercises/classes_and_objects/src/classes_and_objects/java.txt");
			int i = 0;
			while((i=f.read())!=-1){    
				i = Character.toUpperCase(i);
	             System.out.print((char)i);    
	        }    
	        f.close();       
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
