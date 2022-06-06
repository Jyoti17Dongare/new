package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2_getSizeOfList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	    //)
	    Thread.sleep(4000);
	    
	    WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
	    
	    
	    Select s=new Select(month);
	    
	    List<WebElement> options = s.getOptions();
	    
	    int size = options.size();
	    System.out.println("size of months List Box:"+size);
	    
	    System.out.println("Print all option in list box using each loop");
	    for(WebElement option:options)
	    {
	    	System.out.println(option.getText());
	    }
	    
	    System.out.println("Print all option in list box using for loop");
	    for(int i=0;i<=size-1;i++)
	    {
	    	System.out.println(options.get(i).getText());
	    }
	   //driver.quit();)
	}
}
