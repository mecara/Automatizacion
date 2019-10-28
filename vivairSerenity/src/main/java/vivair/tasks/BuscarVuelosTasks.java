package vivair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import vivair.ui.FormularioUI;

public class BuscarVuelosTasks implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(FormularioUI.BUSCAR_VUELO));
		
	}
	
	public static BuscarVuelosTasks BuscaVuelo() {
		return Tasks.instrumented(BuscarVuelosTasks.class);
	}
}

