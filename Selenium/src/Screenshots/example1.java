package Screenshots;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(2000);
	    
	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    System.out.println(src); //C:\Users\91738\AppData\Local\Temp\screenshot17619721903933712949.png

	    
	    File dest=new File("E:\\HTML\\Screenshot\\facebook.png");
	    FileHandler.copy(src, dest);
	    
	    Thread.sleep(2000);
	    driver.quit();
	    
	}

}
