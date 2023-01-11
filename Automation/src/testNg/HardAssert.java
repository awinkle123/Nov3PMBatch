package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void demo() {
		String expectedData = "abc";
		String actualData = "abc";
		Assert.assertEquals(actualData, expectedData);
		System.out.println("Pass");
	}

}
