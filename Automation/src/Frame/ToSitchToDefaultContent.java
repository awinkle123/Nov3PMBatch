package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToSitchToDefaultContent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		
	    WebElement frameToSwitch = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameToSwitch);
		WebElement box = driver.findElement(By.id("draggable"));
	    Actions action = new Actions(driver);
			
		action.dragAndDropBy(box, 50, 50).perform();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("API documentation")).click();
		}

}
