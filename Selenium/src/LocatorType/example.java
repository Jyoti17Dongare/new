package LocatorType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("E:\\HTML\\LoingInpage1.html");
		
		//1.TagName
		
		driver.findElement(By.tagName("input")).sendKeys("Jyoti@123.com");
		Thread.sleep(2000);
		//2.id
		
		driver.findElement(By.id("1234")).sendKeys("jy@123");
		Thread.sleep(2000);
		
		//3.className
		
		driver.findElement(By.className("abcd")).sendKeys("quantum@pune.com");
		Thread.sleep(2000);
		
		//4.name
		
		driver.findElement(By.name("xyz")).sendKeys("1233456");
		Thread.sleep(2000);
		
		//5. linkText
		//driver.findElement(By.linkText("link")).click();
		//Thread.sleep(2000);
		
		//6.partialLinkText
		driver.findElement(By.partialLinkText("link")).click();
		Thread.sleep(2000);
		
		
		
		//driver.quit();
	}

}
