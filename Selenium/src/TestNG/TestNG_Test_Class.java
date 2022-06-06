package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Test_Class {
	
	
	@Test   //@annotation-summary of method 
	
	public void Dispaly()
	{
		//System.out.println("Jyoti Ganesh Gaikwad");
		
		//Reporter.log("Jyoti Ganesh Gaikwad", false);
		
		Reporter.log("Jyoti Ganesh Gaikwad", true);
		
	}
   
}
