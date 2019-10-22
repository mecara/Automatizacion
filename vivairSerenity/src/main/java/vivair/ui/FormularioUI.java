package vivair.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioUI {
	
	public static final Target ORIGEN_TARGET = Target.the("origen").locatedBy(".search-type-switch .box");
	public static final Target SELECCIONA_ORIGEN = Target.the("aeropuerto origen").locatedBy("//input[@id = 'criteria-airport-select-departure-input']");
	//public static final Target LISTADO_ORIGEN = Target.the("listado habilitado").locatedBy("//div[@class = 'modal-header modal-header--fixed']");
	public static final Target SELECCIONA_DESTINO = Target.the("aeropuerto destino").locatedBy("//input[@id = 'criteria-airport-select-destination-input']");
	public static final Target SELECCIONA_FECHA = Target.the("selecciona fecha").locatedBy("//input[@id = 'criteria-dates-from']");
}

