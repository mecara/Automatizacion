package vivair.tasks;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import vivair.ui.FormularioUI;
import vivair.utils.Fecha;
import vivair.utils.Pasajero;

public class LlenarFormularioTasks implements Task{
	
	private List<Map<String, String>> datosFormulario;
	
	
	public LlenarFormularioTasks(List<Map<String, String>> datosFormulario) {
		this.datosFormulario = datosFormulario;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		//System.out.println("iMPRIMIENDO FECHAAAAAAAAAAAAAAA: " + Fecha.generarFecha());
		actor.attemptsTo(
			WaitUntil.the(FormularioUI.ORIGEN_TARGET, WebElementStateMatchers.isCurrentlyVisible()),
			Click.on(FormularioUI.ORIGEN_TARGET),
			Click.on(FormularioUI.SELECCIONA_ORIGEN),
			Enter.theValue(datosFormulario.get(0).get("origen")).into(FormularioUI.SELECCIONA_ORIGEN).thenHit(Keys.ENTER),
			//WaitUntil.the(FormularioUI.LISTADO_ORIGEN, WebElementStateMatchers.isCurrentlyEnabled()),
			Click.on(FormularioUI.SELECCIONA_DESTINO),
			Enter.theValue(datosFormulario.get(0).get("destino")).into(FormularioUI.SELECCIONA_DESTINO).thenHit(Keys.ENTER),
			//WaitUntil.the(FormularioUI.SELECCIONA_FECHA, WebElementStateMatchers.isCurrentlyEnabled()),
			Click.on(FormularioUI.SELECCIONA_FECHA),
			Click.on(FormularioUI.CLICK_FECHA.of(Fecha.generarFecha())),
			Click.on(FormularioUI.PASAJERO));
		
		int totalPasajeros = Integer.parseInt(datosFormulario.get(0).get("num_pasajeros")); //con parseInt se convierte el vamor de num_pasajeros de string a int
		Pasajero.adicionarAdulto(actor,  totalPasajeros);
		
		actor.attemptsTo(
		
			Click.on(FormularioUI.LISTA_MONEDA),
			Click.on(FormularioUI.CLICK_MONEDA.of(this.datosFormulario.get(0).get("moneda")))); //of los parametros deseados en el target en este caso
			// Enter.theValue(Fecha.myFecha().generarFecha()).into(FormularioUI.SELECCIONA_FECHA));
	}
	
	public static LlenarFormularioTasks llenarFormulario(List<Map<String, String>>datosFormulario) {
		return Tasks.instrumented(LlenarFormularioTasks.class, datosFormulario);
	}
	
}

	