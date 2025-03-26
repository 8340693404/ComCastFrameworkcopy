package testng_basics;

import org.testng.annotations.Test;

public class Working_With_Groups1 {
    @Test(groups = "Smoke Test")
    public void LoginTest() {
        System.out.println("Executing login");

    }

    @Test(groups = "Smoke Test")
    public void RegisterTest() {
        System.out.println("Executing register");
    }

    @Test
    public void Search() {

        System.out.println("Executing search");
    }

}
