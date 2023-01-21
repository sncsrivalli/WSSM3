package batchExecution;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SecondTest {

	@Test
	public void demo() {
		Reporter.log("SecondTest",true);
		Assert.fail();
	}

}
