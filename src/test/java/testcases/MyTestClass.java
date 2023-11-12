package testcases;

import org.testng.annotations.Test;

import actions.HomeActions;
import coretest.BaseTest;

public class MyTestClass extends BaseTest {
	@Test
    public void myTestMethod() {
        System.out.println("Hello, TestNG!");
        // Your test logic goes here
        HomeActions homepage = new HomeActions(driver);
        
        homepage.loginAsUser1();
        
        
    }
}
