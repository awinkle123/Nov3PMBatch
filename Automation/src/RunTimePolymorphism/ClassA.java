package RunTimePolymorphism;

import org.openqa.selenium.WebDriver;

public class ClassA {

	public static void test(WebDriver driver, String url, String expectedTitle) {
		driver.manage().window().maximize();
		driver.get(url);
		String actualTitle= driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("pass:the title is verified");
		
		}
		else
			System.out.println("fail:the title is not verified");
		driver.quit();

	}

}
