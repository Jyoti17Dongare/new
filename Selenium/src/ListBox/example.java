package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	    
	    Thread.sleep(2000);
	    
	    //step 1:
	   WebElement year = driver.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg'][3]"));
	    
	    //Step 2:
	    Select s=new Select(year);
	    
	    
	    //step 3:
	    
	  //  s.selectByIndex(2);
	    
	  //  s.selectByValue("2004");
	    
	    s.selectByVisibleText("1895");
	   
	    Thread.sleep(2000);
	    
	    driver.quit();
	    
	    
		
		
		
	}

}
