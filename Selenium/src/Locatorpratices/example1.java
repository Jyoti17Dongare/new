package Locatorpratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("E:\\HTML1\\ex1.html");
		
		//1.tagname
		driver.findElement(By.tagName("input")).sendKeys("Jyoti");
		
		//2.Id
		driver.findElement(By.id("abc")).sendKeys("jyoti@123");
		
		//3.ClassName
		
		
		
	}

}
