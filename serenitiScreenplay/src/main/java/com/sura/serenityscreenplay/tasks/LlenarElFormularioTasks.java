package com.sura.serenityscreenplay.tasks;

import static com.sura.serenityscreenplay.ui.FormularioToolsQAUI.COMMANDS;
//import static com.sura.serenityscreenplay.ui.FormularioToolsQAUI.ARCHIVO;
import static com.sura.serenityscreenplay.ui.FormularioToolsQAUI.CONTINENTS;
import static com.sura.serenityscreenplay.ui.FormularioToolsQAUI.DATE;
import static com.sura.serenityscreenplay.ui.FormularioToolsQAUI.EXPERIENCE;
import static com.sura.serenityscreenplay.ui.FormularioToolsQAUI.FIRST_NAME;
import static com.sura.serenityscreenplay.ui.FormularioToolsQAUI.LAST_NAME;
import static com.sura.serenityscreenplay.ui.FormularioToolsQAUI.PROFESSION;
import static com.sura.serenityscreenplay.ui.FormularioToolsQAUI.SEX;

import java.util.List;
import java.util.Map;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LlenarElFormularioTasks implements Task{

	
	private List<Map<String, String>> datosFormulario; //definimos como vamos a recibir la información del feature
	
	public LlenarElFormularioTasks(List<Map<String, String>> datosFormulario) {
		this.datosFormulario = datosFormulario; //con this hacemos referencia al parametro de la clase que es el mismo nombre del parametro
	}
	
	@Override //imlementación del método Task para definir las acciones que realiza el actor
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				WaitUntil.the(Target.the("ventana que molesta").locatedBy("//a[@data-cli_action='accept']"), WebElementStateMatchers.isCurrentlyVisible()),
				Click.on(Target.the("ventana a cerrar").locatedBy("//a[@data-cli_action='accept']")),
				Enter.theValue(datosFormulario.get(0).get("firstName")).into(FIRST_NAME), //con Ctrl+Shift+M colocamos una mejor práctica para escribir el código
				Enter.theValue(datosFormulario.get(0).get("lastName")).into(LAST_NAME),
				Click.on(SEX),
				Click.on(EXPERIENCE),
				Enter.theValue(datosFormulario.get(0).get("date")).into(DATE),
				Click.on(PROFESSION),
				//Click.on(ARCHIVO),
				Click.on(CONTINENTS),
				Click.on(COMMANDS),
				Click.on(Target.the("button").locatedBy("//button[text()='Button']")) //otra forma de definir elementos del target
				);
		
	}
	
	public static LlenarElFormularioTasks llenarElFormulario(List<Map<String, String>> datosFormulario) {
		return Tasks.instrumented(LlenarElFormularioTasks.class, datosFormulario); //otra forma que nos brinda screenplay para las tasks
		
		//return new LlenarElFormularioTasks(datosFormulario);
	}
	
	

}
