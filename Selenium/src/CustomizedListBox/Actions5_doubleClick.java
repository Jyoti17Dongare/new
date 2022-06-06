package CustomizedListBox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions5_doubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    
	    Thread.sleep(2000);
	    
	    WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
	    
	    Actions act= new Actions(driver);
	    
	    act.doubleClick(doubleClick).perform();
	    
	    //alert popup
	    
	    Alert alt=driver.switchTo().alert();
	    
	    //.getTest
	    
	    System.out.println(alt.getText()); //You double clicked me.. Thank You.
	    
	    //2.Accept -> used to click to ok button
	    alt.accept();
	    
	    //3. Dismiss-> used to click on cancel button
	   // alt.dismiss();
	    
	    Thread.sleep(2000);
	    
	    
	    
	    
	    
	    
	}
}
