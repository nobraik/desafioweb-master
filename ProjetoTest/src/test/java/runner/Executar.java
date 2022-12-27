package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/resources/feature",
	glue = "steps",
	tags = "@regressivo",
	monochrome = true,
	dryRun = false,
	plugin = {"pretty","html:target/cucumber-report.html"},
	snippets = SnippetType.CAMELCASE)
	
		
				
public class Executar extends DriversFactory {

	public void enptyProjet() {
		
		
		String navegador = "chrome";
		
		// se caso depois eu querer usar outro navegador//
		
		if(navegador.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		   ChromeOptions chromeOptions = new ChromeOptions();
	        
           chromeOptions.addArguments("--headless");
       chromeOptions.addArguments("--start-maximized");
       chromeOptions.setHeadless(true);
       driver = new ChromeDriver(chromeOptions);
			System.out.println(" ...Abrindo browser...");

		}
		
this.actionBrowser();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
