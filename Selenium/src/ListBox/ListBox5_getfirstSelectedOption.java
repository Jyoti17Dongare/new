package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox5_getfirstSelectedOption {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	    
	    Thread.sleep(4000);
	    
	    WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	    
	   Select s = new Select(day);
	   
	   s.selectByVisibleText("10"); //10
	   
	   System.out.println(s.getFirstSelectedOption().getText());
	   
	   driver.quit();
	   
	   
	   
	}

}
