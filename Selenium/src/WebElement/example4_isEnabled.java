package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_isEnabled {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(2000);
	    
	    boolean result = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
	    
	 //  WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
	   // login.isEnabled();
	    
	    if(result==true)
	    {
	    	System.out.println("Element is enabled");//Element is enabled
	    	 }
	    else 
	    {
	    	System.out.println("Element is disabled");
	    }
	    
	   // driver.quit();
	    
	}

}
