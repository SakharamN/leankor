package test_package;

import org.testng.annotations.Test;
import helper_package.LoginHelper;

public class TestLoginFunction {

	LoginHelper loginH = new LoginHelper();
	
	@Test
	public void UserName()
	{
		loginH.user_Name();
	}
	
	@Test
	public void Password()
	{
		loginH.password_Field();
	}
	
	@Test
	public void LoginButton()
	{
		loginH.Login_button();
	}
}