package POM_flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement UN;
    @FindBy(xpath="//input[@type='password']") private WebElement PWD;
    @FindBy(xpath="(//button[@type='submit'])[2]") private WebElement Btn;

public Login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
	
	}
public void LoginUserName()
{
	UN.sendKeys("7387246019");
	}
public void LoginPassword()
{
	PWD.sendKeys("jyoti@1718");
	}

public void LoginClick()
{
  Btn.click();	
}

}