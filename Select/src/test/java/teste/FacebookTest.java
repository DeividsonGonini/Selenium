package teste;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FacebookPage;

public class FacebookTest {
	// instancia o WebdDriver
	static WebDriver driver;
	// instancia a classe criada para a pagina de teste
	static FacebookPage facebookPage;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
//		indica o caminho do webdriver e o navegador
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/Navegadores/chromedriver.exe");
//		instancia o navegador
		driver = new ChromeDriver();
//		coloca a URL da pagina que sera testada obrigatorio ter "https://
		driver.get("https://pt-br.facebook.com/");
//		instancia a classe chamando  o driver
		facebookPage = new FacebookPage(driver);
	}

	@Test
	public void test() {
		// chama a funcao criada na classe utilizada para a automação do teste
		facebookPage.preencherComboBox();

	}

}
