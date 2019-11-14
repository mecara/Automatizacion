package co.com.qvision.tasks;

import co.com.qvision.interactions.SeleccionarFecha;
import co.com.qvision.models.InformacionDeBusqueda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.qvision.userinterfaces.PaginaInicio.*;
import static co.com.qvision.utils.Constantes.INGRESO;
import static co.com.qvision.utils.Constantes.SALIDA;

public class RealizaUnaBusquedaDe implements Task {

    private String locacion;
    private String fechaIngreso;
    private String fechaSalida;

    public RealizaUnaBusquedaDe(InformacionDeBusqueda informacionDeBusqueda) {

        this.locacion = informacionDeBusqueda.getLocacion();
        this.fechaIngreso = informacionDeBusqueda.getFechaIngreso();
        this.fechaSalida = informacionDeBusqueda.getFechaSalida();

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LTS_LOCACION),
                Click.on(OPT_LOCACION.of(locacion)),
                Click.on(BTN_FECHA_INGRESO),
                SeleccionarFecha.enElCalendario(fechaIngreso, INGRESO),
                Click.on(BTN_FECHA_SALIDA),
                SeleccionarFecha.enElCalendario(fechaSalida, SALIDA),
                Click.on(BTN_BUSCAR)
        );

    }

    public static RealizaUnaBusquedaDe hoteles(InformacionDeBusqueda informacionDeBusqueda) {
        return Tasks.instrumented(RealizaUnaBusquedaDe.class, informacionDeBusqueda);
    }
}
