package co.com.qvision.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.qvision.userinterfaces.PaginaInicio.*;
import static co.com.qvision.utils.Constantes.INGRESO;

public class SeleccionarFecha implements Interaction {

    private String fecha;
    private String tipoFecha;

    public SeleccionarFecha(String fecha, String tipoFecha) {
        this.fecha = fecha;
        this.tipoFecha = tipoFecha;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String dia = fecha.substring(0, 2);
        String mes = fecha.substring(3, 6);
        String anio = fecha.substring(7);


        actor.attemptsTo(Click.on(BTN_SELECCIONAR_MES_ANIO));

        if (tipoFecha.equals(INGRESO)) {

            actor.attemptsTo(Click.on(BTN_SELECCIONAR_MES_ANIO));
            while (!BTN_ANIO.of(anio).resolveFor(actor).isCurrentlyVisible()) {
                actor.attemptsTo(Click.on(BTN_SIGUIENTE));
            }
            actor.attemptsTo(Click.on(BTN_ANIO.of(anio)));
        }
        actor.attemptsTo(
                Click.on(BTN_MES.of(anio, mes)),
                Click.on(BTN_DIA.of(dia, mes, anio)));
    }

    public static SeleccionarFecha enElCalendario(String fecha, String tipoFecha) {
        return Tasks.instrumented(SeleccionarFecha.class, fecha, tipoFecha);
    }
}
