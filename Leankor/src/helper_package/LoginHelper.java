package helper_package;

import common_package.CommonMethodsOfWebDriver;
import pom_package.LoginLocator;

public class LoginHelper extends CommonMethodsOfWebDriver {
	
	public void user_Name()
	{
		findElement(LoginLocator.userName()).sendKeys("pratish.laad@aplitetech.com.qa6");
	}
	
	public void password_Field()
	{
		findElement(LoginLocator.password()).sendKeys("kanban21");
	}
	
	public void Login_button()
	{
		findElement(LoginLocator.loginButton()).click();
	}
}