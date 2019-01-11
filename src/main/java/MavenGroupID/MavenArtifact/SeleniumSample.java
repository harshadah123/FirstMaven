package MavenGroupID.MavenArtifact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {
	



	public void TestSample() {
	System.setProperty(Constants.BROWSER_DRIVER_PROP_KEY,Constants.BROWSER_DRIVER_PROP_VALUE );
	WebDriver driver  = new ChromeDriver();
	driver.get(Constants.URL);
    String paragraph= driver.findElement(By.xpath(Locators.paragraphxpath)).getText();
    System.out.println(paragraph);
    
	}
	
}
