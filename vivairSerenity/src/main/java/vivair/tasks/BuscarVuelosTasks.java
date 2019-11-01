package vivair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import vivair.ui.FormularioUI;

public class BuscarVuelosTasks implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(FormularioUI.BUSCAR_VUELO),
				WaitUntil.the(FormularioUI.RESUL_BUSQUEDA, WebElementStateMatchers.isCurrentlyVisible())
				);		
	}
	
	public static BuscarVuelosTasks BuscaVuelo() {
		return Tasks.instrumented(BuscarVuelosTasks.class);
	}
}

