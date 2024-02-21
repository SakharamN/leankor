package helper_package;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_package.CommonMethodsOfWebDriver;
import pom_package.LeankorBetaInstallLocators;
import pom_package.LeankorBetaUninstallLocators;


public class LeankorBetaInstallHelper extends CommonMethodsOfWebDriver {

	
	public void leankorBetaInstallURL()
	{	
		JavascriptExecutor jsExe = (JavascriptExecutor)driver;
		jsExe.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://login.salesforce.com/packaging/installPackage.apexp?p0=04t0V000000xEeJ");		//lean 1.249 (Beta 1)
		explicitWaitElementToBeClickable(findElement(LeankorBetaInstallLocators.installForAllUserBox()));
		findElement(LeankorBetaInstallLocators.installForAllUserBox()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaInstallLocators.installButton()));
		findElement(LeankorBetaInstallLocators.installButton()).click();
		
		WebDriverWait explicitWait = new WebDriverWait(driver,200);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated((LeankorBetaInstallLocators.doneButton())));
		findElement(LeankorBetaInstallLocators.doneButton()).click();
		
		//Applied code
		try {Thread.sleep(15000);}catch(InterruptedException ie) {}
		
		String getTitleOfPageOnleankorBetaInstallClass = driver.getTitle();
		System.out.println("Leankor Beta Install class : "+getTitleOfPageOnleankorBetaInstallClass);
		
		if(driver.getTitle().equals("Home | Salesforce") || driver.getTitle().equals("Leankor | Salesforce") || driver.getTitle().equals("Lightning Experience | Salesforce") || driver.getTitle().equals("Installed Packages | Salesforce"))	//for lightning experience
		{
			System.out.println("Enter in lightning condition of IF");
			try {Thread.sleep(10000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(LeankorBetaInstallLocators.viewProfileIcon()));
			findElement(LeankorBetaInstallLocators.viewProfileIcon()).click();
			
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(LeankorBetaInstallLocators.switchToSalesforceClassic()));
			findElement(LeankorBetaInstallLocators.switchToSalesforceClassic()).click();
			
			explicitWaitElementToBeClickable(findElement(LeankorBetaInstallLocators.setUp()));
			findElement(LeankorBetaInstallLocators.setUp()).click();
			
			explicitWaitVisibilityOf(findElement(LeankorBetaInstallLocators.quickFindAndSearchInputField()));
			findElement(LeankorBetaInstallLocators.quickFindAndSearchInputField()).click();
			findElement(LeankorBetaInstallLocators.quickFindAndSearchInputField()).sendKeys("deployment status");
			explicitWaitElementToBeClickable(findElement(LeankorBetaInstallLocators.selectDeploymentStatus()));
			findElement(LeankorBetaInstallLocators.selectDeploymentStatus()).click();
			
			explicitWait.until(ExpectedConditions.visibilityOf(findElement(LeankorBetaInstallLocators.inProgressCompleted())));
			boolean deploymentStatus = findElement(LeankorBetaInstallLocators.inProgressCompleted()).isDisplayed();
			System.out.println("Deployment value : "+deploymentStatus);
			if(deploymentStatus==true)
			{
				refresh();
			}
		}
		else if(driver.getTitle().equals("Installed Packages ~ Salesforce - Developer Edition") || driver.getTitle().equals("Installed Packages ~ Salesforce - Enterprise Edition"))	//for salesforce classic
		{
			System.out.println("Enter in classic condition of IF");
			explicitWaitVisibilityOf(findElement(LeankorBetaInstallLocators.quickFindAndSearchInputField()));
			findElement(LeankorBetaInstallLocators.quickFindAndSearchInputField()).click();
			findElement(LeankorBetaInstallLocators.quickFindAndSearchInputField()).sendKeys("deployment status");
			explicitWaitElementToBeClickable(findElement(LeankorBetaInstallLocators.selectDeploymentStatus()));
			findElement(LeankorBetaInstallLocators.selectDeploymentStatus()).click();
			
			explicitWait.until(ExpectedConditions.visibilityOf(findElement(LeankorBetaInstallLocators.inProgressCompleted())));
			boolean deploymentStatus = findElement(LeankorBetaInstallLocators.inProgressCompleted()).isDisplayed();
			System.out.println("Deployment value : "+deploymentStatus);
			if(deploymentStatus==true)
			{
				refresh();
			}
		}
		//till here
		
		/*explicitWaitVisibilityOf(findElement(LeankorBetaInstallLocators.quickFindAndSearchInputField()));
		findElement(LeankorBetaInstallLocators.quickFindAndSearchInputField()).click();
		findElement(LeankorBetaInstallLocators.quickFindAndSearchInputField()).sendKeys("deployment status");
		explicitWaitElementToBeClickable(findElement(LeankorBetaInstallLocators.selectDeploymentStatus()));
		findElement(LeankorBetaInstallLocators.selectDeploymentStatus()).click();
		
		explicitWait.until(ExpectedConditions.visibilityOf(findElement(LeankorBetaInstallLocators.inProgressCompleted())));
		boolean deploymentStatus = findElement(LeankorBetaInstallLocators.inProgressCompleted()).isDisplayed();
		System.out.println("Deployment value : "+deploymentStatus);
		if(deploymentStatus==true)
		{
			refresh();
		}*/
		
		explicitWaitVisibilityOf(findElement(LeankorBetaUninstallLocators.expandManageUserDropDown()));
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
		
		int addAssignmentButtonValue = driver.findElements(LeankorBetaInstallLocators.addAssignmentButton()).size();
		System.out.println("add assignment button ::: Line 116 ::: "+addAssignmentButtonValue +" value after substraction ::: "+(addAssignmentButtonValue-2));
		driver.findElements(LeankorBetaInstallLocators.addAssignmentButton()).get(addAssignmentButtonValue-2).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaUninstallLocators.allBoxexActionCheckBox()));
		findElement(LeankorBetaUninstallLocators.allBoxexActionCheckBox()).click();
		
		int assignButtonValue = driver.findElements(LeankorBetaInstallLocators.assignButton()).size();
		driver.findElements(LeankorBetaInstallLocators.assignButton()).get(assignButtonValue-2).click();
		
		int doneButtonValue = driver.findElements(LeankorBetaInstallLocators.finalDoneButton()).size();
		driver.findElements(LeankorBetaInstallLocators.finalDoneButton()).get(doneButtonValue-2).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaInstallLocators.upperRightCornerDropdown()));
		findElement(LeankorBetaInstallLocators.upperRightCornerDropdown()).click();
		
		explicitWaitElementToBeClickable(findElement(LeankorBetaInstallLocators.selectLeankor()));
		findElement(LeankorBetaInstallLocators.selectLeankor()).click();
	}
}