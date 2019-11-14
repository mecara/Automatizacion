package co.com.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.qvision.userinterfaces.PaginaResumenReserva.LBL_PRECIO_TOTAL;

public class PrecioTotal implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        return LBL_PRECIO_TOTAL.resolveFor(actor).getText();
    }

    public static PrecioTotal aPagar() {
        return new PrecioTotal();
    }
}
