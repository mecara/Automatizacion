package vivair.utils;
import java.util.Calendar;
import java.util.Date;

public class Fecha {
	

	public static String generarFecha() { 
	
		Calendar calendario = Calendar.getInstance();
		Date date = null;
		calendario.setTime(date);
		return generarFecha();
		
//		int a = fecha.(Calendar.YEAR);
//		int m = fecha.get(Calendar.MONTH) + 1;
//		int d = fecha.get(Calendar.DAY_OF_MONTH);
		
//		System.out.println(a + "-" + m + "-" + d);
//		 return a + "-" + m + "-" + d;
	
		
		
	}

}

//no se crea la instancia ya que el método "generar fecha" no guarda ningún dato, sólo realiza una operación
	

