package viaBelezaTest;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import viaBelezaPage.ViaBelezaCadastroPage;

public class ViaBelezaCadastroTest {

	static WebDriver driver;
	static ViaBelezaCadastroPage viaBelezaCadastroPage;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:/Outlook/Nova pasta/Java/Selenium/Navegadores/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://viabeleza.com/customer/account/create/");
		viaBelezaCadastroPage = new ViaBelezaCadastroPage(driver);
	}

	@Test
	public void test() {

		viaBelezaCadastroPage.criarCadastro();

	}

	@After
	public void tearDown() throws Exception {
	}

}
