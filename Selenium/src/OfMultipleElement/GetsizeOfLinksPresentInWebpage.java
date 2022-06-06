package OfMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetsizeOfLinksPresentInWebpage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(2000);
	    
	  List<WebElement> AllLists = driver.findElements(By.xpath("//a")); 
	  
	  System.out.println(AllLists.size());  //47
	  
	  
	  for(WebElement Link:AllLists)
	  {
		  System.out.println(Link.getText());
	  }
	  Thread.sleep(2000);
	  
	    
	}
}
