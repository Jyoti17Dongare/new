package LocatorType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
	
	public static void main(String[] args) throws InterruptedException {
		
          System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.facebook.com/");
		  
		  driver.findElement(By.cssSelector("button[type='submit']")).click();
		  Thread.sleep(2000);
		  
		  
		  driver.quit();
		  
		  
		  
	}

}
