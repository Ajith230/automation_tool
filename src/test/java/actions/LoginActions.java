package actions;

import org.openqa.selenium.WebDriver;

import pages.LoginPage;

public class LoginActions {
	LoginPage lginPage;
	
	public LoginActions(WebDriver driver) {
		this.lginPage= new LoginPage(driver);
		
	}
		
	
	public void loginAsUser_student() {
		lginPage.enterUserName("student")
				.enterPassword("Password123")
				.clickLoginButton();
		
	}
	
	public void login_invalid() {
		lginPage.enterUserName("invalid");
		lginPage.enterPassword("password");
	}
	
		
}

