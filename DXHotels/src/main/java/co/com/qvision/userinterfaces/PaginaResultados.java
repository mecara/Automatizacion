package co.com.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaResultados {
    public static final Target LBL_PRECIOS = Target.the("precios").locatedBy("//p[@class='rate-number']");
    public static final Target BTN_RESERVAR = Target.the("reservar").locatedBy("//p[@class='rate-number' and contains(text(),'{0}')]//parent::div//following-sibling::div//following-sibling::div//div");
}
