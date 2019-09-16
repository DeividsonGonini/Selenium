package test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.RegisterPages;

public class RegisterTest {

	static WebDriver driver;
	static RegisterPages registerPages;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/Navegadores/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		registerPages = new RegisterPages(driver);
	}

	@Test
	public void test() {
		registerPages.preencherIdDinamico();
	}

}
