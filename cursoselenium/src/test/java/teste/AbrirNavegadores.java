package teste;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbrirNavegadores {

	// Instanciando a classe Webdriver (para importar Ctrl + Shit + o)
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//dizer onde esta esse executavel
//		System.setProperty("webdriver.chrome.driver", "C:/Selenium/Navegadores/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:/Selenium/Navegadores/geckodriver.exe");
//	//instanciar
		driver = new FirefoxDriver();
//		driver = new ChromeDriver();
		
		driver.get("http://www.youtube.com.br");
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//ele fecha apenas a aba que usou
		driver.close();
		
//		//ele fecha o browser inteiro
//		driver.quit();
//	}

}
}