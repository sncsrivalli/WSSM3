package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	//Add TestNG library
	//Import @Test from org.testng.annotations
	@Test
	public void demo() {
		//Import Reporter from org.testng
		Reporter.log("Hello World",true);
	}

}
