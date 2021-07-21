package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage {

final WebDriver driver;
	
	public FlightsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);

			
	}
	
	
	
	@FindBy(xpath = ("/html/body/div[2]/table/tbody/tr[3]/td[1]/input"))
	WebElement chooseFlights;
	
	public void clickchooseFlights() throws InterruptedException
	{
		chooseFlights.click();
		Thread.sleep(5000);
	}
	
}
