package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

public class CadastroPages {

	static WebDriver driver;

	public CadastroPages(WebDriver driver) {
		this.driver = driver;
	}

	public void preencherCampos() {

		WebElement nome = driver.findElement(By.id("firstName"));
		nome.sendKeys("Bruno");

		WebElement sobrenome = driver.findElement(By.name("lastName"));
		sobrenome.sendKeys("Batista");

//		WebElement email = driver.findElement(By.id("username"));
//		email.sendKeys("testepreenchecadastro");

		WebElement senha = driver.findElement(By.name("Passwd"));
		senha.sendKeys("fulano@1234");

		WebElement confirmarSenha = driver.findElement(By.name("ConfirmPasswd"));
		confirmarSenha.sendKeys("fulano@1234");

		// os campos abaixo nao sao mais exigidos na primeira fase
		// porem deixarei aqui a fins de conhecimento
//		
//		WebElement dia = driver.findElement(By.id("BirthDay"));
//		dia.sendKeys("22");
//		
//		//em caso de campo com Select (onde voce escolhe as opções que ja sao definidas)
//		WebElement mes = driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]"));

//		//comando para clicar
//		mes.click();

//		no navegador, clicar no campo e depois clicar com o direito em na opçao que deseja selecionar
//		e pegar o xpath dele
//		WebElement mesDezembro = driver.findElement(By.xpath(".//*[@id=' :c']/div"));
//		mesDezembro.click();

		// continuação
//		WebElement ano = driver.findElement(By.name("BirthYear"));
//		ano.sendKeys("1989");
//
//		WebElement sexo = driver.findElement(By.xpath(".//*[@id='Gender']/div[1]"));
//		sexo.click();
//		WebElement sexom = driver.findElement(By.xpath(".//*[@id='Gender']/div"));
//		sexom.click();
//
//		WebElement celular = driver.findElement(By.name("RecoveryPhoneNumber"));
//		celular.sendKeys("11 999775429");
//
//		WebElement emailAtual = driver.findElement(By.id("RecoveryEmailAddress"));
//		emailAtual.sendKeys("testecadastrogoogle@gmail.com");
//
		WebElement gravar = driver.findElement(By.xpath("//*[@id='accountDetailsNext']"));
		gravar.click();

	}

	public String validarMensagem() {

		return driver.findElement(By.className("GQ8Pzc")).getText();

	}

}
