package POM_flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    
	    Thread.sleep(2000);
	    
	    
	    Signin Sign=new Signin(driver);
	    Sign.CloseBtn();
	    Sign.ClickSigninBtn();
	    
	    Thread.sleep(2000);
	    
	    Login Log=new Login(driver);
	    Log.LoginUserName();
	    
	    Log.LoginPassword();
	   
	    Log.LoginClick();
	    
	    Thread.sleep(5000);
	    
	    
	}

}
