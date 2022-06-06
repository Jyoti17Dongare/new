package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTesting {
	
	@Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException
	{
		WebDriver driver=null;
		if(browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		/*else
			
			if(browserName.equals("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "E:\\Jyoti\\geckodriver.exe");
				
				driver=new FirefoxDriver();
			}else
				
				if(browserName.equals("ie"))
					
				{
					System.setProperty("webdriver.ie.driver", "E:\\Jyoti\\iedriver.exe");
					
					driver=new InternetExplorerDriver();
				}*/
				
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(2000);
		
		
					
					
					
					
	}

}
