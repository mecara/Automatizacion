package co.com.qvision.tasks;

import co.com.qvision.interactions.SeleccionarPrecio;
import co.com.qvision.utils.CalculoPrecioTotal;
import co.com.qvision.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.qvision.userinterfaces.PaginaResumenReserva.LBL_INGRESO;
import static co.com.qvision.userinterfaces.PaginaResumenReserva.LBL_SALIDA;
import static co.com.qvision.utils.Constantes.MENOR_VALOR;

public class SeleccionarElHotel implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(SeleccionarPrecio.masBajo());

        String ingreso = LBL_INGRESO.resolveFor(actor).getText();
        String salida = LBL_SALIDA.resolveFor(actor).getText();
        int valor = Integer.parseInt(actor.recall(MENOR_VALOR));
        String precioTotal = CalculoPrecioTotal.aPagar(ingreso, salida, valor);
        actor.remember(Constantes.TOTAL_A_PAGAR, precioTotal);

    }

    public static SeleccionarElHotel conLaTarifaMasEconomica() {
        return Tasks.instrumented(SeleccionarElHotel.class);
    }
}
