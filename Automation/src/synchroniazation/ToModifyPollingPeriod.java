package synchroniazation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ToModifyPollingPeriod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F%3Cuser-name%3E%2F%3Crepo-name%3E%2Ffiles%2Fdisambiguate&source=header-repo&source_repo=PipedreamHQ%2Fpipedream");
		driver.findElement(By.id("email")).sendKeys("akashdeb@gmail.com");
		
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),  'Continue')] "));
		
		FluentWait wait= new FluentWait(driver);
		
		wait.pollingEvery(100, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();

	}

}
