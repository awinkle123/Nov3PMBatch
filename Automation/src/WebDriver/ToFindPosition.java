package WebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Point position= driver.manage().window().getPosition();
		System.out.println(position);
		int StartX= position.getX();
		int StartY= position.getY();
		System.out.println("the start x is:"+ StartX);
		System.out.println("the start Y is:"+ StartY);
		// TODO Auto-generated method stub

	}

}
