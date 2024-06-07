package objectRepository;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IphoneTaskPage {

	
	
	@FindBy(xpath = "//input[@class='Pke_EE']")
	private WebElement searchbar;
	@FindBy(xpath = "//button[@aria-label='Search for Products, Brands and More']")
	private WebElement searchsymbol;


	public IphoneTaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void getFKartIphone(String value,WebDriver driver) throws InterruptedException {
		// searchbar.click();
		Thread.sleep(3000);
		searchbar.sendKeys(value,Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> allmobiles = driver.findElements(
				By.xpath("//div[@class='DOjaWF gdgoEp']//div[@class='col col-7-12']/child::div[@class='KzDlHZ']"));
		
		int n = allmobiles.size();
		System.out.println(n);
		HashMap<String, String> hm = new HashMap<String, String>();
		for (WebElement mobile : allmobiles) {
			String name = mobile.getText();
			String price = driver.findElement(By.xpath("//div[.='" + name
					+ "']/../following-sibling::div[@class='col col-5-12 BfVC2z']/descendant::div[@class='Nx9bqj _4b5DiR']"))
					.getText();
			hm.put(name, price);
		}
		
		TreeMap<String, String>  tm= new TreeMap<String, String>(Collections.reverseOrder());
		
       for(String i:hm.keySet()) {
			tm.put(i, hm.get(i));
		}
       
       for(String i:tm.keySet()) {
			System.out.println(i+"==="+tm.get(i));
		}
       

	}

}
