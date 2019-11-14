package co.com.qvision.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/reservacion_de_hotel.feature"
        ,glue = "co.com.qvision.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ReservacionDeHotelRunner {
}
