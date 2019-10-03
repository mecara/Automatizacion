package questions;

import com.sura.serenityscreenplay.ui.FormularioToolsQAUI;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElMensajeEsQuestions implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		
		return FormularioToolsQAUI.MENSAJE_ACTUAL.resolveFor(actor).getText();
	}
	
	public static ElMensajeEsQuestions elMensajeEs() {
		return new ElMensajeEsQuestions();
	}

}
