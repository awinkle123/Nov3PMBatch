package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {
	@Test(groups = "smoke")
	public void login() {
		System.out.println("logged in successfully");
	}
	@Test(groups = "regression")
	public void search() {
		System.out.println("product found");
	}
	@Test(groups = "regression")
	public void select() {
		Assert.fail();
		System.out.println("product selected");
	}
	@Test(groups = "regression")
	public void addToCart() {
		System.out.println("product has been added to cart");
	}
	@Test(groups = "regression")
	public void payment() {
		System.out.println("payment made successfully");
	}
	@Test(groups = "smoke")
	public void logout() {
		System.out.println("logged out successfully");
	}


}
