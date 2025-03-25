package testng_basics;

import org.testng.annotations.Test;

public class Working_With_Priority {
	
	@Test(priority = 2)
	public void LoginTest() {
		System.out.println("login test");
	}
	@Test(priority = 3)
	public  void SearchTest()
	{
		System.out.println("search test");
	}
	@Test(priority = 1)
	public void RegisterTest()
	{
		System.out.println("register test");
	}
	@Test(priority = 4)
	public void SubscribeTest()
	{
		System.out.println("subscribe test");
	}

}
