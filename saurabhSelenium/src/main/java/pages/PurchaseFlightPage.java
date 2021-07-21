package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PurchaseFlightPage 
{
	final WebDriver driver;
	
	public PurchaseFlightPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
			
	}
	
	@FindBy(xpath = ("//input[@id='inputName']"))
	WebElement name;
	
	@FindBy(xpath = ("//input[@id='address']"))
	WebElement address;
	
	@FindBy(xpath = ("//input[@id='city']"))
	WebElement city;
	
	@FindBy(xpath = ("//input[@id='state']"))
	WebElement state;
	
	@FindBy(xpath = ("//input[@id='zipCode']"))
	WebElement zipCode;

	
	@FindBy(xpath = ("//select[@id='cardType']"))
	WebElement cardType;
	
	@FindBy(xpath = ("//input[@id='creditCardNumber']"))
	WebElement creditCardNumber;
	
	@FindBy(xpath = ("//input[@id='creditCardMonth']"))
	WebElement creditCardMonth;
	
	@FindBy(xpath = ("//input[@id='creditCardYear']"))
	WebElement creditCardYear;
	
	@FindBy(xpath = ("//input[@id='nameOnCard']"))
	WebElement nameOnCard;
	
	@FindBy(xpath = ("//input[@value='Purchase Flight']"))
	WebElement purchaseFlightBtn;
	
	public void enterDetails()
	{
		name.sendKeys("ABC");
		address.sendKeys("XYZ");
		city.sendKeys("ATTT");
		state.sendKeys("KJJ");
		zipCode.sendKeys("343");
		
		Select cardtype = new Select(cardType);
		cardtype.selectByIndex(2);
		creditCardNumber.sendKeys("12345678901234567");
		creditCardMonth.sendKeys("04");
		creditCardYear.sendKeys("2021");
		nameOnCard.sendKeys("ABC");
		purchaseFlightBtn.click();
		
		
	}
	
}
