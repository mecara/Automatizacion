package vivair.utils;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
	

	public static String generarFecha() { 
		Calendar fecha = new GregorianCalendar();
	
		
		int a = fecha.get(Calendar.YEAR);
		int m = fecha.get(Calendar.MONTH) + 1;
		int d = fecha.get(Calendar.DAY_OF_MONTH);
		
		return a + "-" + m + "-" + d;
	}
}

//no se crea la instancia ya que el método "generar fecha" no guarda ningún dato, sólo realiza una operación
	

