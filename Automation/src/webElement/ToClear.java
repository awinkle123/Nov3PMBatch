package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Anand/Desktop/DemoForXpath.html");
		
		WebElement aTextField=driver.findElement(By.xpath("//input[@value='A']"));
		aTextField.clear();
		Thread.sleep(2000);
		aTextField.sendKeys("awinkle");

	}

}
