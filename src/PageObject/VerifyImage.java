package PageObject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.html.Image;

public class VerifyImage {
	WebDriver driver;
	public VerifyImage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(tagName="img")
	List<WebElement> AllImage;
	
	public void CheckAllImage(WebDriver driver)
	{
		System.out.println("Total No of Image ="+AllImage.size());
		
		for(WebElement element:AllImage)
		{
			String img=element.getAttribute("img");
			if(img==null || img.isEmpty())
			{
				System.out.println("Image are either null or empty="+img);
			}
			else
			{
				System.out.println("images are not null="+img);
			}
		}
     Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", AllImage);
		if(!ImagePresent)
		{
			System.out.println("image is not present"+AllImage);
		}
		else
		{
			System.out.println("image present="+"\t"+AllImage);
		}
		
	}

}
