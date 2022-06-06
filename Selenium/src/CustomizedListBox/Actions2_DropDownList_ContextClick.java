package CustomizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2_DropDownList_ContextClick {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    Thread.sleep(2000);
	    
	   WebElement More = driver.findElement(By.xpath("//div[text()='More']"));
	    
	    Actions act=new Actions(driver);
	    
	    //2. ConttextClick -> to perform right click
	    act.contextClick(More).perform();
	    Thread.sleep(2000);
	    
	}
	

}
