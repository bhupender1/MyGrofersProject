package TestApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AppController.App_Modular;

public class TestApp {
	


public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Eclipse WorkSpace\\Online_Store_Hybrid_Framework\\Online_Store_Hybrid_Framework\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://grofers.com");
	App_Modular app=new App_Modular();
    app.Sign_In(driver);
	
}

}
