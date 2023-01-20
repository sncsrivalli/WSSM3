package testNG;

import org.testng.annotations.Test;

public class PriorityInvocationCountPractice {
	
	@Test(invocationCount = 2, priority = 3)
	public void demo1() {
		System.out.println("demo1");
	}

	@Test(invocationCount = 3, priority = -1)
	public void demo2() {
		System.out.println("demo2");
	}

	@Test(invocationCount = 0, priority = 1)
	public void demo3() {
		System.out.println("demo3");
	}

	@Test(invocationCount = 2, priority = -2)
	public void demo4() {
		System.out.println("demo4");
	}

	@Test(priority = 1)
	public void demo5() {
		System.out.println("demo5");
	}

}
