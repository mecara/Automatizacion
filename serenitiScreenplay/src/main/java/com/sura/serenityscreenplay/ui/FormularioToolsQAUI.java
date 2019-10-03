package com.sura.serenityscreenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioToolsQAUI {
	public static final Target FIRST_NAME = Target.the("first name").locatedBy("//input[@name='firstname']"); //definimos el atributo "final" porque ese atributo no se va a modificar
	public static final Target LAST_NAME = Target.the("last name").locatedBy("//input[@id='lastname']");
	public static final Target SEX = Target.the("sex").locatedBy("//input[@id='sex-1']");
	public static final Target EXPERIENCE = Target.the("experience").locatedBy("//input[@id='exp-6']"); //no olvidar hacer el metodo para evaluar si viene M o F
	public static final Target DATE = Target.the("date").locatedBy("//input[@id='datepicker']");
	public static final Target PROFESSION = Target.the("profession").locatedBy("//input[@id='profession-1']");
	//public static final Target ARCHIVO = Target.the("photo").locatedBy("//input[@id='photo']");
	public static final Target CONTINENTS = Target.the("continents").locatedBy("//select[@id='continents']");
	public static final Target COMMANDS = Target.the("commands").locatedBy("//select[@id='selenium_commands']");
	public static final Target MENSAJE_ACTUAL = Target.the("mensaje").locatedBy("//div[@class='page-title-head hgroup']//h1");
	
}
