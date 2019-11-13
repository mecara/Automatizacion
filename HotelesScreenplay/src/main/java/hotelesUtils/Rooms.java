package hotelesUtils;

import hoteles.ui.HotelesTargetUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;

public class Rooms {
	
	public static void seleccionarRoom (Actor actor,  int totalRoom) {
		for (int i = 1; i < totalRoom; i++) {
			actor.attemptsTo(Click.on(HotelesTargetUI.ROOMS));
			
		}
		
	}

}
