package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalPage {

	static WebDriver driver;

	public ModalPage(WebDriver driver) {
		this.driver = driver;
	}

	public void waitModal() {
		
		WebElement botaoModal = driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/div[2]/a"));
		botaoModal.click();

		//wait do 1º click
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myModalMulti\"]/div/div/div[3]/a")));
		
		WebElement botaoModal2 = driver.findElement(By.xpath("//*[@id=\"myModalMulti\"]/div/div/div[3]/a"));
		botaoModal2.click();
		
		
		//wait do 2º click
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myModal2\"]/div/div/div[6]/a[2]")));
		
		
		WebElement botaoModal3 = driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[6]/a[2]"));
		botaoModal3.click();
		
	}

}
