package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderAnnotations {
	
	@DataProvider(name="data-provider")
	public Object[][]
    dataProvidermethod()
    
	{
		
		return new Object[][] {{"Automation Testing"},{"Manual Testing"},{"Database Testing"}};
		
	}
	 @Test(dataProvider="data-Provider")
	 public void display(String value)
	 {
		 System.out.println("Value is:"+value);
	 }

	
	
}
