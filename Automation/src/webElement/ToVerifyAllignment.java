package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Anand/Desktop/selenium1.html");
		
		Point usernameLoc = driver.findElement(By.id("123")).getLocation();
		System.out.println(usernameLoc);
		
		int usernameStartX = usernameLoc.getX();
	
	Point passwordLoc = driver.findElement(By.id("456")).getLocation();
	System.out.println(passwordLoc);
	
	
	int passordStartX = passwordLoc.getX();
	
	System.out.println("the startX of user name is : "+usernameStartX);
	System.out.println("the startX of passwod is  : "+passordStartX);
	
	if(usernameStartX== passordStartX)
	{
	
	System.out.println("Pass: Allignment is varified");
		
	}
	
	else
	{
		System.out.println("fail: Allignment is not varified");
	}
	driver.quit();
}}
