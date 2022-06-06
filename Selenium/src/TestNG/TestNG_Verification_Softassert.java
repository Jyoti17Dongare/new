package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Verification_Softassert {
	
	@Test
	public void test()
	{
	  String actString="Good Night";
	  String expString="Good Morning";
	  boolean result =false;
	  
	  SoftAssert soft=new SoftAssert();
	  
	  //Verification:1
	  soft.assertNotEquals(actString, expString, "Verification1:act & exp result is same");
	  
	  //Verification:2
	  soft.assertEquals(actString, expString, "Verification2: act & exp result is different");
	  
	  //Verification:3
	  soft.assertTrue(result, "Verification3: Result is false");
	  
	  soft.assertAll();
	}
}
