package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_ChildBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://skpatro.github.io/demo/links/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	    
	    
	    Set<String> ids = driver.getWindowHandles();
	    
	    ArrayList al=new ArrayList(ids);
	    driver.switchTo().window((String) al.get(1));
	    
	    System.out.println(al.get(1)); //CDwindow-0650B5144A8C976BDD432DEF2F4E6F6B

	    
	    Thread.sleep(7000);
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	    
	    Thread.sleep(2000);
	    driver.switchTo().window((String) al.get(0));
	    driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	    
	    Thread.sleep(2000);
	}

}
