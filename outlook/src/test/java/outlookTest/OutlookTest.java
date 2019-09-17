package outlookTest;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import outlookPage.OutlookPage;

 

public class OutlookTest {

 

       static WebDriver driver;

       static OutlookPage outlookPage;

      

       @BeforeClass

       public static void setUpBeforeClass() throws Exception {

      

       System.setProperty("webdriver.chrome.driver", "C:/Selenium/Navegadores/chromedriver.exe");

       driver = new ChromeDriver();

       driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1568646081&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d9a641bdb-8804-7cfd-aacd-717ec83c30e9&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");

       outlookPage = new OutlookPage(driver);

      

       }

 

 

       @Test

       public void test() {

       outlookPage.loginEmail();
       outlookPage.enviaEmail();
       outlookPage.verificaEnvio();
      
       }

 

      

       @After

       public void tearDown() throws Exception {

       }

 

 

}