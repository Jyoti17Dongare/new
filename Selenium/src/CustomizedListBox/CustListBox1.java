package CustomizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustListBox1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(2000);
	    
	   driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	    
	    Thread.sleep(4000);
	    
	   WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	    
	   Actions act=new Actions(driver); //keyboard can interact with browser with the help of Action class
	   
	   //1. click
	   act.click(month).perform();
	   
	   //perform
	   
	   act.sendKeys(Keys.ARROW_DOWN).perform();
	   
	   act.sendKeys(Keys.ARROW_DOWN).perform();
	   
       act.sendKeys(Keys.ARROW_DOWN).perform();
	   
	   act.sendKeys(Keys.ARROW_DOWN).perform();
	   
	   act.sendKeys(Keys.ENTER).perform();
	   
	   
	   
	   //driver.quit();
	   
	}

}
