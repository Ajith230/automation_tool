package coretest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import actions.LoginActions;
import core.DriverFactory;

public class BaseTest {
	protected WebDriver driver;
    
    @BeforeMethod
    public void setUp() {
        // Initialize WebDriver using DriverFactory
        driver  = DriverFactory.getDriver(DriverFactory.Browser.CHROME);

        // Initialize the home page

        // Navigate to the home page or perform other setup steps
        driver.get("https://practicetestautomation.com/practice-test-login");
    }

    @Test
    public void myTestMethod() {
        
        // Your test logic goes here
        LoginActions loginaction = new LoginActions(driver);
        
        loginaction.loginAsUser_student();
    
    }

    @AfterMethod
    public void tearDown() {
        // Quit WebDriver using DriverFactory
        DriverFactory.quitDriver();
    }
}
