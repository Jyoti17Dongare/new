package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Jyoti\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 //1. get() -> to open specific url
		 driver.get("https://www.facebook.com/");
		 
		 
		
	}

}
