package test_package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import helper_package.LeankorBetaUninstallHelper;


public class TestLeankorBetaUninstall {
	
	LeankorBetaUninstallHelper leankorBetaUninstall = new LeankorBetaUninstallHelper();
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void SetUp()
	{
		leankorBetaUninstall.clickOnSetup();
		//softAssert.assertEquals(LeankorBetaUninstallHelper.salesForceHomePageTitle, leankorBetaUninstall.verifySalesforceHomePageAfterClickOnSetupLink());
		//softAssert.assertAll();
	}
	
	@Test
	public void RemovePermissionSets()
	{
		leankorBetaUninstall.expandManageUserDropDownIconAndClickOnPermissionSet();
		//softAssert.assertEquals(LeankorBetaUninstallHelper.visualLeanDesignerPageTitle, leankorBetaUninstall.verifyVisualLeanDesignerPageTitle());
		//softAssert.assertAll();
	}
	
	@Test
	public void DeactivateProcessBuilder()
	{
		leankorBetaUninstall.deactivateProcessBuilder();
	}
	
	@Test
	public void SwitchToLightningAndRemoveLeankorLogo()
	{
		leankorBetaUninstall.switchToSalesforceLightningExperience();
	}
	
	@Test
	public void LeankorBetaUninstall()
	{
		leankorBetaUninstall.uninstallingBeta();
	}
}