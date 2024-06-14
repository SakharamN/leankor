package test_package;

import org.testng.annotations.Test;

import helper_package.LeankorBetaInstallHelper;

public class TestLeankorBetaInstall {

	LeankorBetaInstallHelper leankorBetaInstall = new LeankorBetaInstallHelper();
	
	@Test
	public void LeankorBetaInstall()
	{
		leankorBetaInstall.leankorBetaInstallURL();
	}
}