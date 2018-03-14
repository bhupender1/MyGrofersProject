package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
}
