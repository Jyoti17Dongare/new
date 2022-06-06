package POM_flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(xpath="")private WebElement clickBtn;
	@FindBy(xpath="")private WebElement SignOutBtn;
	
	public Homepage(WebElement driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickBtn()
	{
		clickBtn.click();
	}
	
	public void SignOutBtn()
	{
		SignOutBtn.click();
	}

}
