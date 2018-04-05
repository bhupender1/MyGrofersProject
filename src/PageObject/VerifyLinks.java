package PageObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import java.util.List;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.http.HttpResponse;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Constant;

public class VerifyLinks {
	
	public WebDriver driver;
	HttpURLConnection huc=null;
	int responsecode=200;
	int invalidLinksCount=0;
	public VerifyLinks(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(tagName="a")
	WebElement AnchorTag;
	@FindBy(tagName="img")
	List<WebElement> image;
	
	public void FindallLinks(WebDriver driver)
	{
		List<WebElement> LinkedList=driver.findElements(By.tagName("a"));
	
		//System.out.println("Total No of Links="+LinkedList.size());
		System.out.println("Total no of image="+image.size());
		
		for(WebElement element:LinkedList)
		{
			String URL=element.getAttribute("href");
			
			//System.out.println("URL Name="+URL);
			verifyLink(URL);
			
//			if(URL == null || URL.isEmpty()){
//	              System.out.println("URL is either not configured for anchor tag or it is empty="+URL);
//	              //break;
//	     }
//			if(!URL.startsWith(Constant.URL)){
//                System.out.println("URL belongs to another domain, skipping it="+URL);
//                continue;
//            }
			//BrokenLinks(driver, URL);
			//verifyLink(URL);
            
		}
		}

//	public void BrokenLinks(WebDriver driver,String URL)
//	{
//		try {
//			HttpURLConnection huc=(HttpURLConnection) new URL(URL).openConnection();
//			huc.setRequestMethod("HEAD");
//			huc.connect();
//			responsecode=huc.getResponseCode();
//			if(responsecode>=400)
//			{
//				System.out.println(URL+"Link is broken");
//			}
//			else
//			{
//				System.out.println(URL+"Link is Working Fins");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	public  void verifyLink(String urlLink) {
        //Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
        try {
            //Use URL Class - Create object of the URL Class and pass the urlLink as parameter 
            URL link = new URL(urlLink);
            // Create a connection using URL object (i.e., link)
            HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
            //Set the timeout for 2 seconds
            httpConn.setConnectTimeout(2000);
            //connect using connect method
            httpConn.connect();
            //use getResponseCode() to get the response code. 
//                if(httpConn.getResponseCode()== 200) {  
//                    System.out.println(urlLink+" SUCESSFULL "+httpConn.getResponseMessage());
//                }
               // if(httpConn.getResponseCode()== 404) 
            if(httpConn.getResponseCode()==200)
            {
            	System.out.println(urlLink+"Link Sucessfull "+httpConn.getResponseMessage());
            }
                	if(httpConn.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  {
                    System.out.println(urlLink+"Link Not Found "+httpConn.HTTP_NOT_FOUND);
                    System.out.println(urlLink+" - "+httpConn.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
                }
                if(httpConn.getResponseCode()==400)
                {
                	System.out.println(urlLink+"Bad Request"+httpConn.HTTP_BAD_REQUEST);
                }
                if(httpConn.getResponseCode()==401)
                {
                	System.out.println(urlLink+"UNAUTHORIZED LINK"+httpConn.HTTP_UNAUTHORIZED);
                }
                if(httpConn.getResponseCode()==500)
                {
                	System.out.println(urlLink+"Internal Error"+httpConn.HTTP_INTERNAL_ERROR);
                }
               // System.out.println("DONE WITH VERIFICATION");
            }
            //getResponseCode method returns = IOException - if an error occurred connecting to the server. 
        catch (Exception e) {
            //e.printStackTrace();
        	 //System.out.println("DONE WITH VERIFICATION");
        }
    } 
	
	

}
