package com.hoteles.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		snippets = SnippetType.CAMELCASE,
		features = "src/test/resources/features/hoteles.feature",
		glue = "com.capacitacion.hoteles.definitions"
		)

public class hoteles {


}
