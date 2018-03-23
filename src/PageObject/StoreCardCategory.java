package PageObject;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class StoreCardCategory {
	
	
	public WebDriver driver;
	public StoreCardCategory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//div[text()='Fruits & Vegetables' and @class='category-slider__category-text']")
	WebElement FruitsAndVegetable;
	@FindBy(xpath="//div[text()='Grocery & Staples' and @class='category-slider__category-text']")
	WebElement GroceryAndStaple;
	@FindBy(xpath="//div[text()='Beverages' and @class='category-slider__category-text']")
	WebElement Beverage;
	@FindBy(xpath="//div[text()='Home & Kitchen' and @class='category-slider__category-text']")
	WebElement HomeAndKitchen;
	@FindBy(xpath="//div[text()='Furnishing & Home Needs' and @class='category-slider__category-text']")
	WebElement FurnishingAndHomeNeeds;
	@FindBy(xpath="//div[text()='Household Needs' and @class='category-slider__category-text']")
    WebElement HouseholdNeeds;
	@FindBy(xpath="//div[text()='Personal Care' and @class='category-slider__category-text']")
	WebElement PersonalCare;
	@FindBy(xpath="//div[text()='Breakfast & Dairy' and @class='category-slider__category-text']")
	WebElement BreakfastAndDairy;
	@FindBy(xpath="//div[text()='Biscuits, Snacks & Chocolates' and @class='category-slider__category-text']")
	WebElement BiscuitsSnacks;
	@FindBy(xpath="//div[text()='Noodles, Sauces & Instant Food' and @class='category-slider__category-text']")
	WebElement NoodlesAndSauces;
	@FindBy(xpath="//div[text()='Baby & Kids' and @class='category-slider__category-text']")
	WebElement BabyAndKids;
	@FindBy(xpath="//div[text()='Pet Care' and @class='category-slider__category-text']")
	WebElement PetCare;
	@FindBy(xpath="//div[text()='Meats, Frozen & Seafood' and @class='category-slider__category-text']")
	WebElement MeatsFrozenSeafood;
	@FindBy(xpath="//div[@title='Next Product' and @class='slider__arrow--nav slider__arrow--right icon-angle-bracket-right slider__arrow--circle']")
	WebElement slider;
	
	public void Category() 
	{
		if(FruitsAndVegetable.isDisplayed())
		{
			System.out.println("fruits is displayed");
		}
		else
		{
			System.out.println("Fruits is not displayed");
		}
		if(GroceryAndStaple.isDisplayed())
		{
			System.out.println("Grocery is displayed");
		}
		else
		{
			System.out.println("Grocery is not displayed");
		}
		if(Beverage.isDisplayed())
		{
			System.out.println("Beverage is displayed");
		}
		else
		{
			System.out.println("Beverage is not displayed");
		}
		if(HomeAndKitchen.isDisplayed())
		{
			System.out.println("home and kitchen is displayed");
		}
		else
		{
			System.out.println("Home and Kitchen is not displayed");
		}
		if(FurnishingAndHomeNeeds.isDisplayed())
		{
			System.out.println("Furnishing and home displayed");
		}
		else
		{
			System.out.println("Furnishing and home is not displayed");
		}
		if(HouseholdNeeds.isDisplayed())
		{
			System.out.println(HouseholdNeeds.getText());
			System.out.println("House hold need is displayed");
		}
		else
		{
			System.out.println("House hold is not displayed");
		}
		//slider.click();
		if(PersonalCare.isDisplayed())
		{
			System.out.println(PersonalCare.getText());
			System.out.println("Personel care is displayed");
		}
		else
		{
			System.out.println("personel care is not displayed");
		}
		 
           WebDriverWait wait=new WebDriverWait(driver, 200);
           wait.until(ExpectedConditions.elementToBeClickable(slider));

       
		
		
		if(BreakfastAndDairy.isDisplayed())
		{
			System.out.println(BreakfastAndDairy.getText());
			System.out.println("break fast and diary is displayed");
		}
		else
		{
			System.out.println(BreakfastAndDairy.getText());
			System.out.println("break fast and diary is not displayed");
		}
		if(BiscuitsSnacks.isDisplayed())
		{
			System.out.println(BiscuitsSnacks.getText());
			System.out.println("Biscuits and snacks is displayed");
		}
		else
		{
			System.out.println(BiscuitsSnacks.getText());
			System.out.println("biscuts and snacks is not displayed");
		}
		//Thread.sleep(1000);
		//slider.click();
		
		if(NoodlesAndSauces.isDisplayed())
		{
			System.out.println(NoodlesAndSauces.getText());
			System.out.println("noodles and snacks is displayed");
		}
		else
		{
			System.out.println(NoodlesAndSauces.getText());
			System.out.println("noodles and snacks is not displayed");
		}
		if(BabyAndKids.isDisplayed())
		{
			System.out.println(BabyAndKids.getText());
			System.out.println("baby and kids is displayed");
		}
		else
		{
			System.out.println(BabyAndKids.getText());
			System.out.println("baby and kids is not displayed");
		}
		if(PetCare.isDisplayed())
		{
			System.out.println(PetCare.getText());
			System.out.println("pet care is displayed");
		}
		else
		{
			System.out.println(PetCare.getText());
			System.out.println("pet care is not displayed");
		}
		if(MeatsFrozenSeafood.isDisplayed())
		{
			System.out.println(MeatsFrozenSeafood.getText());
			System.out.println("Meats and frozen is displayed");
		}
		else
		{
			System.out.println(MeatsFrozenSeafood.getText());
			System.out.println("meats and frozen is not displayed");
		}
	}
	
}
