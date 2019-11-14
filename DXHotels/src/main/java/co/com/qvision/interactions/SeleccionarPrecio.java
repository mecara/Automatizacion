package co.com.qvision.interactions;

import co.com.qvision.userinterfaces.PaginaResultados;
import co.com.qvision.utils.EncontrarPrecio;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static co.com.qvision.userinterfaces.PaginaResultados.BTN_RESERVAR;
import static co.com.qvision.utils.Constantes.MENOR_VALOR;

public class SeleccionarPrecio implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> precios;


        precios = PaginaResultados.LBL_PRECIOS.resolveAllFor(actor);

        String menorValor = EncontrarPrecio.masBajo(precios);
        actor.attemptsTo(Click.on(BTN_RESERVAR.of(menorValor)));
        actor.remember(MENOR_VALOR, menorValor);

    }

    public static SeleccionarPrecio masBajo() {
        return Tasks.instrumented(SeleccionarPrecio.class);
    }
}
