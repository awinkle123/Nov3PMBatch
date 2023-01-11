package testNg;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 3)
	public void ademo1() {
		System.out.println("Demo Test a");
	}
		@Test(priority = 2)
		public void Ademo2() {
			System.out.println("Demo Test A");
			
	}
		@Test(priority = 4)
		public void Bdemo() {
			System.out.println("Demo Test B");
			
	}
		@Test(priority = 1)
		public void bdemo() {
			System.out.println("Demo Test b");
			
	}
}
