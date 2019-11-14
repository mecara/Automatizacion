package co.com.qvision.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CalculoPrecioTotal {


    private CalculoPrecioTotal() {
    }


    public static String aPagar(String ingreso, String salida, int valor) {


        int precioTotal = 0;
        String strPrecioTotal = "";


        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

            Date fechaIngreso = dateFormat.parse(ingreso);
            Date fechaSalida = dateFormat.parse(salida);
            final int milisegundosDia = 86400000;

            int dias = (int) (((fechaSalida.getTime() - fechaIngreso.getTime()) / milisegundosDia) + 1);

            precioTotal = valor * dias;
            strPrecioTotal = String.valueOf(precioTotal);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "$" + strPrecioTotal + ".00";
    }
}
