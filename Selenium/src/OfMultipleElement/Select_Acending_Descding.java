package OfMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Acending_Descding {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("file:///E:/HTML/Multiple.html");
	    
	    Thread.sleep(2000);
	    
	   List<WebElement> checkbox = driver.findElements(By.xpath("//input"));
	   
	   System.out.println(checkbox.size()); //11
	   
	   for(int i=0;i<=checkbox.size()-1;i++)
	   {
		   checkbox.get(i).click();
		   Thread.sleep(2000);
		   
		   
	   }	
	   for(int i=checkbox.size()-1;i>=0;i--) {
		   
		  checkbox.get(i).click();
		  Thread.sleep(2000);
		   
		   
	   }
	   
	}

}
