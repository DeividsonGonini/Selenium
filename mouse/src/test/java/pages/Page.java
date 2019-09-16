package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page {

	static WebDriver driver;
	
	public Page(WebDriver driver) {
		this.driver = driver;
	}
		
	public void mouseScroll() throws InterruptedException {
		
		//a[href="\Interactions.html\"]
		WebElement interaction = driver.findElement(By.cssSelector("a[href=\"Interactions.html\"]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(interaction).perform();
		//Thread oara mostrar devagar
		Thread.sleep(5000);
		
		//a[href=\"Selectable.html\"]
		WebElement interaction2 = driver.findElement(By.cssSelector("a[href=\"Selectable.html\"]"));
		//.build serve para fazer todos os movimentos de uma vez só
		act.moveToElement(interaction2).click().build().perform();
		Thread.sleep(5000);
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(100,400)");
		Thread.sleep(5000);
		
		
		
		
	}
	
}
