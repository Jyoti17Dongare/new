package POM_flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']") private WebElement ok;
	@FindBy(xpath="//a[@class='_1_3w1N']")private WebElement SI;
	
	public Signin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void CloseBtn()
	{
		ok.click();
	}
    public void ClickSigninBtn()
    {
    	
    	SI.click();
    }
}
