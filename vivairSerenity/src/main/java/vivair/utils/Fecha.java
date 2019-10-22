package vivair.utils;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
	

	public String generarFecha() {
		Calendar fecha = new GregorianCalendar();
	
		
		int a = fecha.get(Calendar.YEAR);
		int m = fecha.get(Calendar.MONTH);
		int d = fecha.get(Calendar.DAY_OF_MONTH);
		
		return a + "-" + m + "-" + d;
	}
		
	
	public static Fecha myFecha() {
		return new Fecha();
		
	}
}
	

