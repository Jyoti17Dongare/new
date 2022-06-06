package DDF_POM_TESTNG_BASE_UTILTY_CLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 {

	
	@FindBy(xpath="//input[@type='text']")private WebElement UN;
	@FindBy(xpath="//input[@type='password']")private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	
	public KiteLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setKiteLoginPage1UserName(String UserName)
	{
		UN.sendKeys(UserName);
	}
	
	public void setKiteLoginPage1Password(String Password)
	{
		PWD.sendKeys(Password);
	}
	public void clickKiteLoginPage1LoginBtn()
	{
		login.click();
	}
	
	
}
