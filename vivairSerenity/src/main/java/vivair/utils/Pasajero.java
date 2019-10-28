package vivair.utils;


import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import vivair.ui.FormularioUI;

public class Pasajero {
	
	public Interaction[] adicionarAdulto (int totalPasajero) {
		
		List<Interaction> totalInteraccioes = new ArrayList<>(); 
		
		
		for (int i = 1; i < totalPasajero; i++) {
			totalInteraccioes.add(Click.on(FormularioUI.ADULTO));
		}

		return (Interaction[]) totalInteraccioes.toArray();
	}
}
