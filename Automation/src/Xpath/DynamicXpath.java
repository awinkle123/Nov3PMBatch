package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		//String productPrice= "45,999";
		//String productName= "APPLE iPHONE 11(Black, 128GB)";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=apple%20iphone%2011&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
       WebElement price = driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹46,999']"));
       String actualPrice= price.getText();
       System.out.println(actualPrice);
        
	}

}
