package test_package;

import org.testng.annotations.Test;

import helper_package.LoginHelper;

public class TestLoginFunction {

	LoginHelper loginH = new LoginHelper();

	@Test
	public void loginTest() {
		loginH.user_Name();
		loginH.password_Field();
		loginH.Login_button();
	}

}