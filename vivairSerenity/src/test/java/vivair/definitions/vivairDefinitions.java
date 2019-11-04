package vivair.definitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static vivair.tasks.LlenarFormularioTasks.llenarFormulario;

import java.util.List;
import java.util.Map;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import vivair.tasks.BuscarVuelosTasks;
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


	@When("^se diligencian los datos del formulario y selecciono solo ida$")
	public void seDiligencianLosDatosDelFormulario(List<Map<String, String>> datos) {
		theActorInTheSpotlight().attemptsTo(llenarFormulario(datos));
	   
	
	}

	@Then("^doy clic en buscar vuelos valido los vuelos disponibles en (.*)$")
	public void doyClicEnBuscarVuelosValidoLosVuelosDisponibles(String moneda) {
	    theActorInTheSpotlight().attemptsTo(BuscarVuelosTasks.BuscaVuelo(moneda));
	  
	}
	
//	@Then("^selecciono el vuelo mas barato$")
//	public void seleccionoElVueloMasBarato() {
//		theActorInTheSpotlight().attemptsTo(BuscarVuelosTasks.BuscaVuelo());
//	    
//	}

	
}
