package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = "//input[@id='user-name']")
	WebElement Username;
	
	@FindBy(xpath ="//input[@id='password']")
	WebElement Password ;
	
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement LoginBtn ;
	
	@FindBy(xpath="//h3[@data-test='error']")
public	WebElement ErrorMsg;
	
	public void enterUsernameAndPassword(String username, String password)
	{
	
		SetText(Username, username);
		SetText(Password,password);
	}
	public void ClickOnSubmit()
	{
		ClickOnBtn(LoginBtn);	
	}
	
}
