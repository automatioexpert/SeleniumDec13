package tests;

import org.testng.annotations.Test;

public class TC4 {

	@Test(priority = 0)
	public void t1() {
		System.out.println("T1 executed");
	}
	
	@Test(priority = 1,dependsOnMethods = "t1")
	public void t2() {
		System.out.println("T2 executed");
	}
}
