package co.com.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import static co.com.qvision.utils.Constantes.URL;

@DefaultUrl(value = URL)
public class PaginaInicio extends PageObject {

    public static final Target LTS_LOCACION = Target.the("la lista locación").locatedBy("//input[contains(@id,'location')]");
    public static final Target OPT_LOCACION = Target.the("seleccionar la locación").locatedBy("//div[@class='dx-item dx-list-item']//div[contains(text(),'{0}')]");
    public static final Target BTN_FECHA_INGRESO = Target.the("calendario fecha de ingreso").locatedBy("//input[contains(@id,'checkIn')]//following-sibling::div[@class='dx-texteditor-buttons-container']");
    public static final Target BTN_FECHA_SALIDA = Target.the("calendario fecha de salida").locatedBy("//input[contains(@id,'checkOut')]//following-sibling::div[@class='dx-texteditor-buttons-container']");
    public static final Target BTN_SELECCIONAR_MES_ANIO = Target.the("boton seleccionar mes y anio").locatedBy("//div[@class='dx-overlay-content dx-popup-normal dx-resizable']//a[contains(@class,'dx-calendar-caption')]//div");
    public static final Target BTN_SIGUIENTE = Target.the("boton siguiente").locatedBy("//i[@class='dx-icon dx-icon-chevronright']");
    public static final Target BTN_ANIO = Target.the("boton anio").locatedBy("//td[@aria-label='{0}']");
    public static final Target BTN_MES = Target.the("boton mes").locatedBy("//td[contains(@aria-label, '{0}')]//span[contains(text(),'{1}')]");
    public static final Target BTN_DIA = Target.the("boton dia").locatedBy("//div[@class='dx-overlay-content dx-popup-normal dx-resizable']//td[contains(@aria-label,'{0}, {2}') and  contains(@aria-label,'{1}')]");
    public static final Target BTN_BUSCAR = Target.the("boton buscar").locatedBy("//span[text()='SEARCH']");
}
