package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(priority = 1)
	public void login() {
		System.out.println("logged in successfully");
	}
	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("product found");
	}
	@Test(dependsOnMethods = "search")
	public void select() {
		Assert.fail();
		System.out.println("product selected");
	}
	@Test(dependsOnMethods = "select")
	public void addToCart() {
		System.out.println("product has been added to cart");
	}
	@Test(dependsOnMethods = "addToCart")
	public void payment() {
		System.out.println("payment successfully");
	}
	@Test(dependsOnMethods = "payment")
	public void logout() {
		System.out.println("logged out successfully");
	}

}
