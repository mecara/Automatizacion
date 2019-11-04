package questions;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import vivair.ui.FormularioUI;

public class ValidarValorVuelo implements Question<String> {
	private String moneda; //creamos la variable moneda
	
	public ValidarValorVuelo(String moneda) { //recibe moneda
		this.moneda = moneda;
	}

	@Override
	public String answeredBy(Actor actor) {
		
		List<Float> precios = TextContent.of(FormularioUI.VALOR_VUELO)
        .viewedBy(actor)
        .asList() //tomo los datos del target y los listo
        .stream()
        .map(num -> Float.parseFloat(num.split(this.moneda)[1])) // se saca la parte numerica y se convierte a double o float y con split validamos el string y sólo sacamos la parte numérica
        //.boxed()
        .collect(Collectors.toList()); // pasamos de stream a una List
		
		System.out.println(precios.toString());
		Collections.sort(precios); // se ordenan de manera ascendente
		System.out.println(precios.toString());
		
		return precios.get(0).toString(); //retorno el primer valor de la lista
	}
	
	

}
