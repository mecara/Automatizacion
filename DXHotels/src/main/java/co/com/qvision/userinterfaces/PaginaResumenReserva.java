package co.com.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaResumenReserva {
    public static final Target LBL_INGRESO = Target.the("fecha ingreso").locatedBy("//p[@class='check-in']");
    public static final Target LBL_SALIDA = Target.the("fecha salida").locatedBy("//p[@class='check-out']");
    public static final Target LBL_PRECIO_TOTAL = Target.the("precio total a pagar").locatedBy("//h4[@class='total-price']");
}
