package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//converting the physical representation of property file to java representation
		 FileInputStream fis = new FileInputStream("./testData/propertyData2.properties");
		 
		 Properties property = new Properties();
		 
		 //we are loading the java representation of property file
		 property.load(fis);
		 
		 // we are fetching the value using the key
		String url = property.getProperty("url");
	System.out.println(url);
	String username = property.getProperty("username");
	System.out.println(username);
	String password = property.getProperty("password");
	System.out.println(password);
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("pwd")).sendKeys(password);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
		 
		 

	}

}
