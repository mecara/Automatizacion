package vivair.utils;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import vivair.ui.FormularioUI;

public class Pasajero {
	
	public static void adicionarAdulto (Actor actor, int totalPasajero) {
		for (int i = 1; i < totalPasajero; i++) {
			actor.attemptsTo(Click.on(FormularioUI.ADULTO));
		}
	}
}
