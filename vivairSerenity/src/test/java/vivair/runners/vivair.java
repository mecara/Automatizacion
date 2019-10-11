package vivair.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		snippets = SnippetType.CAMELCASE,
		features = "src/main/resources/features/vivair.feature",
		glue = "vivair.definitions"
//		tags = "@llenarFormulario"
		)

public class vivair {
	
}



