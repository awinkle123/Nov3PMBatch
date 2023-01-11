package BasicTestScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMRepo.HomePage;
import POMRepo.LoginPage;
import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.FileUtility;
import genericUtility.WebDriverUtility;

public class ToVerifyHomePageTest2 extends BaseClass {
		
		@Test
		public void ToVerifyHomePageTest() throws IOException {
		
		
		String expectedTitle= eUtils.fetchStringDataFromExcelSheets("Sheet3", 1, 0);
		
		//test Script		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Enter"));
			
		WebDriverUtility wUtils = new WebDriverUtility();
		wUtils.toWaitForTitle(driver, "Enter");
	
		HomePage home = new HomePage(driver);
			String actualTitle = home.verifyHomePageTitle();
			
			//in place of if else condition we can use assert method
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Pass:the title is verified");
			
			home.logoutAction();
			driver.quit();
		}

	}

