package testng_basics;

import org.testng.annotations.Test;

public class Working_With_Groups2 {
	@Test
	public void subscribe()
	{
		
		System.out.println("Executing subscribe");
	}
	@Test(groups="Smoke Test")
	public void AddCart()
	{
		System.out.println("Executing to cart");
	}

}
