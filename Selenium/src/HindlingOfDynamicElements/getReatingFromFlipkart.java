package HindlingOfDynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getReatingFromFlipkart {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 9 pro");
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    Thread.sleep(50000);
	    
	     String Reating = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[4]//span)[4]")).getText();
		
	    System.out.println(Reating);//25,759 Ratings 
	    Thread.sleep(5000);
	}
}
