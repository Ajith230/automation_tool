package core;

import org.openqa.selenium.By;




//WebLocator class
public class WebLocator {
	 private String name;
	 private LocatorType locatorType;
	 private String locatorValue;
	
	 public enum LocatorType {
		 ID, NAME, CLASS_NAME, XPATH, CSS_SELECTOR, LINK_TEXT, PARTIAL_LINK_TEXT, TAG_NAME
		}
	 // Constructor
	 public WebLocator(String name, LocatorType locatorType, String locatorValue) {
	     this.name = name;
	     this.locatorType = locatorType;
	     this.locatorValue = locatorValue;
	 }
	
	 // Getters
	 public String getName() {
	     return name;
	 }
	
	 public LocatorType getLocatorType() {
	     return locatorType;
	 }
	
	 public String getLocatorValue() {
	     return locatorValue;
	 }
	
	 // Method to convert WebLocator to Selenium By object
	 public By toBy() {
	     By by = null;
	     switch (locatorType) {
	         case ID:
	             by = By.id(locatorValue);
	             break;
	         case NAME:
	             by = By.name(locatorValue);
	             break;
	         case CLASS_NAME:
	             by = By.className(locatorValue);
	             break;
	         case XPATH:
	             by = By.xpath(locatorValue);
	             break;
	         case CSS_SELECTOR:
	             by = By.cssSelector(locatorValue);
	             break;
	         case LINK_TEXT:
	             by = By.linkText(locatorValue);
	             break;
	         case PARTIAL_LINK_TEXT:
	             by = By.partialLinkText(locatorValue);
	             break;
	         case TAG_NAME:
	             by = By.tagName(locatorValue);
	             break;
	         // Add more cases as needed for other locator types
	         default:
	             throw new IllegalArgumentException("Unsupported locator type: " + locatorType);
	     }
	     return by;
	 }
}

 