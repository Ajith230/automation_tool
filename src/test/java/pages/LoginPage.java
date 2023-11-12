package pages;

import org.openqa.selenium.WebDriver;

import Locators.LoginPageLocator;
import core.WebMethods;

public class LoginPage implements LoginPageLocator {
	private WebMethods driver;
	public LoginPage(WebDriver driver) {
		this.driver = new WebMethods(driver);
	}
	
	public LoginPage enterUserName(String username) {
		driver.enterText(USERNAME, username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		driver.enterText(PASSWORD, password);
		return this;
	}
	
	public void clickLoginButton() {
		driver.click(LOGIN_BUTTON);
	}

	public void verifyLogin() {
		
	}
}
