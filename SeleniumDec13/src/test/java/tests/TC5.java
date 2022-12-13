package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC5 {

	@Test(priority = 0)
	public void tc1() {
		System.out.println("tc1");
		Assert.assertTrue(false);

	}
	@Test(priority = 1,dependsOnMethods = "tc1")
	public void tc2() {
		System.out.println("tc2");

	}
	
}
