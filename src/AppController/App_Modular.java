package AppController;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObject.PageElementVerifiy;
import PageObject.StoreCardCategory;

public class App_Modular {
	
	public void Sign_In(WebDriver driver) 
	{
		PageElementVerifiy pageelement=new PageElementVerifiy(driver);
		StoreCardCategory scc=new StoreCardCategory(driver);
		
		pageelement.check();
		scc.Category();
		//pageelement.isElementDisplay();
		//driver.close();
		
	}

}
