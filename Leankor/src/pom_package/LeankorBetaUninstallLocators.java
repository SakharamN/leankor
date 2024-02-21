package pom_package;

import org.openqa.selenium.By;

public class LeankorBetaUninstallLocators {
	
	
	public static final By setUp()
	{
		return By.linkText("Setup");
	}
	
	public static final By expandManageUserDropDown()
	{
		return By.id("Users_icon");
	}
	
	public static final By selectPermissionSetUnderManageUsers()
	{
		return By.linkText("Permission Sets");
	}
	
	public static final By clickOnVUnderPermissionSet()
	{
		return By.xpath("//span[text()='V']");
	}
	
	public static final By selectVisualLeanDesigner()
	{
		return By.linkText("Visual Lean Designer");
	}
	
	public static final By manageAssignmentButton()
	{
		return By.id("page:console:pc_form:button_manage_assignments");
	}
	
	public static final By allBoxexActionCheckBox()
	{
		return By.id("allBox");
	}
	
	public static final By removeAssignmenButton()
	{
		return By.id("manage_user_remove_btn");
	}
	
	public static final By clickOnDoneButtonAfterRemoveAssignment()
	{
		return By.id("done_btn");
	}
	
	public static final By quickFindAndSearchInputField()
	{
		return By.id("setupSearch");
	}
	
	public static final By clickOnProcessBuilder()
	{
		return By.linkText("Process Builder");
	}
	
	public static final By leankorEmailNotificationFromCalenderViewDownArrow()
	{
		return By.xpath("//table//tbody/tr[1]/td/a/div");
	}
	
	public static final By deactivateValueForCalenderView()
	{
		return By.linkText("Deactivate");
	}
	
	public static final By clickOnConfirmButtonForCalenderView()
	{
		return By.xpath("//span[text()='Confirm']");
	}
	
	public static final By leankorEmailNotificationFromGanttDownArrow()
	{
		return By.xpath("//table//tbody/tr[2]/td/a/div");
	}
	
	public static final By deactivateValueFromGantt()
	{
		return By.linkText("Deactivate");
	}
	
	public static final By clickOnConfirmButtonForGantt()
	{
		return By.xpath("//span[text()='Confirm']");
	}
	
	public static final By backToSetUp()
	{
		return By.linkText("Back To Setup");
	}
	
	public static final By switchToLightningExperience()
	{
		return By.linkText("Switch to Lightning Experience");
	}
	
	public static final By clickOnSetUpGearIconOnLightningPage()
	{
		return By.xpath("//div[@class='slds-global-header slds-grid slds-grid--align-spread']/span/ul/li[6]");
	}
	
	public static final By clickOnSetUpUnderGearIcon()
	{
		//return By.id("related_setup_app_home");
		//return By.xpath("//div[@class='popupTargetContainer menu--nubbin-top uiPopupTarget uiMenuList uiMenuList--right uiMenuList--default']/div/ul/li[@id='all_setup_home']");
		//slds-dropdown__item related-app uiMenuItem onesetupSetupMenuItem (//li tag class attribute value)
		//return By.xpath("//div[@class='popupTargetContainer menu--nubbin-top uiPopupTarget uiMenuList uiMenuList--right uiMenuList--default visible positioned']/div/ul/li[@id='related_setup_app_home']");
		//return By.xpath("//li[@id='all_setup_home']");
		return By.xpath("//div[@class='popupTargetContainer menu--nubbin-top uiPopupTarget uiMenuList uiMenuList--right uiMenuList--default visible positioned']/div/ul/li[@role='presentation']");
	}
	
	public static final By clickOnQuickFindSearchInputField()
	{
		return By.xpath("//input[@placeholder='Quick Find']");
	}
	
	public static final By selectAppManager()
	{
		return By.xpath("//mark[text()='App Manager']");
	}
	
