package Mock_PKsir;

import org.testng.annotations.Test;

import objectRepository.IphoneTaskPage;
import sampleproject.Baseclass;

public class flipkartIphone extends Baseclass {

	@Test
	public void Iphone() throws InterruptedException {

		webutil.waitforpageload(driver, 20);

		IphoneTaskPage pom = new IphoneTaskPage(driver);
		pom.getFKartIphone("Iphone mobile",driver);

	}
}
