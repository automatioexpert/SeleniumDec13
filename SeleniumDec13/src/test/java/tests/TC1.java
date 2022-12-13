package tests;

import org.testng.annotations.Test;

import RnD.TestBase;
import utils.printName;

public class TC1 extends TestBase {

	@Test
	public void tc1() {
		System.out.println("tc1 executed");

		TC1 t = new TC1();
		System.out.println(t.parent1VariableName);
		System.out.println(t.parent2VariableName);
		t.setUp();
		int sum = printName.sum(10, 90);
		System.out.println("Total sum is : " + sum);
		System.out.println("Multiplied value :"+printName.multiply(10, 100));
	}
}
