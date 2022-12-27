package drivers;

import org.openqa.selenium.WebDriver;

public class DriversFactory {

	public static WebDriver driver;
	
	
	public void actionBrowser() {
		String siteUrl = "https://www.amazon.com";
		driver.manage().window().maximize();
		driver.navigate().to(siteUrl);
		
		
	}
	
}
