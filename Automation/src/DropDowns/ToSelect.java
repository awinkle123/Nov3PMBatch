package DropDowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");

		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
		
		Select select = new Select(dropdown);
		select.selectByIndex(5);
		Thread.sleep(2000);
		select.selectByVisibleText("Voilet");
		Thread.sleep(2000);
		select.selectByValue("6");

	}

}
