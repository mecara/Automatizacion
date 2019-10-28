package vivair.tasks;

import java.util.List;
import java.util.Map;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import vivair.ui.FormularioUI;
import vivair.utils.Fecha;

public class LlenarFormularioTasks implements Task{
	
	private List<Map<String, String>> datosFormulario;
	
	
	public LlenarFormularioTasks(List<Map<String, String>> datosFormulario) {
		this.datosFormulario = datosFormulario;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
			WaitUntil.the(FormularioUI.ORIGEN_TARGET, WebElementStateMatchers.isCurrentlyVisible()),
			Click.on(FormularioUI.ORIGEN_TARGET),
			Click.on(FormularioUI.SELECCIONA_ORIGEN),
			Enter.theValue("MDE").into(FormularioUI.SELECCIONA_ORIGEN),
			//WaitUntil.the(FormularioUI.LISTADO_ORIGEN, WebElementStateMatchers.isCurrentlyEnabled()),
			Click.on(FormularioUI.SELECCIONA_DESTINO),
			Enter.theValue("CUZ").into(FormularioUI.SELECCIONA_DESTINO),
			Click.on(FormularioUI.SELECCIONA_FECHA),
			Click.on(FormularioUI.ClickFecha(Fecha.generarFecha())),
			Click.on(FormularioUI.PASAJERO),
			Click.on(FormularioUI.ADULTO),
			Click.on(FormularioUI.PASAJERO),
			Click.on(FormularioUI.LISTA_MONEDA),
			Click.on(FormularioUI.ClickMoneda(this.datosFormulario.get(0).get("moneda")))
			
		);
			// Enter.theValue(Fecha.myFecha().generarFecha()).into(FormularioUI.SELECCIONA_FECHA));
	}
	
	public static LlenarFormularioTasks llenarFormulario(List<Map<String, String>>datosFormulario) {
		return Tasks.instrumented(LlenarFormularioTasks.class, datosFormulario);
	}
	
}

	