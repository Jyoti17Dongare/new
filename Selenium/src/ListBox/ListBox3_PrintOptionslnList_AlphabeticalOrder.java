package ListBox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3_PrintOptionslnList_AlphabeticalOrder {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	    
	    Thread.sleep(4000);
	    
	    WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
	    
	    
	    Select s=new Select(month);
	    
	    List<WebElement> options = s.getOptions();
	    
	     TreeSet<String> ts = new TreeSet<String>();
	     
	     for(WebElement option:options)
	     {
	    	 String text = option.getText();
	    	 ts.add(text);
	     }
	     for(String t1:ts)
	     {
	    	 System.out.println(t1);
	     }
	     
	    
	    driver.quit();
	}

}

