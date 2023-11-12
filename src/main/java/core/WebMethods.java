package core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebMethods {
    private WebDriver driver;

    public WebMethods(WebDriver driver) {
        this.driver = driver;
    }
    //get webelement
    private WebElement getElement(WebLocator webLocator) {
    	WebElement element = driver.findElement(webLocator.toBy());
    	return element;
    }
    // Method to click on a web element using WebLocator
    public void click(WebLocator webLocator) {
        getElement(webLocator).click();
     
    }

    // Method to enter text into an input field using WebLocator
    public void enterText(WebLocator webLocator, String text) {
        WebElement element = getElement(webLocator);
        element.clear();
        element.sendKeys(text);
    }
}
