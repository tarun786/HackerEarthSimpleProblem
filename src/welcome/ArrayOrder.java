package welcome;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class ArrayOrder {

	public static void main(String[] args) throws ParseException {


long mili=System.currentTimeMillis();

java.sql.Date date=new java.sql.Date(mili);
System.out.println(date);
		
long mili1=System.currentTimeMillis();
java.util.Date date1=new java.util.Date(mili1);
System.out.println(date1);


Calendar cal=Calendar.getInstance();
Date d=cal.getTime();
System.out.println(d);
		
		
		Date d1=new Date();
		String datefor=DateFormat.getDateInstance(DateFormat.SHORT).format(d1);
		System.out.println(datefor);
		
		Date d2=new Date();
		String time=DateFormat.getTimeInstance(DateFormat.MEDIUM).format(d2);
		System.out.println(time);
		
		Date d3=new Date();
		Date t1=DateFormat.getDateInstance().parse("4 Mar,2015");
		System.out.println(t1);
		
		
	}

}
