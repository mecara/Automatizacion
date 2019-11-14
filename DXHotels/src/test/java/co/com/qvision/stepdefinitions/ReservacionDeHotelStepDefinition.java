package co.com.qvision.stepdefinitions;

import co.com.qvision.models.InformacionDeBusqueda;
import co.com.qvision.questions.PrecioTotal;
import co.com.qvision.tasks.RealizaUnaBusquedaDe;
import co.com.qvision.tasks.SeleccionarElHotel;
import co.com.qvision.userinterfaces.PaginaInicio;
import co.com.qvision.utils.Constantes;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ReservacionDeHotelStepDefinition {

    @Managed(driver = "chrome")
    public static WebDriver navegador;
    public static Actor actorNombrado = Actor.named("Diana");

    @Before
    public void abrirNavegador() {
        actorNombrado.can(BrowseTheWeb.with(navegador));
        actorNombrado.wasAbleTo(Open.browserOn(new PaginaInicio()));
    }

    @Dado("^que el usuario realiza una busqueda de hoteles$")
    public void queElUsuarioRealizaUnaBusquedaDeHoteles(List<InformacionDeBusqueda> informacionDeBusqueda) {

        actorNombrado.attemptsTo(RealizaUnaBusquedaDe.hoteles(informacionDeBusqueda.get(0)));

    }

    @Cuando("^el selecciona el hotel con la tarifa más economica$")
    public void elSeleccionaElHotelConLaTarifaMásEconomica() {

        actorNombrado.attemptsTo(SeleccionarElHotel.conLaTarifaMasEconomica());

    }

    @Entonces("^el puede validar el precio total a pagar$")
    public void elPuedeValidarElPrecioTotalAPagar() {
        String totalAPagar = actorNombrado.recall(Constantes.TOTAL_A_PAGAR);

        actorNombrado.should(GivenWhenThen.seeThat(PrecioTotal.aPagar(), Matchers.equalTo(totalAPagar)));
    }

    @After
    public void cerrarNavegador() {
        navegador.close();
    }
}
