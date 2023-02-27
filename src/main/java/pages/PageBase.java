package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase 

{

	protected WebDriver driver ;

	public  PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}
	public void waitUntilWebElemntsVisiable(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void SetText(WebElement Element ,String value)
	{
		waitUntilWebElemntsVisiable(Element);
		Element.sendKeys(value);
		
	}
	
	public void ClickOnBtn (WebElement Element)
	{
		waitUntilWebElemntsVisiable(Element);
		Element.click();
	}
}
