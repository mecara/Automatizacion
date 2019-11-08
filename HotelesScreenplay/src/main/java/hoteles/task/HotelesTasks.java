package hoteles.task;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;

import hoteles.ui.HotelesTargetUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class HotelesTasks implements Task{
	
	private List<Map<String, String>>datos;
	
	public HotelesTasks(List<Map<String, String>>datos) {
		this.datos = datos;
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				WaitUntil.the(HotelesTargetUI.LOCATION, WebElementStateMatchers.isCurrentlyVisible())
				
				);
		
		
	}

	public static HotelesTasks hotelesFormulario(List<Map<String, String>>datos) {
		return Tasks.instrumented(HotelesTasks.class, datos);
		
	}

}
