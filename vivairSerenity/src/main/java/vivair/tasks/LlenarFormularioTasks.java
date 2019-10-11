package vivair.tasks;

import java.util.List;
import java.util.Map;

import org.joda.time.Seconds;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import vivair.ui.FormularioUI;

public class LlenarFormularioTasks implements Task{
	
	private List<Map<String, String>> datosFormulario;
	
	public LlenarFormularioTasks(List<Map<String, String>> datosFormulario) {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
			WaitUntil.the(Target.the("carga formulario").locatedBy("//div[@class = 'search-type-switch']"), WebElementStateMatchers.isCurrentlyVisible()),
			Click.on(ORI)
			
				
				
				);
				
				
				
				
		
		
	}
	
	public static LlenarFormularioTasks llenarFormulario(List<Map<String, String>>datosFormulario) {
		return Tasks.instrumented(LlenarFormularioTasks.class, datosFormulario);
	}

}
