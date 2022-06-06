package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_click {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("input[autofocus='1']")).sendKeys("qa@pune.com");//user name path
	    
	    driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("abc@123"); //password path
	    
	    //driver.findElement(By.xpath("//button[@name='login']")).click();
	    
	   WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
	    
	    login.click();
	    
	    Thread.sleep(2000);
	    
	    driver.quit();
	    
	    
	}
}
