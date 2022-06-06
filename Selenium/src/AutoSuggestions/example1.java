package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
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
		   System.out.println(options.getText());
	   }
	    Thread.sleep(2000);
	}

}
