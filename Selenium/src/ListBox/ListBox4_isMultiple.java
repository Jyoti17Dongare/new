package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4_isMultiple {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	    
	    Thread.sleep(4000);
	    
	    WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	    
	    Select s=new Select(day);
	    boolean result = s.isMultiple();
	    
	    if(result==true)
	    {
	    	System.out.println("list box is multi-selectable");
	    }
	    else {
	    	System.out.println("list box is single selectable"); //list box is single selectable

	    }
	    
	    driver.quit();
	    
	}

}
