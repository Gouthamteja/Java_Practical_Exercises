
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PE3 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedreader = new BufferedReader(
	            new InputStreamReader(System.in));
		try{
			String str = bufferedreader.readLine(); 
			if(!str.matches("[a-zA-Z]+")) throw new IOException();
			int ascii;
			String result = "";
			ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(97,101,105,111,117,65,69,73,79,85));
			for(int i =0;i<str.length();i++) {
			ascii = (int) str.charAt(i);
			if(arr.contains(ascii)) result += "Vowel ";
			else result += "Consonant ";
		}
		System.out.println(result.trim());
		}catch(IOException e){
			System.out.println("Entered value is not a string");
		}
	}
}
