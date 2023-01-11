package genericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POMRepo.HomePage;
import POMRepo.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fUtils = new FileUtility();
	public ExcelUtility eUtils = new ExcelUtility();
	
	@BeforeSuite
	public void bsConfi() {
		
		System.out.println("data base connection has been established");
	}
	@BeforeClass
	public void bcConfi() throws IOException {
		String url = fUtils.fetchDataFromPropertyFile("url");
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("Browser has been launched");
		System.out.println("navigated to the url");
	}
	@BeforeMethod
	public void bmConfi() throws IOException {
		String username =fUtils.fetchDataFromPropertyFile("username");
		String password =fUtils.fetchDataFromPropertyFile("password");
		
		LoginPage login= new LoginPage(driver);
		login.loginAction(username, password);
		System.out.println("Logged in to application");
	}
	@AfterMethod
	public void amConfi() {
		HomePage home = new HomePage(driver);
		home.logoutAction();
		System.out.println("Logged out to application");
	}
	@AfterClass
	public void acConfi() {
		driver.quit();
		System.out.println("Browser has been closed");
	}
	@AfterSuite
	public void asConfi() {
		System.out.println("data base connection has been closed");
	}


}
