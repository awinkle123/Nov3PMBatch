package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F%3Cuser-name%3E%2F%3Crepo-name%3E%2Ffiles%2Fdisambiguate&source=header-repo&source_repo=PipedreamHQ%2Fpipedream");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("akashdeb@gmail.com");
		Thread.sleep(2000);

	boolean enable = driver.findElement(By.xpath("//button[contains(text(), 'Continue')]")).isEnabled();
	

	if(enable) 
	{
		System.out.println("Pass: The button is enabled");
	}
	
	else
		System.out.println("Fail: The button is not enabled");
	
	
	
	
}
}