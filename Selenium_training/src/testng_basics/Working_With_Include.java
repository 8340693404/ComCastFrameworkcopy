package testng_basics;

import org.testng.annotations.Test;

public class Working_With_Include {
	@Test
	public void LoginTest()
	{
		System.out.println("Executing login");
		
	}
	@Test
	public void RegisterTest()
	{
		System.out.println("Executing register");
	}
	
	@Test
	public void Search() {
		
		System.out.println("Executing search");
	}

}



