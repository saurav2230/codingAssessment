package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	final WebDriver driver;

	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(xpath = ("//select[@name = 'fromPort']"))
	WebElement depCity;
	
	@FindBy(xpath = ("//select[@name = 'toPort']"))
	WebElement desCity;
	

	@FindBy(xpath = ("//input[@value = 'Find Flights']"))
	WebElement findFlights;



	public void selectdepcity() {
		
		Select city = new Select(depCity);
		city.selectByIndex(3);
		System.out.println("Selected the value departure");
		
	}
	
public void selectdescity() {
		
		Select city = new Select(depCity);
		city.selectByIndex(3);
		System.out.println("Selected the value destination");
		
	}
	
	public void clickOnFlightButton() throws InterruptedException
	{
		findFlights.click();
		System.out.println("Button clicked");
		Thread.sleep(5000);
	}
}
