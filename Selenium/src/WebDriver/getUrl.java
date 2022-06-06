package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrl {
	public static void main(String[] args) {
		
	       String expUrl = "https://www.amazon.in/";

		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//6. maximize()
        driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in/");
		//5.getUrl()
		 String ActUrl = driver.getCurrentUrl();
		 System.out.println(ActUrl); //https://www.amazon.in/
		 
		// String expUrl="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(expUrl .equals(ActUrl))
	       {
	    	System.out.println("Pass");  //pass
	    	
	       }else {
	    	   System.out.println("fail");
	       }  
		
		//7. minimize()
		driver.manage().window().minimize();
		
		driver.quit();
		
		
	}

}
