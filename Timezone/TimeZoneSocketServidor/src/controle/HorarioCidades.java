package controle;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class HorarioCidades {

	private static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a";
	
	
	public static String devolverHora(String continenteCidade){

	TimeZone timeZone = TimeZone.getTimeZone(continenteCidade);

	Calendar calendar = new GregorianCalendar();

	calendar.setTimeZone(timeZone);

	long timeLA3 = calendar.getTimeInMillis();

	String meridium;if(calendar.get(Calendar.MINUTE)==1)
	{
		meridium = "AM";
	}else
	{
		meridium = "PM";
	}
	
	
	return (calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+" "+meridium);

	
	}
	
	
	
	public static void main(String[] args) {
		String hora = devolverHora("US/Alaska");
		System.out.println("A hora é: " + hora);
	}
	
	
	// http://tutorials.jenkov.com/java-date-time/java-util-timezone.html e
	// http://www.horadomundo.com/

}
