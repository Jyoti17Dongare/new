package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// 1.get()  -> to open specific url
		driver.get("https://www.facebook.com/");
		
		//2.close();
		// driver.close();
		
		
		//quit()
		driver.quit();
		
		}

}
