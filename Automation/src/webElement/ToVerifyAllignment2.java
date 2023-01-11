package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Anand/Desktop/selenium1getlocation.html");
		
		Point usernameLoc = driver.findElement(By.id("123")).getLocation();
		System.out.println(usernameLoc);
		
		int usernameStartY = usernameLoc.getY();
		
		Point passwordLoc = driver.findElement(By.id("456")).getLocation();
		System.out.println(passwordLoc);
		
		
		int passwordStartY = passwordLoc.getY();
		
		System.out.println("the startY of user name is : "+usernameStartY);
		System.out.println("the startY of password is  : "+passwordStartY);
		
		if(usernameStartY== passwordStartY)
		{
		
		System.out.println("Pass: Allignment is varified");
			
		}
		
		else
		{
			System.out.println("fail: Allignment is not varified");
		}
		driver.quit();

	}}

