package java_misc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PE6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Pattern p = Pattern.compile("se");
//		str = str.replaceAll("\\\\n", "\n");
		String word = sc.nextLine();
        Matcher m = p.matcher(str);
        System.out.println(m.find());
        while (m.find())
           System.out.println("Found [" + m.group() + "] starting at "
                              + (m.start()) + " and ending at " + (m.end() ));
	}
}
