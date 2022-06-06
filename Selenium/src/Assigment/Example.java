package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    Thread.sleep(2000);
	    
	    WebElement Home = driver.findElement(By.xpath("//div[text()='Home']"));
	    
	    Actions act=new Actions(driver);
	    
	    act.moveToElement(Home).perform();
	    Thread.sleep(9000);
	    
	   WebElement LivingRoom = driver.findElement(By.xpath("//a[text()='Living Room']"));
	   
	   act.moveToElement(LivingRoom).perform();
	   
	   Thread.sleep(9000);
	   
	   WebElement SofaBed = driver.findElement(By.xpath("//a[text()='Sofa Beds']"));
	   
	   act.moveToElement(SofaBed).perform();
	   
	   Thread.sleep(5000);
	   
	    SofaBed.click();
	    Thread.sleep(5000);	 
	    
	    driver.navigate().back();
	   // driver.quit();
	}

}
