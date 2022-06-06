package DDF_POM_TESTNG_BASE_UTILTY_CLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage2 {
	
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']")private WebElement ContBtn;
	
	public KiteLoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setKiteLoginPage2PIN(String pin)
	{
		PIN.sendKeys(pin);
	}
	
	public void setKiteLoginPage2ContinueBtn()
	{
		ContBtn.click();
	}

}
