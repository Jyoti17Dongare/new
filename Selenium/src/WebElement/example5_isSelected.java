package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_isSelected {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(2000);
	    
        driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	    
	     Thread.sleep(4000);
	     
	     WebElement female = driver.findElement(By.xpath("//input[@class='_8esa'][1]"));
	     
	    // female.click();
	     
	     Thread.sleep(2000);
	     
	     boolean result = female.isSelected();
	     
	     System.out.println(result);//false
	     
	     //driver.quit();
	     
	}
}
