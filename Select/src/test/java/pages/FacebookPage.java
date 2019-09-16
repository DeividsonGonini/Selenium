package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookPage {
	static WebDriver driver;

	public FacebookPage(WebDriver driver) {
		this.driver = driver;

	}

	public void preencherComboBox() {
		Select dia = new Select(driver.findElement(By.id("day")));
		//por Value = valor
		dia.selectByValue("3");
		// por texto visível (o texto que aparece para o Usuario)
		//dia.deselectByVisibleText(text);

		Select mes = new Select(driver.findElement(By.id("month")));
		mes.selectByVisibleText("Mar");
	
		Select ano = new Select(driver.findElement(By.id("year")));
		ano.selectByValue("2016");
	
	}
}
