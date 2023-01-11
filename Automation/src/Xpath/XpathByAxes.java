package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=i+phone+11+64bg+white&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_17_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_17_na_na_na&as-pos=2&as-type=RECENT&suggestionId=i+phone+11+64bg+white%7CMobiles&requestId=a093acf6-2f20-4f53-aa9d-0783ff5b8550&as-searchtext=i%20phone%2011%20white%20");
       WebElement price = driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹39,999']"));
       String actualPrice= price.getText();
       System.out.println(actualPrice);


	}

}
