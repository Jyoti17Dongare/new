package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jyoti\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://github.com/");
	    
	    Thread.sleep(2000);
	    
	    GitHub_SignIn signIn= new GitHub_SignIn(driver);
	    signIn.clickGitHubSignInBtn();
	    
	    
	    GitHub_LogIn logIn= new GitHub_LogIn(driver);
	    logIn.GitHub_LoginUserName();
	    logIn.GitHub_LoginPassword();
	    logIn.clickGitHub_LoginBtn();
	    
	    GitHub_Homepage homepage=new GitHub_Homepage(driver);
	    homepage.GitHub_clickBtn();
	    Thread.sleep(2000);
	    
	    homepage.GitHub_SignOutBtn();
	    Thread.sleep(2000);
	    
	}

}
