package vivair.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
	
	private WebDriver driver;
	
	public Driver() {
		driver = null;
	}
	
	public WebDriver chromeDriverAbrirUrl(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\lib\\chromedriver\\tools\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized", "insognito");
		driver = new ChromeDriver(chromeOptions);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public static Driver myDriver() {
		return new Driver();
		
	}

}
