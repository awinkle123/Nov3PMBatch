package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextfiled = driver.findElement(By.id("username"));
		WebElement passordTextfield = driver.findElement(By.name("pwd"));
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
		
		String usernameTagname = usernameTextfiled.getTagName();
		String passwordTagname = passordTextfield.getTagName();
		String loginButtonTagName = loginButton.getTagName();
		
		if(usernameTagname.equals("input")&& passwordTagname.equals("input") && loginButtonTagName.equals("div"))
		{
			usernameTextfiled.sendKeys("admin");
			passordTextfield.sendKeys("manager");
			loginButton.click();
			
		}
		
		else
		{
			System.out.println("Tag name is not matching ");
			//no driver.quit required because it will delay 
		}
		
		
		
	}

}
