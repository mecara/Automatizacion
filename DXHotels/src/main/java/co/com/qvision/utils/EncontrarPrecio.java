package co.com.qvision.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class EncontrarPrecio {

    private EncontrarPrecio() {
    }

    public static String masBajo (List<WebElementFacade> precios){

        int menor = Integer.parseInt(precios.get(0).getText().replace("$", ""));
        int precio = 0;

        for (int i = 0; i < precios.size(); i++) {

            precio = Integer.parseInt(precios.get(i).getText().replace("$", ""));

            if (precio < menor) {
                menor = precio;
            }
        }
        return String.valueOf(menor);
    }
}
