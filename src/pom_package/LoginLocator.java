package pom_package;

import org.openqa.selenium.By;

public class LoginLocator {

	public static final By userName() {
		return By.id("username");
	}

	public static final By password() {
		return By.id("password");
	}

	public static final By loginButton() {
		return By.id("Login");
	}
}