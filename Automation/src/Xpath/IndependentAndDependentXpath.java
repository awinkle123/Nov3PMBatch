package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependentXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/s?k=one+plus+10&crid=3HGCE1HVJ4H7H&sprefix=one+plus+10%2Caps%2C331&ref=nb_sb_noss_2");
       WebElement price = driver.findElement(By.xpath("//span[text()='OnePlus 10R 5G (Sierra Black, 12GB RAM, 256GB Storage, 80W SuperVOOC)']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[text()='38,999']"));
         //we can use this xpath also but in real time it is not in use
       // WebElement price = driver.findElement(By.xpath("//span[text()='OnePlus 10R 5G (Sierra Black, 12GB RAM, 256GB Storage, 80W SuperVOOC)']/../../../..//span[text()='38,999']"));
       String actualPrice= price.getText();
       System.out.println(actualPrice);

	}

}
