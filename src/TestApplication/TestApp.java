package TestApplication;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import AppController.App_Modular;
import Utility.Constant;

public class TestApp {
	


public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver","E:\\Eclipse WorkSpace\\Online_Store_Hybrid_Framework\\Online_Store_Hybrid_Framework\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(Constant.URL);
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Constant.ImplicitWait,TimeUnit.SECONDS );
	App_Modular app=new App_Modular();
    app.Sign_In(driver);
    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
			.withTimeout(30, TimeUnit.SECONDS) 			
			.pollingEvery(5, TimeUnit.SECONDS) 			
			.ignoring(NoSuchElementException.class);
	    
   
}

}
