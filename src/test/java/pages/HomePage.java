package pages;

import org.openqa.selenium.WebDriver;

import Locators.HomePageLocator;
import core.BasePage;
import core.WebMethods;

public class HomePage extends BasePage implements HomePageLocator {
	private WebMethods driver;
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = new WebMethods(driver);
	}
	
	public void enterUserName(String username) {
		driver.enterText(USERNAME, username);
	}
	
	public void enterPassword(String password) {
		driver.enterText(PASSWORD, password);
	}
	
	public void clickLoginButton() {
		driver.click(LOGIN_BUTTON);
	}
}
