package viaBelezaPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViaBelezaCadastroPage {

	static WebDriver driver;

	public ViaBelezaCadastroPage(WebDriver driver) {
		this.driver = driver;

	}

	public void criarCadastro() {

		WebElement campoNome = driver.findElement(By.id("firstname"));
		campoNome.sendKeys("Carol");

		WebElement campoSobrenome = driver.findElement(By.id("lastname"));
		campoSobrenome.sendKeys("Castro");

		WebElement campoEmail = driver.findElement(By.id("email_address"));
		campoEmail.sendKeys("contato@gmail.com");

		WebElement campoCPF_CNPJ = driver.findElement(By.id("taxvat"));
		campoCPF_CNPJ.sendKeys("11.123.456/0001/71");

		WebElement campoSenha = driver.findElement(By.id("password"));
		campoSenha.sendKeys("123456");

		WebElement campoConfirmarSenha = driver.findElement(By.id("confirmation"));
		campoConfirmarSenha.sendKeys("123456");

		WebElement botaoEnviar = driver.findElement(By.xpath(".//*[@id=\"form-validate\"]/div[3]/button"));
		botaoEnviar.click();

	}
}
