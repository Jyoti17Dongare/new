package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keywords {
	
	/*@Test(invocationCount=5)
	public void TC1()
	{
		Reporter.log("running TC1", true);
	} */
	
	@Test(priority=-2)
	public void TC2()
	{
		Reporter.log("running TC2", true);
	}
	
	@Test(priority=1,enabled=false)
	public void TC3()
	{
		Reporter.log("running TC3", true);
	}
	
	
	@Test
	public void TC4()  //By default priority=0
	{
		Reporter.log("running TC4", true);
	}
	
	@Test(priority=1)
	public void TC5()
	{
		Reporter.log("running TC5", true);
	}
	
	@Test(dependsOnMethods= {"TC4","TC2"})
	public void TC6()
	{
		Reporter.log("running TC6", true);
	}
	
	@Test(timeOut=2000)
	public void TC7() throws InterruptedException
	{
		Thread.sleep(4000);
		Reporter.log("running TC7", true);
	}

}
