package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTitle {

	public static void main(String[] args) {
		String expectedTitle = "Google";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String actualTitle = driver.getTitle();
		System.out.println("the actual title is:"+actualTitle );
		System.out.println("the expected title is:"+expectedTitle );
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("pass:the title has been verified");
		}
		else
			System.out.println("fail:the title has not been verified");

	}

}
