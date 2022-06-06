package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_LogIn {
	
	@FindBy(xpath="//input[@name='login']") private WebElement UN;
	
	@FindBy(xpath="//input[@name='password']") private WebElement PWD;

	@FindBy(xpath="//input[@name='commit']") private WebElement LoginBtn;
	

public GitHub_LogIn(WebDriver driver)
  {
	PageFactory.initElements(driver, this);
	
	}

public void GitHub_LoginUserName()
{
	UN.sendKeys("dongare.jyoti17@gmail.com");
	}

public void GitHub_LoginPassword()
{
  PWD.sendKeys("Jyoti@1718");	
}

public void clickGitHub_LoginBtn()
{
  LoginBtn.click();	
}






}