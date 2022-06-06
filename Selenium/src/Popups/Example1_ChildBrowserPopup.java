package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_ChildBrowserPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://skpatro.github.io/demo/links/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	    
	    String idOfMainPage = driver.getWindowHandle();
	    System.out.println(idOfMainPage);  //CDwindow-B26CD2D98DD4CD3CF7E2DBBB0F1F7D14
             
	    Set<String> ids = driver.getWindowHandles();
	    
	    ArrayList al=new ArrayList(ids);
	    System.out.println(al.get(0)); //CDwindow-3615405BF237075F42374686E9C4CCCA
	    
	    System.out.println(al.get(1));  //CDwindow-D2DA940D1196CADDC65EC966B8EDB851
	    
	    Thread.sleep(2000);
	    
	    
	    
	    
	    
	}

}
