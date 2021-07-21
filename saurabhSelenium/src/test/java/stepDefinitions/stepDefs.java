package stepDefinitions;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BookingConfirmationFinalPage;
import pages.FlightsPage;
import pages.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import pages.PurchaseFlightPage;

public class stepDefs {
        WebDriver driver;
        HomePage home;
        FlightsPage flightsPage;
        PurchaseFlightPage purchaseFlightPage;
        BookingConfirmationFinalPage bookingConfirmationFinalPage;

    @Given("^User is on home page$")
    public void user_is_on_home_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/libs/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension",false);
        driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://blazedemo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        home = new HomePage(driver);
        flightsPage = new FlightsPage(driver);
        purchaseFlightPage = new PurchaseFlightPage(driver);
        bookingConfirmationFinalPage = new BookingConfirmationFinalPage(driver);
    }

    @When("^User selects the Departure and Destination cities$")
    public void user_selects_the_Departure_and_Destination_cities() throws InterruptedException
    {
        home.selectdepcity();
        home.selectdescity();
        home.clickOnFlightButton();
    }

    @And("^chooses the third flight$")
    public void chooses_the_first_flight() throws InterruptedException
    {
        flightsPage.clickchooseFlights();

    }

    @And("^Enters all the user information$")
    public void enters_all_the_user_information()
    {
        purchaseFlightPage.enterDetails();

    }

    @Then("^User is displayed with confirmation page$")
    public void user_is_displayed_with_confirmation_page()
    {
        Assert.assertTrue(bookingConfirmationFinalPage.getPageHeader().contains("Thank you for your purchase"));

    }
}
