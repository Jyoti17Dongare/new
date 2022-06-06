package WebElement;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example7_getText {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	   //Thread.sleep(2000);
	  
	    //1.Implicit Wait
	    
	  //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    //2. Explicit Wait
	    
	  //  WebDriverWait Wait= new WebDriverWait(driver,30);
	    
	 //   Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	    
	    //3. Fluent Wait
	    
	    Wait wait=new FluentWait(driver)
	          .withTimeout(Duration.ofSeconds(20))
	          .ignoring(NoSuchElementException.class)
	          .pollingEvery(Duration.ofSeconds(5));
	          
	    
	    
	    String text = driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]")).getText();
	    
	    System.out.println(text);//Forgotten password?
	}

}
