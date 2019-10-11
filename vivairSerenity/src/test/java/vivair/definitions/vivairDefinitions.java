package vivair.definitions;

import java.util.List;
import java.util.Map;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import vivair.utils.Driver;

public class vivairDefinitions {
	
	@Before
	public void iniciar() {
		OnStage.setTheStage(Cast.ofStandardActors());
		OnStage.theActorCalled("Meli");
	}
	
	
	@Given("^el usuario ingresa a la pagina principal de vivaair$")
	public void elUsuarioIngresaALaPaginaPrincipalDeVivaair() {
	    OnStage.theActorInTheSpotlight().whoCan(BrowseTheWeb.with(Driver.myDriver().chromeDriverAbrirUrl("https://www.vivaair.com/co/es")));
	    
	}


	@When("^ingresa  al formulario da clic en el checbox de solo ida$")
	public void ingresaAlFormularioDaClicEnElChecboxDeSoloIda() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^se diligencian los datos del formulario$")
	public void seDiligencianLosDatosDelFormulario(List<Map<String, String >> datos) {
	    
	   
	}

	@Then("^doy clic en buscar vuelos valido los vuelos disponibles$")
	public void doyClicEnBuscarVuelosValidoLosVuelosDisponibles() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	
}
