package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_equal {
	
	public static void main(String[] args) throws InterruptedException {
		
		String exp="realme 8 pro";
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("realme");
	    Thread.sleep(2000);
	    
	   List<WebElement> AllOptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	   
	   for(WebElement options:AllOptions)
	   {
		   String act=options.getText();
		   
		   if(act.equals(exp))
		   {
			   options.click();
			   break;
		   }
	   }
	    Thread.sleep(2000);
	}

	
	}


