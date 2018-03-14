package AppController;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObject.PageElementVerifiy;

public class App_Modular {
	
	public void Sign_In(WebDriver driver)
	{
		PageElementVerifiy pageelement=new PageElementVerifiy(driver);
		
		pageelement.check();
		//pageelement.isElementDisplay();
		//driver.close();
		
	}

}
