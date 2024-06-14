package helper_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_package.CommonMethodsOfWebDriver;
import pom_package.LeankorBetaUninstallLocators;

public class LeankorBetaUninstallHelper extends CommonMethodsOfWebDriver {

	public static String salesForceHomePageTitle = "Home Page ~ Salesforce - Enterprise Edition";
	public static String visualLeanDesignerPageTitle = "Assigned Users : Visual Lean Designer ~ Salesforce - Enterprise Edition";
	Alert alert;
	
	public void clickOnSetup()
	{
		try {Thread.sleep(20000);}catch(InterruptedException ie) {}
		
		String getTitleUsingWebDriver = driver.getTitle();
		System.out.println("line 23 click on setup method : "+getTitleUsingWebDriver);
		
		
		if(getTitleUsingWebDriver.equals("Home | Salesforce") || getTitleUsingWebDriver.equals("Leankor | Salesforce") || driver.getTitle().equals("Lightning Experience | Salesforce") || driver.getTitle().equals("Lightning Experience"))	//for lightning experience
		{
			try {Thread.sleep(7000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.viewProfileIcon()));
			findElement(LeankorBetaUninstallLocators.viewProfileIcon()).click();
			
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.switchToSalesforceClassic()));
			findElement(LeankorBetaUninstallLocators.switchToSalesforceClassic()).click();
			
			explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.setUp()));
			findElement(LeankorBetaUninstallLocators.setUp()).click();
		}
		else
		{
			explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.setUp()));
			findElement(LeankorBetaUninstallLocators.setUp()).click();
		}
	}
	
	public String verifySalesforceHomePageAfterClickOnSetupLink()
	{
		return driver.getTitle();
	}
	
	public void expandManageUserDropDownIconAndClickOnPermissionSet()
	{
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.expandManageUserDropDown()));
		findElement(LeankorBetaUninstallLocators.expandManageUserDropDown()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.selectPermissionSetUnderManageUsers()));
		findElement(LeankorBetaUninstallLocators.selectPermissionSetUnderManageUsers()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnVUnderPermissionSet()));
		findElement(LeankorBetaUninstallLocators.clickOnVUnderPermissionSet()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.selectVisualLeanDesigner()));
		findElement(LeankorBetaUninstallLocators.selectVisualLeanDesigner()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.manageAssignmentButton()));
		findElement(LeankorBetaUninstallLocators.manageAssignmentButton()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.allBoxexActionCheckBox()));
		findElement(LeankorBetaUninstallLocators.allBoxexActionCheckBox()).click();
		
		int sizeOfElementRemoveAssignmentButton = driver.findElements(LeankorBetaUninstallLocators.removeAssignmenButton()).size();
		System.out.println("size of remove assignment button ::: Line 75 ::: "+sizeOfElementRemoveAssignmentButton +" after substraction ::: "+(sizeOfElementRemoveAssignmentButton-2));
		driver.findElements(LeankorBetaUninstallLocators.removeAssignmenButton()).get(sizeOfElementRemoveAssignmentButton-2).click();
		
		alert = driver.switchTo().alert();
		alert.accept();
		
		int sizeOfDoneButton = driver.findElements(LeankorBetaUninstallLocators.clickOnDoneButtonAfterRemoveAssignment()).size();
		System.out.println("size of DONE button ::: Line 82 ::: "+sizeOfDoneButton +" after substraction ::: "+(sizeOfDoneButton-2));
		driver.findElements(LeankorBetaUninstallLocators.clickOnDoneButtonAfterRemoveAssignment()).get(sizeOfDoneButton-2).click();
	}
	
	public String verifyVisualLeanDesignerPageTitle()
	{
		return driver.getTitle();
	}
	
	public void deactivateProcessBuilder()
	{
		explicitWaitElementToBeLocated(LeankorBetaUninstallLocators.quickFindAndSearchInputField());
		findElement((LeankorBetaUninstallLocators.quickFindAndSearchInputField())).click();
		findElement((LeankorBetaUninstallLocators.quickFindAndSearchInputField())).sendKeys("process builder");
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnProcessBuilder()));
		findElement(LeankorBetaUninstallLocators.clickOnProcessBuilder()).click();
				
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.leankorEmailNotificationFromCalenderViewDownArrow()));
		findElement(LeankorBetaUninstallLocators.leankorEmailNotificationFromCalenderViewDownArrow()).click();
				
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.deactivateValueForCalenderView()));
		findElement(LeankorBetaUninstallLocators.deactivateValueForCalenderView()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnConfirmButtonForCalenderView()));
		findElement(LeankorBetaUninstallLocators.clickOnConfirmButtonForCalenderView()).click();
				
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.leankorEmailNotificationFromGanttDownArrow()));
		findElement(LeankorBetaUninstallLocators.leankorEmailNotificationFromGanttDownArrow()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.deactivateValueFromGantt()));
		findElement(LeankorBetaUninstallLocators.deactivateValueFromGantt()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnConfirmButtonForGantt()));
		findElement(LeankorBetaUninstallLocators.clickOnConfirmButtonForGantt()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.backToSetUp()));
		findElement(LeankorBetaUninstallLocators.backToSetUp()).click();
	}
	
	public void switchToSalesforceLightningExperience()
	{
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.switchToLightningExperience()));
		findElement(LeankorBetaUninstallLocators.switchToLightningExperience()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnSetUpGearIconOnLightningPage()));
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		findElement(LeankorBetaUninstallLocators.clickOnSetUpGearIconOnLightningPage()).click();
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		//explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnSetUpUnderGearIcon()));
		
		//New implemented script
		WebDriverWait explicitWait = new WebDriverWait(driver,100);
		explicitWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(LeankorBetaUninstallLocators.clickOnSetUpUnderGearIcon())));
		
		int sizeOfAllElementsOfSetup = driver.findElements(LeankorBetaUninstallLocators.clickOnSetUpUnderGearIcon()).size();
		System.out.println("Under setup gear icon all visible element size :::Line 139::: ---: "+sizeOfAllElementsOfSetup);
		
		if(sizeOfAllElementsOfSetup==3)
		{
			driver.findElements(LeankorBetaUninstallLocators.clickOnSetUpUnderGearIcon()).get(sizeOfAllElementsOfSetup-3).click();
		}
		else if(sizeOfAllElementsOfSetup==4)
		{
			driver.findElements(LeankorBetaUninstallLocators.clickOnSetUpUnderGearIcon()).get(sizeOfAllElementsOfSetup-4).click();
		}
		
		//findElement(LeankorBetaUninstallLocators.clickOnSetUpUnderGearIcon()).click();
		
		/*String getWindowHandleValueForSetupHomePage = driver.getWindowHandle();
		driver.switchTo().window(getWindowHandleValueForSetupHomePage);*/
		
		for(String windowHandleValue : driver.getWindowHandles())
		{
			driver.switchTo().window(windowHandleValue);
		}
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(LeankorBetaUninstallLocators.clickOnQuickFindSearchInputField()));
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		findElement(LeankorBetaUninstallLocators.clickOnQuickFindSearchInputField()).click();
		findElement(LeankorBetaUninstallLocators.clickOnQuickFindSearchInputField()).sendKeys("app manager");
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.selectAppManager()));
		findElement(LeankorBetaUninstallLocators.selectAppManager()).click();
		
		try {Thread.sleep(6000);}catch(InterruptedException ie) {}
		
		/*Actions actions = new Actions(driver);
		actions.sendKeys(Keys.F11).build().perform();*/
		
		//Click on F11 for full screen view
		/*try 
		{
			Robot robot = new Robot();
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			robot.keyPress(KeyEvent.VK_F11);
			robot.keyRelease(KeyEvent.VK_F11);
		}
		catch (AWTException e){}*/
		
		boolean existance = findElement(LeankorBetaUninstallLocators.clickOnLastModifiedDate()).isDisplayed();
		System.out.println("Existance : "+existance);
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnLastModifiedDate()));
		findElement(LeankorBetaUninstallLocators.clickOnLastModifiedDate()).click();
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnLeankorAppDropDownOptionUnderAppManager()));
		findElement(LeankorBetaUninstallLocators.clickOnLeankorAppDropDownOptionUnderAppManager()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnEditOptionLeankorAppOption()));
		findElement(LeankorBetaUninstallLocators.clickOnEditOptionLeankorAppOption()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clearLeankorLogo()));
		findElement(LeankorBetaUninstallLocators.clearLeankorLogo()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnSaveButton()));
		findElement(LeankorBetaUninstallLocators.clickOnSaveButton()).click();
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnBack()));
		findElement(LeankorBetaUninstallLocators.clickOnBack()).click();
		
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnLeankorDropDownOptionUnderAppManager()));
		findElement(LeankorBetaUninstallLocators.clickOnLeankorDropDownOptionUnderAppManager()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnEditOptionLeankorOption()));
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(LeankorBetaUninstallLocators.clickOnEditOptionLeankorOption()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		boolean visibilityOfiFrame = findElement(LeankorBetaUninstallLocators.resetToDefaultIFrameValue()).isDisplayed();
		System.out.println("Iframe visibilty line 223 : "+visibilityOfiFrame);
		
		/*String getIdOfiFrame = findElement(LeankorBetaUninstallLocators.resetToDefaultIFrameValue()).getAttribute("id");
		System.out.println("Id value of iframe under leankor tab line 226 : "+getIdOfiFrame);*/
		
		//driver.switchTo().frame(getIdOfiFrame); //inspect frame by its id value and pass string to
		
		driver.switchTo().frame(findElement(LeankorBetaUninstallLocators.resetToDefaultIFrameValue()));
		
		scrollinToView(findElement(LeankorBetaUninstallLocators.resetLeankorLogo())); 	//new line added
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.resetLeankorLogo()));
		findElement(LeankorBetaUninstallLocators.resetLeankorLogo()).click();
		
		int saveButtonSize = driver.findElements(LeankorBetaUninstallLocators.leankorSaveButton()).size();
		System.out.println("Line 238 save button size in Leankor tab : "+saveButtonSize +" after substraction : "+(saveButtonSize-2));
		driver.findElements(LeankorBetaUninstallLocators.leankorSaveButton()).get(saveButtonSize-2).click();
				
		//scrollToView(findElement(LeankorBetaUninstallLocators.clickOnLeankorAppDropDownOptionUnderAppManager()));
		
		/*try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnAppLauncherButton()));
		findElement(LeankorBetaUninstallLocators.clickOnAppLauncherButton()).click();
		
		explicitWaitVisibilityOf(findElement(LeankorBetaUninstallLocators.appLauncherSearchField()));
		findElement(LeankorBetaUninstallLocators.appLauncherSearchField()).click();
		findElement(LeankorBetaUninstallLocators.appLauncherSearchField()).sendKeys("Files");
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnFiles()));
		findElement(LeankorBetaUninstallLocators.clickOnFiles()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.dropDownUnderFiles()));
		findElement(LeankorBetaUninstallLocators.dropDownUnderFiles()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.selectDeleteOptionUnderDropdown()));
		findElement(LeankorBetaUninstallLocators.selectDeleteOptionUnderDropdown()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.deleteButton()));
		findElement(LeankorBetaUninstallLocators.deleteButton()).click();*/
		
		try {Thread.sleep(6000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.viewProfileIcon()));
		findElement(LeankorBetaUninstallLocators.viewProfileIcon()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.switchToSalesforceClassic()));
		findElement(LeankorBetaUninstallLocators.switchToSalesforceClassic()).click();
		
		//Click on F11 for switch to normal screen view
		/*try 
		{
			Robot robot = new Robot();
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			robot.keyPress(KeyEvent.VK_F11);
			robot.keyRelease(KeyEvent.VK_F11);
		}
		catch (AWTException e){}*/
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.setUp()));
		findElement(LeankorBetaUninstallLocators.setUp()).click();
	}
	
	public void uninstallingBeta()
	{
		explicitWaitVisibilityOf(findElement(LeankorBetaUninstallLocators.quickFindAndSearchInputField()));
		findElement(LeankorBetaUninstallLocators.quickFindAndSearchInputField()).click();
		findElement(LeankorBetaUninstallLocators.quickFindAndSearchInputField()).sendKeys("installed packages");
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnInstalledPackages()));
		findElement(LeankorBetaUninstallLocators.clickOnInstalledPackages()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnLeankorLink()));
		findElement(LeankorBetaUninstallLocators.clickOnLeankorLink()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnUninstallButtonLeankorManaged()));
		findElement(LeankorBetaUninstallLocators.clickOnUninstallButtonLeankorManaged()).click();
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.END).build().perform();
		
		explicitWaitVisibilityOf(findElement(LeankorBetaUninstallLocators.doNotHaveCopyRadioButton()));
		findElement(LeankorBetaUninstallLocators.doNotHaveCopyRadioButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		alert = driver.switchTo().alert();
		alert.accept();
		
		explicitWaitVisibilityOf(findElement(LeankorBetaUninstallLocators.yesCheckBox()));
		findElement(LeankorBetaUninstallLocators.yesCheckBox()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.clickOnFinalUninstallButton()));
		findElement(LeankorBetaUninstallLocators.clickOnFinalUninstallButton()).click();
		
		try {Thread.sleep(80000);}catch(InterruptedException ie) {}
		refresh();
	}
}