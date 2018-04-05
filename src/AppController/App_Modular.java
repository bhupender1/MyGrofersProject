package AppController;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObject.LinkIsOpenOrNot;
import PageObject.PageElementVerifiy;
import PageObject.StoreCardCategory;
import PageObject.VerifyImage;
import PageObject.VerifyLinks;

public class App_Modular {
	
	public void Sign_In(WebDriver driver) 
	{
		
		PageElementVerifiy pageelement=new PageElementVerifiy(driver);
		StoreCardCategory scc=new StoreCardCategory(driver);
		VerifyLinks links=new VerifyLinks(driver);
		VerifyImage image=new VerifyImage(driver);
		LinkIsOpenOrNot linkOpen=new LinkIsOpenOrNot(driver);
		//links.FindallLinks(driver);
		//links.validateInvalidLinks(driver);
		//links.FindallLinks(driver);
		//image.CheckAllImage(driver);
		//linkOpen.LinkToBeOpen();
	//	pageelement.check();
		//scc.Category();
		//pageelement.isElementDisplay();
		//driver.close();
		
	}

}
