package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertions {
	
	//1. assertEquals
	
	/*@Test
	public void test()
	{
		Reporter.log("Running test mathod", true);
		String expString="Jyoti Gaikwad";
		String actString="Jyoti Gaikwad";
		
		Assert.assertEquals(actString, expString, "act & exp Result are Different");
	} */
	
	//2. assert.NotEquals
	
	/*@Test
	public void test()
	{
		Reporter.log("Running test mathod", true);
		String expString="Jyoti Gaikwad";
		String actString="Jyoti Gaikwad123";
		Assert.assertNotEquals(actString, expString, "act & exp Result are Similar");
		
	} */
	
	//3. assertTrue
	
/*	@Test
	public void test()
	{
		Reporter.log("Running test mathod", true);
		boolean result=true;
		
		Assert.assertTrue(result, "Result is false");
		
	}    */
	
	//4. assertFalse
 /*	@Test
	public void test()
	{
		Reporter.log("Running test mathod", true);
		boolean result=false;
		
		Assert.assertFalse(result, "Result is true");
		
	}   */
	
	
	//5.assertNull
	
	@Test
	public void test1()
	{
		Reporter.log("Running test mathod", true);
		
		String actString= null;
		
	Assert.assertNull(actString, "act result is not null");
	}  
	
	
	// 6.assertNotNull
	@Test
	public void test2()
	{
		Reporter.log("Running test mathod", true);
		
		String actString= "Jyoti gaikwad";
		
	Assert.assertNotNull(actString, "act result is  null");
	}   
	
	
	// 7. fail
	
	@Test
	public void test3()
	{
		Reporter.log("Running test mathod", true);
		Assert.fail();
	}
	

}
