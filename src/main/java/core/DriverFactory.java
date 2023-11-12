package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<WebDriver>();

    private DriverFactory() {
        // Private constructor to prevent instantiation
    }

    // Enum for supported browsers
    public enum Browser {
        CHROME, FIREFOX
        // Add more browsers as needed
    }

    // Method to get the WebDriver instance for the specified browser
    public static WebDriver getDriver(Browser browser) {
        if (driverThreadLocal.get() == null) {
            switch (browser) {
                case CHROME:
                	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\Desktop\\framework\\framework\\src\\main\\resources\\chromedriver.exe");
                    driverThreadLocal.set(new ChromeDriver());
                    break;
                case FIREFOX:
//                    System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    // Set additional Firefox options if needed
                    driverThreadLocal.set(new FirefoxDriver(firefoxOptions));
                    break;
                // Add cases for other browsers
                default:
                    throw new IllegalArgumentException("Unsupported browser: " + browser);
            }
        }
        return driverThreadLocal.get();
    }

    // Method to quit the WebDriver instance
    public static void quitDriver() {
        if (driverThreadLocal.get() != null) {
            driverThreadLocal.get().quit();
            driverThreadLocal.remove();
        }
    }
}

