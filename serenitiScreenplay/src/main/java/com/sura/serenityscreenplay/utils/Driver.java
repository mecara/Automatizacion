package com.sura.serenityscreenplay.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
	
	private WebDriver driver;

	
	public Driver() {
		driver = null;
	}
	
	//a continuacion se crea el driver de chrome
	public WebDriver chromeDriverYAbrirLaUrl(String url) {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized","--incognito");
		driver = new ChromeDriver(chromeOptions);  //creamos nuestro driver con las opciones del driver definido anterior
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //definimos una espera implicita
		
		return driver;
	}
	
	//vamos a crear la instancia de la clase Driver para que retorne la instancia de la misma clase
	public static Driver myDriver() {
		return new Driver();
	}
	
}
