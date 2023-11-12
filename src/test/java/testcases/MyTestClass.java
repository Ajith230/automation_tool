package testcases;

import org.testng.annotations.Test;

import actions.LoginActions;
import coretest.BaseTest;

public class MyTestClass extends BaseTest {
	@Test
    public void myTestMethod() {
        System.out.println("Hello, TestNG!");
//        LoginActions loginActions = new LoginActions(driver);
//        loginActions.loginAsUser1();
    }
}
