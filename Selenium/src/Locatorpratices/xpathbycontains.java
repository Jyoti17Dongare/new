package Locatorpratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbycontains {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		
		  driver.get("https://www.facebook.com/");
		  
		  
		  driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
	}

}
