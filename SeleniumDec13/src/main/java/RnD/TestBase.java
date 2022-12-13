package RnD;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase extends Parent1{

	@BeforeSuite
	public void setUp() {
		System.out.println("Running BeforeSuite");

	}

	@AfterSuite
	public void tearDown() {
		System.out.println("Running AfterSuite");
	}

}
