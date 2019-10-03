package com.sura.capacitacion.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		snippets = SnippetType.CAMELCASE,
		features = "src/main/resources/features/toolsqa.feature",
		glue = "com.sura.capacitacion.screenplay.definitions"
//		tags = "@llenarFormulario"
		)

public class Toolsqa {

}
