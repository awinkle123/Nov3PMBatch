package BasicTestScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POMRepo.HomePage;
import POMRepo.LoginPage;
import genericUtility.ExcelUtility;
import genericUtility.FileUtility;
import genericUtility.WebDriverUtility;
public class ToVerifyHomePageTest {

	public static void main(String[] args) throws IOException {
	
		FileUtility fUtils = new FileUtility();
		String url = fUtils.fetchDataFromPropertyFile("url");
	
		
		
	String username =fUtils.fetchDataFromPropertyFile("username");
	String password =fUtils.fetchDataFromPropertyFile("password");

	
	ExcelUtility eUtils = new ExcelUtility();
	String expectedTitle= eUtils.fetchStringDataFromExcelSheets("Sheet3", 1, 0);
	
	
	//test Script
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
		LoginPage login= new LoginPage(driver);
		login.loginAction(username, password);
		
	WebDriverWait wait= new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.titleContains("Enter"));
		
	WebDriverUtility wUtils = new WebDriverUtility();
	wUtils.toWaitForTitle(driver, "Enter");
	
	
		HomePage home = new HomePage(driver);
		String actualTitle = home.verifyHomePageTitle();
		
		if(actualTitle.equals(expectedTitle))
		{
		 System.out.println("pass: The title is verified");
		}
		else
		{
			System.out.println("fail: The title is not verified");
		}
		
		home.logoutAction();
		driver.quit();	
	}

}
