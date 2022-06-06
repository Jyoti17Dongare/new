package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_Homepage {
	
	@FindBy(xpath="//a[contains(text(),'Your repositories')]") private WebElement clickBtn;
	
	@FindBy(xpath="//a[contains(text(),' Sign out ')]") private WebElement SignOutBtn;
	
	
	public GitHub_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	public void GitHub_clickBtn()
	{
		clickBtn.click();
	}
	
	public void GitHub_SignOutBtn()
	{
		SignOutBtn.click();
		
	}

}
