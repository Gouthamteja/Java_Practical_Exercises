package classes_and_objects;

import java.io.File;
import java.io.FileInputStream; 
import java.io.IOException;
import java.util.Scanner; 

public class PE9 {	
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the complete directory path for reading files: ");
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		File folder = new File(path);
		File[] files = folder.listFiles();

		System.out.println("Enter the file extensions you wish to render: ");
		String extension = sc.nextLine();
		
		for(int i = 0; i < files.length; i ++) {
			
			String name = files[i].getName();
			name = name.substring(name.lastIndexOf('.')+1);
			if(name.equals(extension)) { 
				
				byte[] bytesArray = new byte[(int) files[i].length()]; 
				FileInputStream fis = new FileInputStream(files[i]);
				fis.read(bytesArray);
				
				for (int j = 0; j < bytesArray.length; j++){
					
				    System.out.print((char) bytesArray[j]);
				    
				 }     
				
				fis.close(); 
			}
		}
		sc.close();
	}

}
