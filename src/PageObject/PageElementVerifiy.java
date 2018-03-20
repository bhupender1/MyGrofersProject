package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageElementVerifiy {
	
	public  WebDriver driver=null;
	public static WebElement element;
	public PageElementVerifiy(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="logo") 
	WebElement logo;
	@FindBy(xpath="//div[@class='user-address']")
	WebElement Location;
	@FindBy(xpath="//input[@class='react-autosuggest__input']")
	WebElement searchbar;
	@FindBy(xpath="//div[@class='search']")
	WebElement searchelement;
	@FindBy(xpath="//div[text()='Login/Sign Up']")
	WebElement Login;
	@FindBy(xpath="//*[text()='My Cart']")
	WebElement MyCart;
	@FindBy(xpath="//*[text()='20% cashback for new users | Code: GROFERS20']")
	WebElement HeaderLink;
	@FindBy(xpath="//*[text()='Gurugram / Faridabad']")
	WebElement LocationSelection;

	
	public void verify(WebElement element)
	{
		if(element.isDisplayed())
		{
			System.out.println(element+" "+"element is Displayed");
		}
		else
		{
			System.out.println("element is not displayed"+element);
		}
	}
	public void check()
	{
		verify(logo);
		if(logo.isDisplayed())
		{
			System.out.println(" Logo is visible");
		}
		else
		{
			System.out.println("Logo is not vivible");
		}
		if(Location.isDisplayed())
		{
			System.out.println("location is select");
			LocationSelection.click();
		}
		else
		{
			System.out.println("Location is not selected");
		}
		if(searchelement.isDisplayed())
		{
			System.out.println("elements are displayed");
		}
		else
		{
			System.out.println("elements are not displayed");
		}
		if(Login.isEnabled())
		{
			System.out.println("Login SIgnUp is Enabled");
		}
		else
		{
			System.out.println("Login Sign Up is not Enabled");
		}
		if(MyCart.isDisplayed())
		{
			System.out.println("My Cart displayed");
		}
		else
		{
			System.out.println("my cart is not displayed");
		}
		if(HeaderLink.isEnabled())
		{
			System.out.println("Link is enabled");
		}
		else
		{
			System.out.println("link is not enabled");
		}
}

	

}
