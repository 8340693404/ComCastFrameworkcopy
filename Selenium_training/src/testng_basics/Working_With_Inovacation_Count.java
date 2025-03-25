package testng_basics;

import org.testng.annotations.Test;

public class Working_With_Inovacation_Count {
	@Test(invocationCount=3)
	public void LoginTest() {
		System.out.println("login test1");
	}

}
