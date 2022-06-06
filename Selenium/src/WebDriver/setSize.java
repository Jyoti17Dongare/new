package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {
	
	public static void main(String[] args) throws InterruptedException {
		
           System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           
		Dimension d=new Dimension(500, 300);
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		
		Point p=new Point(600, 400);
		driver.manage().window().setPosition(p);
		
		driver.close();
	}

}
