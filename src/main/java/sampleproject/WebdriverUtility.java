package sampleproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebdriverUtility {

	
	public void waitforpageload(WebDriver driver, int sec)
	{
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sec));
	}
}
