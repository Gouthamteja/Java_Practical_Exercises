package inheritance_and_classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PE2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
	    calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	    DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy"); 
	    System.out.println(df.format(calendar.getTime()));
	    calendar.add(calendar.DATE, 6);
	    System.out.println(df.format(calendar.getTime()));
	}
	
}
