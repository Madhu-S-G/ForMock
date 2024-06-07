package sampleproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import com.mysql.cj.jdbc.Driver;

public class Baseclass {

	public WebdriverUtility webutil= new WebdriverUtility();
	public WebDriver driver;
	
	@BeforeClass
	public void launchbrowser()
	{
		
		String url= IpathConstant.url;
		String browser= IpathConstant.browser;
		if(browser=="ChromeDriver")
		{
		driver = new ChromeDriver(); 
		driver.get(url);
		}
		else
		{
			driver=new FirefoxDriver();
			driver.get(url);
		}
	}
}
	

