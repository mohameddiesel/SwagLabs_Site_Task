package definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import tests.TestBase;

public class StepDefinition
{
	
	LoginPage LogObj ;
	WebDriver driver ;
	
	@Given("navigated to Login Page")
	public void navigated_to_Login_Page()
	{	
	this.driver=TestBase.driver;
		driver.get("https://www.saucedemo.com/");
		LogObj = new LoginPage(driver);
		
	}
	
    @When("Valid username and password are entered")
    public void Valid_username_and_password_are_entered ()
    {
    	
    	LogObj.enterUsernameAndPassword("standard_user","secret_sauce");
    }
    
    @When("clicked on submit button")
    public void clicked_on_submit_button()
    {
    	LogObj.ClickOnSubmit();
    }
    
    @Then("user's homepage is displauyed")
    public void user_homepage_is_displauyed()
    {
    	Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }
    @When("Invalid username and password are entered")
    public void Invalid_username_and_password_are_entered ()
    {
    	LogObj.enterUsernameAndPassword("standard_userss","secret_sauce");
    }
    @Then("Error massage will be displayed")
    public void Error_massage_will_be_displayed()
    {
    	Assert.assertTrue(LogObj.ErrorMsg.isDisplayed());
    }

	
	

}
