package PageObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkIsOpenOrNot {
	
	WebDriver driver;
	public LinkIsOpenOrNot(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//a[@class='social-icon--facebook']")
WebElement facebook;
@FindBy(xpath="//a[@class='social-icon--twitter']")
WebElement Twitter;
@FindBy(xpath="//a[@class='social-icon--instagram']")
WebElement Instagrsm;
@FindBy(xpath="//a[@class='social-icon--linkedin']")
WebElement Linkedin;
@FindBy(xpath="//*[text()='Gurugram / Faridabad']")
WebElement LocationSelection;

public void LinkToBeOpen()
{
	LocationSelection.click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	List<WebElement> myList=new ArrayList<>();
	myList.add(facebook);
	myList.add(Linkedin);
	myList.add(Twitter);
	myList.add(Instagrsm);
	for(WebElement element:myList)
	{
	String selectAll = Keys.chord(Keys.SHIFT,Keys.RETURN);
	element.sendKeys(selectAll);
	}
}

}
