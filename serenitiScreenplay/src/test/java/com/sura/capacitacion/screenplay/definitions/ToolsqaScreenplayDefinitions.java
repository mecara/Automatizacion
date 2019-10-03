package com.sura.capacitacion.screenplay.definitions;

import static com.sura.serenityscreenplay.tasks.LlenarElFormularioTasks.llenarElFormulario;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static questions.ElMensajeEsQuestions.elMensajeEs;
import static questions.ElMensajeEsperadoQuestions.elMensajeEsperado;

import java.util.List;
import java.util.Map;

import com.sura.serenityscreenplay.utils.Driver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class ToolsqaScreenplayDefinitions {
	@Before
	public void iniciar() {
		OnStage.setTheStage(Cast.ofStandardActors()); // para inicializar el escenario
		OnStage.theActorCalled("Meli"); // se define quien es el actor que va a ejecutar el escenario
	}
	
	
	@Given("^Dado que estoy en el formulario de Toolsqa$")
	public void dadoQueEstoyEnElFormularioDeToolsqa() {
		OnStage.theActorInTheSpotlight().whoCan(BrowseTheWeb.with(Driver.myDriver().chromeDriverYAbrirLaUrl("https://www.toolsqa.com/automation-practice-form/"))); //se define para abrir la página en el navegador
	    
	}


	@When("^ingreso los valores al formulario$")
	public void ingresoLosValoresAlFormulario(List<Map<String, String>> datos) { //parseo del data table en map
		theActorInTheSpotlight().attemptsTo(llenarElFormulario(datos)); //con ctrl+shift+m se realiza la importacion del theActorInTheSpotlight
	   
	}

	@Then("^veo el mensaje de (.*)$")//comparamos el mensaje Automation Practice Form por una expresión regular
	public void veoElMensajeDeAutomationPracticeForm(String esperado) {
		theActorInTheSpotlight().should(seeThat(elMensajeEs(), equalTo(esperado)));//con ctrl+shift+m se realiza la importacion como esta escrito en la siguiente linea
		//theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElMensajeEsQuestions.elMensajeEs(), Matchers.equalTo(esperado)));//con ctrl+shift+m se realiza la importacio
		theActorInTheSpotlight().should(seeThat(elMensajeEsperado(esperado), is(true)));
	}

}
