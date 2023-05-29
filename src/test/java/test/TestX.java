package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utils.GerenciamentoDeDrivers;

public class TestX {
	
	private WebDriver driver;
	GerenciamentoDeDrivers gerenciamentoDeDrivers;
	
	@Before
	public void inicio() {
		gerenciamentoDeDrivers = new GerenciamentoDeDrivers();
		driver = GerenciamentoDeDrivers.abrirBrowser("chrome");
		
	}
	
	@Test
	public void testX() {
		System.out.println("Iniciando Test");
		driver.get("https://www.saucedemo.com");
		
	}
	
	@After
	public void fim() {
		System.out.println("Fim");
	}

}
