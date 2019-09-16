package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookPage {

	// instancia o WebdDriver
	static WebDriver driver;

	// criar o metodo Construtor da classe onde sera instanciado o WebDriver
	public FacebookPage(WebDriver driver) {
		this.driver = driver;

	}

	// criar o metodo para preenchimento dos campos
	public void preencherXpath() {
		//Coloca a busca do elemento e informa o que sera buscado para achar o elemento (nome, id, xpath...)
		WebElement nome = driver.findElement(By.xpath(".//*[@id='u_0_l']"));
		// dado a ser inserido no campo para teste
		nome.sendKeys("Joao");

		WebElement sobrenome = driver.findElement(By.xpath("//*[@id=\'u_0_n\']"));
		sobrenome.sendKeys("Amaro");

		WebElement email = driver.findElement(By.xpath("//*[@id=\'u_0_q\']"));
		email.sendKeys("joao.amaro@gmail.com");

	}
}
