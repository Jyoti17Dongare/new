package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/delete_customer.php");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("4");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    Thread.sleep(2000);
	    
	    Alert alt=driver.switchTo().alert();
	    
	    String text1 = alt.getText();
	    
	    System.out.println(text1); //Do you really want to delete this Customer?
       
	    
	    alt.accept();
	    
	    
	    //alt.dismiss();// cancel
	  
	   Alert alt1 = driver.switchTo().alert();
	   
	  String text2 = alt1.getText();
	  System.out.println(text2);  //Customer Successfully Delete!
	     
	  
	    alt1.accept();
	  
	    Thread.sleep(2000);
	    
	    
	    
	    
	}

}
