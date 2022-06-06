package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_verification_AssertClass_Disadvantage {
	
	@Test
	public void test()
	{
	  String actString="Good Night";
	  String expString="Good Morning";
	  boolean result =false;
	  
	  //Verification:1
	  Assert.assertNotEquals(actString, expString, "Verification1:act & exp result is same");
	  
	  //Verification:2
	  Assert.assertEquals(actString, expString, "Verification2: act & exp result is different");
	  
	  //Verification:3
	  Assert.assertTrue(result, "Verification3: Result is false");
	  
	  //Verification2: act & exp result is different expected [Good Morning] but found [Good Night]
	  
	}

}
