package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WhyAssertion {
	
	@Test
	public void demo() {
		String s1 = "Hi";
		String s2 = "Hello";
		
//		if(s1.equals(s2))
//			System.out.println("Pass");
//		else
//			System.out.println("Fail");
		
		Assert.assertEquals(s1, s2);
	}

}
