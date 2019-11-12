package hoteles.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HotelesTargetUI {
	
	public static final Target LOCATION = Target.the("location").locatedBy("//input[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_LocationComboBox_I']");
	public static final Target PAIS = Target.the("location").locatedBy("//table[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_LocationComboBox_DDD_L_LBT']//tr[7]");
	public static final Target CHECK_IN = Target.the("check_in").locatedBy("//input[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_CheckInDateEdit_I']");
	public static final Target CHECK_OUT = Target.the("check_out").locatedBy("//input[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_CheckOutDateEdit_I']");
	public static final Target ROOMS = Target.the("room").locatedBy("");
}
