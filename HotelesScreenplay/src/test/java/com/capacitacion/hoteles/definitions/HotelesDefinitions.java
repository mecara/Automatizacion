package com.capacitacion.hoteles.definitions;

import java.util.List;
import java.util.Map;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hoteles.task.HotelesTasks;
import hotelesUtils.Driver;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class HotelesDefinitions {
	
	@Before
	public void iniciar() {
		OnStage.setTheStage(Cast.ofStandardActors());
		OnStage.theActorCalled("Meli");
	}
	

	@Given("^EL usuario ingresa a la pagina de dx hotels$")
	public void elUsuarioIngresaALaPaginaDeDxHotels() {
		OnStage.theActorInTheSpotlight().whoCan(BrowseTheWeb.with(Driver.myDriver().chromeDriverAbrirUrl("https://demos.devexpress.com/rwa/dxhotels/")));
	}


	@When("^Se llenan todo los datos requeridos requeridos en la consulta$")
	public void seLlenanTodoLosDatosRequeridosRequeridosEnLaConsulta(List<Map<String, String>>datos) {
		OnStage.theActorInTheSpotlight().attemptsTo(HotelesTasks.hotelesFormulario(datos));
  
	}



//@Then("^Se da clic en el boton buscar$")
//public void seDaClicEnElBotonBuscar() {
//   
//}
//
//@Then("^selecciono la reserva mas barata$")
//public void seleccionoLaReservaMasBarata() {
//    
//}

}
