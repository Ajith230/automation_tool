package actions;

import org.openqa.selenium.WebDriver;

import pages.HomePage;

public class HomeActions {
	HomePage homepage;
	
	public HomeActions(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.homepage= new HomePage(driver);
		
	}
		
	
	public void loginAsUser1() {
		homepage.enterUserName("user1");
		homepage.enterPassword("pass");
		homepage.clickLoginButton();
	}
	
		
}

