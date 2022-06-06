package LocatorType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		
		  driver.get("https://www.facebook.com/");
		  
		  driver.findElement(By.xpath("//input[@id='EmailId']")).sendKeys("jyoti@123.com");
		  
		  Thread.sleep(2000);
		  
		 // driver.findElement(By.xpath("//button[text()='Log In']")).click();
		  
		  //driver.findElement(By.xpath("//button[text()='Log In']")).click();
		  Thread.sleep(2000);
		  
		  driver.quit();
		  
	}

}
