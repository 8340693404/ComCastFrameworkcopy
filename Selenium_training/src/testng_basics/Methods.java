package testng_basics;

import org.testng.annotations.Test;

public class Methods {
    @Test(dependsOnMethods = "RegisterTest")
    public void LoginTest() {
        System.out.println("login test1");
    }

    @Test
    public void SearchTest() {
        System.out.println("search test1");
    }

    @Test
    public void RegisterTest() {
        System.out.println("register test1");
    }

    @Test(dependsOnMethods = "SearchTest")
    public void SubscribeTest() {
        System.out.println("subscribe test1");
    }

}



