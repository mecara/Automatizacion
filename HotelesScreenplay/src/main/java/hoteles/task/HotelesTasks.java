package hoteles.task;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;

import hoteles.ui.HotelesTargetUI;
import hotelesUtils.Rooms;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
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
				WaitUntil.the(HotelesTargetUI.LOCATION, WebElementStateMatchers.isCurrentlyVisible()),
				Click.on(HotelesTargetUI.LOCATION),
				Click.on(HotelesTargetUI.PAIS),
				Enter.theValue(datos.get(0).get("check_in")).into(HotelesTargetUI.CHECK_IN).thenHit(Keys.ENTER),
				Enter.theValue(datos.get(0).get("check_out")).into(HotelesTargetUI.CHECK_OUT).thenHit(Keys.ENTER),
				Click.on(HotelesTargetUI.ROOMS),
				Enter.theValue(datos.get(0).get("rooms")).into(HotelesTargetUI.ROOMS).thenHit(Keys.ENTER),
				Click.on(HotelesTargetUI.ADULTS),
				Enter.theValue(datos.get(0).get("adults")).into(HotelesTargetUI.ADULTS).thenHit(Keys.ENTER),
				Enter.theValue(datos.get(0).get("children")).into(HotelesTargetUI.CHILDREN).thenHit(Keys.ENTER));
				
		
//			int numRooms = Integer.parseInt(datos.get(0).get("rooms"));
//			Rooms.seleccionarRoom(actor, numRooms);
	}

	public static HotelesTasks hotelesFormulario(List<Map<String, String>>datos) {
		return Tasks.instrumented(HotelesTasks.class, datos);
		
	}

}
