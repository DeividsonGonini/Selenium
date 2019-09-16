package testes;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Page;

public class Teste {

	static WebDriver driver;
	static Page page;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:/Selenium/Navegadores/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	page = new Page(driver);
		
	}

	@Test
	public void test() throws Exception {
		page.mouseScroll();
		
		
	}

	
	@After
	public void tearDown() throws Exception {
	}

}