	public static final By clickOnLastModifiedDate()
	{
		return By.xpath("//th[@title='Last Modified Date']/div/a");
	}
	
	public static final By clickOnLeankorDropDownOptionUnderAppManager()
	{
		return By.xpath("//table/tbody/tr[2]/td[7]//a");
	}
	
	public static final By clickOnEditOptionLeankorOption()
	{
		return By.xpath("//a[@title='Edit']");
	}
	
	public static final By resetToDefaultIFrameValue()
	{
		return By.xpath("//iframe[@allow='geolocation *; microphone *; camera *']");
		//return By.tagName("iframe");
	}
	
	public static final By scrollToFrameBox()
	{
		return By.xpath("//table[@bgcolor='#000000']");
	}
	
	public static final By resetLeankorLogo()
	{
		return By.xpath("//input[@title='Reset to Default']");
	}
	
	public static final By leankorSaveButton()
	{
		return By.xpath("//input[@value=' Save ']");
	}
	
	public static final By clickOnLeankorAppDropDownOptionUnderAppManager()
	{
		return By.xpath("//table/tbody/tr[1]/td[7]//a");
	}
	
	public static final By clickOnEditOptionLeankorAppOption()
	{
		return By.xpath("//a[@title='Edit']");
	}
	
	public static final By clearLeankorLogo()
	{
		return By.xpath("//button[text()='Clear']");
	}
	
	public static final By clickOnSaveButton()
	{
		return By.xpath("//button[text()='Save']");
	}
	
	public static final By clickOnBack()
	{
		return By.xpath("//a[@class='headerItem headerLink setupLink noDecoration slds-border_left']");
	}
	
	public static final By clickOnAppLauncherButton()
	{
		return By.xpath("//button[@data-aura-class='uiButton forceHeaderButton salesforceIdentityAppLauncherHeader']");
	}
	
	public static final By appLauncherSearchField()
	{
		return By.xpath("//input[@placeholder='Search apps or items...']");
	}
	
	public static final By clickOnFiles()
	{
		return By.xpath("//a[@ title='Files']");
	}
	
	public static final By dropDownUnderFiles()
	{
		return By.xpath("//a[@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger']");
	}
	
	public static final By selectDeleteOptionUnderDropdown()
	{
		return By.xpath("//div[@style='top: 87px; opacity: 1; position: absolute; left: 1174px;']/div/ul/li[7]/a[@title='Delete']");
	}
	
	public static final By deleteButton()
	{
		return By.xpath("//span[text()='Delete']");
	}
	
	public static final By viewProfileIcon()
	{
		//return By.xpath("//div[@class='slds-global-header slds-grid slds-grid--align-spread']/span/ul/li[9]");
		//return By.xpath("//div[@class='slds-global-header slds-grid slds-grid--align-spread']/span/ul/li[8]");	//new
		return By.xpath("//div[@class='slds-global-header slds-grid slds-grid--align-spread']/span/ul//button[contains(@class,'bare branding-userProfile-button')]");	//new
	}
	
	public static final By switchToSalesforceClassic()
	{
		return  By.xpath("//a[text()='Switch to Salesforce Classic']");
	}
	
	public static final By clickOnInstalledPackages()
	{
		return By.linkText("Installed Packages");
	}
	
	public static final By clickOnLeankorLink()
	{
		return By.xpath("//th[@class=' dataCell  ']//a[text()='Leankor']");
	}
	
	public static final By clickOnUninstallButtonLeankorManaged()
	{
		return By.xpath("//input[@value='Uninstall']");
	}
	
	public static final By doNotHaveCopyRadioButton()
	{
		return By.xpath("//table/tbody/tr[2]//input[@name='dataExport']");
	}
	
	public static final By yesCheckBox()
	{
		return By.xpath("//input[@onclick='enableUninstallButton();']");
	}
	
	public static final By clickOnFinalUninstallButton()
	{
		return By.id("Uninstall");
	}
}