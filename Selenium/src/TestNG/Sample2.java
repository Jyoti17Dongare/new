package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void TC4()
	{
		System.out.println("Running TC4");
	}
   
	@Test
	public void TC5()
	{
		System.out.println("Running TC5");
	}
	
	@Test
	public void TC6()
	{  // Assert.fail();
		System.out.println("Running TC6");
	}
    
	@Test
	public void TC7()
	{
		System.out.println("Running TC7");
	}
   
}
