package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyUrl {

	public static void main(String[] args) {
		String expectedURL = "facebook";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualURL = driver.getCurrentUrl();
		System.out.println("the actual URL is:"+actualURL );
		System.out.println("the expected URL is:"+expectedURL );
		if(actualURL.contains(expectedURL)) {
			System.out.println("pass:the URL has been verified");
		}
		else
			System.out.println("fail:the URL has not been verified");

	}


	}


