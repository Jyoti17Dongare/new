package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_Popups {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://flipkard.com/");
	    
	    Thread.sleep(2000);
	    
	    WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	    
	    close.click();
	    Thread.sleep(2000);
	    
	    
	}

}
