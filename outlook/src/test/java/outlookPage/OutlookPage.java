
package outlookPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OutlookPage {

	static WebDriver driver;

	public OutlookPage(WebDriver driver) {

		this.driver = driver;

	}

	public void loginEmail() {

		WebElement email = driver.findElement(By.name("loginfmt"));
		email.sendKeys("goniniteste@outlook.com");

		WebElement click1 = driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
		click1.click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='i0118']")));

		WebElement senha = driver.findElement(By.xpath("//*[@id='i0118']"));
		senha.sendKeys("suporte10");

		WebElement click2 = driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
		click2.click();

	}

	public void enviaEmail() {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'id__5\']")));
		WebElement novaMensagem = driver.findElement(By.xpath("//*[@id=\'id__5\']"));
		novaMensagem.click();;
		
		WebDriverWait wait4 = new WebDriverWait(driver, 500);
		wait4.until(ExpectedConditions
				.visibilityOfElementLocated(By.className("ms-Button-label label-73")));
		WebElement remetente = driver.findElement(By.className("ms-BasePicker-input pickerInput_ecad0f63"));
		remetente.sendKeys("rafa.olivieri@hotmail.com");

		WebElement assunto = driver.findElement(By.className("ms-TextField-field field-173"));
		assunto.click();
		assunto.sendKeys("Assunto - teste envio e-amil com selenium");

		WebElement texto = driver.findElement(By.className(
				"_4utP_vaqQ3UQZH0GEBVQe B1QSRkzQCtvCtutReyNZ _17ghdPL1NLKYjRvmoJgpoK _2s9KmFMlfdGElivl0o-GZb"));
		texto.clear();
		texto.sendKeys("Corpo do e-mail, selenium");

		WebElement enviar = driver
				.findElement(By.className("ms-Button ms-Button--primary y8XIN4EAeheOqsn4BJB7R root-179"));
		enviar.click();
	}

	public void verificaEnvio() {
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.className("_12x3EFWPe3LGNm6mV745C2")));

		WebElement enviados = driver
				.findElement(By.className("_1XmKWz3L5NcheRkx38wxTL qDw7SZ9r6S7r0_qZS1aIG NJVykX0WljoRws2qTYI5G"));
		enviados.click();

		WebDriverWait wait3 = new WebDriverWait(driver, 20);
		wait3.until(
				ExpectedConditions.invisibilityOfElementWithText(null, "Assunto - teste envio e-amil com selenium"));
	}
}
