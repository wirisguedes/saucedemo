package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GerenciamentoDeDrivers {
	
	static WebDriver driver;
	
	public static WebDriver abrirBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		
		return driver;
		
	}

}
