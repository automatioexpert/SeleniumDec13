package BASE;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	
	@BeforeMethod
	public void setUp() {
		System.err.println("/n");
		System.out.println("New line");
	}

	@AfterMethod
	public void tearDown() {
		
	}
}
