package BasicTestScript;

import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class DemoTestScriptTest2 extends BaseClass {
	@Test(priority = 2)
	public void verifyCustomer() {
	System.out.println("customer has been verified");
	}
}
