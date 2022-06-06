package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeClass
		public void openBrowser()
		{
			//openBrowser code
		}
	
	@BeforeMethod
	   public void loginBrowser()
	   {
		//Login code
	   }
	
	@Test
	   public void test1()
	   {
		//actual code
	   }
	
	@Test
	   public void test2()
	   {
		//actual code
	   }
	
	@AfterMethod
	   public void Logout()
	   {
		//Logout
	   }
	
	@AfterClass
	   public void Close()
	   {
		//driver.quit();
	   }
	
	
	
	
	
	

}
