package helper_package;

import common_package.CommonMethodsOfWebDriver;
import pom_package.LoginLocator;

public class LoginHelper extends CommonMethodsOfWebDriver {

	public void user_Name() {
		findElement(LoginLocator.userName());
	}

	public void password_Field() {
		findElement(LoginLocator.password());
	}

	public void Login_button() {
		findElement(LoginLocator.loginButton());
	}
}