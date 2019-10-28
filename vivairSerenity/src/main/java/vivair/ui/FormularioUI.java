package vivair.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioUI {
	
	public static final Target ORIGEN_TARGET = Target.the("origen").locatedBy(".search-type-switch .box");
	public static final Target SELECCIONA_ORIGEN = Target.the("aeropuerto origen").locatedBy("//input[@id = 'criteria-airport-select-departure-input']");
	//public static final Target LISTADO_ORIGEN = Target.the("listado habilitado").locatedBy("//div[@class = 'modal-header modal-header--fixed']");
	public static final Target SELECCIONA_DESTINO = Target.the("aeropuerto destino").locatedBy("//input[@id = 'criteria-airport-select-destination-input']");
	public static final Target SELECCIONA_FECHA = Target.the("selecciona fecha").locatedBy("//input[@id = 'criteria-dates-from']");
	// public static final Target CLICK_FECHA = Target.the("click fecha").locatedBy("//button[@date='2019-10-27']");
	public static final Target PASAJERO = Target.the("selecciona pasajero").locatedBy("//input [@id='criteria-passenger-select-input']");
	public static final Target ADULTO = Target.the("Adulto").locatedBy("//*[@id=\"passenger-type-undefined\"][1]/div[2]/div/button[@class=\"add-button\"]");
	public static final Target LISTA_MONEDA = Target.the("click lista moneda").locatedBy("//div[@class='currency-panel']/..");
	//button[@class='add-button']/parent::div/parent::div/parent::li
	public static final Target BUSCAR_VUELO = Target.the("buscar vuelo").locatedBy("//button[@id='criteria-search-button-desktop']");
	
	public static Target ClickMoneda(final String moneda) {
		return Target.the("click moneda").locatedBy("//div[@class='currency-panel']/ul[@class='dropdown-list']/li[@id='currency-" + moneda + "']");
		
	}
	
	
	public static Target ClickFecha(final String fecha) {
		return Target.the("click fecha").locatedBy("//button[@date='" + fecha + "']");
		
	
	}
}

