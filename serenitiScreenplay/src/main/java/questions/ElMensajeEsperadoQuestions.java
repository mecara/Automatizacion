package questions;

import com.sura.serenityscreenplay.ui.FormularioToolsQAUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElMensajeEsperadoQuestions implements Question<Boolean> {

	
	private String mensajeEsperado;
	
	public  ElMensajeEsperadoQuestions(String mensajeEsperado) {
		this.mensajeEsperado = mensajeEsperado;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		String mensajeActual = FormularioToolsQAUI.MENSAJE_ACTUAL.resolveFor(actor).getText();
		return mensajeActual.equals(mensajeEsperado); // estoy comparando lo que me va a retornar "mensajeEsperado" en este caso es un Bool
	}
	
	public static ElMensajeEsperadoQuestions elMensajeEsperado(String mensajeEsperado) {
		return new ElMensajeEsperadoQuestions(mensajeEsperado);
	}
	

}
