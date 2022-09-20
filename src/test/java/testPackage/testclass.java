package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage.HomePage;
import pomPackage.LogInpage;


public class testclass {
	


    public static void main(String[] args) 
    {
  	  
 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	//(verify login functionality)
	
	LogInpage login=new LogInpage(driver);
	
	login.sendUsername();
	login.sendpassword();
	login.clickOnLoginButton();
	
	//verify home page)
	HomePage home=new HomePage(driver);
	home.verifyAdminTab();
	home.verifyleaveTab();
	home.verifyPIMTab();
	
    }

}
