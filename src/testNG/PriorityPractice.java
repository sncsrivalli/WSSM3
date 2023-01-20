package testNG;

import org.testng.annotations.Test;

public class PriorityPractice {
	
	@Test(priority = 2)
	public void demo1() {
		System.out.println("demo1");
	}

	@Test(priority = -2)
	public void demo2() {
		System.out.println("demo2");
	}

	@Test(priority = -1)
	public void demo3() {
		System.out.println("demo3");
	}

	@Test(priority = 1)
	public void demo4() {
		System.out.println("demo4");
	}

	@Test
	public void demo5() {
		System.out.println("demo5");
	}

}
