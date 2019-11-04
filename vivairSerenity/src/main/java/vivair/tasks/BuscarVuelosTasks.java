package vivair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import questions.ValidarValorVuelo;
import vivair.ui.FormularioUI;

public class BuscarVuelosTasks implements Task {
	private String moneda;
	
	

	public BuscarVuelosTasks(String moneda) {
		this.moneda = moneda;
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(FormularioUI.BUSCAR_VUELO),
				WaitUntil.the(FormularioUI.RESUL_BUSQUEDA, WebElementStateMatchers.isCurrentlyVisible())
				//Click.on(FormularioUI.VALOR_VUELO)
				);	
		
		String masBarato = new ValidarValorVuelo(this.moneda).answeredBy(actor); 
		
		actor.attemptsTo(Click.on(FormularioUI.VALOR_VUELO_MENOR_VALOR.of(masBarato)));
		
	}


	public static BuscarVuelosTasks BuscaVuelo(String moneda) {
		return Tasks.instrumented(BuscarVuelosTasks.class, moneda);
	}
}

