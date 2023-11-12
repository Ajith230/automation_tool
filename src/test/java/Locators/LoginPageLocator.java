package Locators;

import core.WebLocator;

public interface LoginPageLocator {

	WebLocator LOGIN_BUTTON = new WebLocator("login Button",WebLocator.LocatorType.ID,
			"submit");
	WebLocator USERNAME = new WebLocator("username", WebLocator.LocatorType.ID,
			"username");
	WebLocator PASSWORD = new WebLocator("password",WebLocator.LocatorType.ID,
			"password");
}
