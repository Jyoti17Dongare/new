package CustomizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1_DropDownList_MoveToElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    Thread.sleep(2000);
	    
	    WebElement Login = driver.findElement(By.xpath("//a[text()='Login']"));
	    
	    Actions act=new  Actions(driver);
	    
	    //1. moveToElement
	    
	    act.moveToElement(Login).perform();
	    Thread.sleep(2000);
	    
		
	    
	}

	
	

}
