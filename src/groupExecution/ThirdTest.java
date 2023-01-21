package groupExecution;

import org.testng.annotations.Test;

public class ThirdTest {
	

	@Test(groups = "Smoke")
	public void test0() {
		System.out.println("test0");
	}

	@Test(groups = "Sanity")
	public void test1() {
		System.out.println("test1");
	}

	@Test(groups = {"Smoke","Sanity","Regression"})
	public void test2() {
		System.out.println("test2");
	}

}
