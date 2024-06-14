package pom_package;

import org.openqa.selenium.By;

public class LeankorBetaInstallLocators {

	public static final By noThanksButton()
	{
		return By.xpath("//input[@value='No Thanks']");
	}
	
	public static final By urlOfBeta()
	{
		return By.linkText("https://login.salesforce.com/packaging/installPackage.apexp?p0=04t1K000002audb");
	}
	
	public static final By installForAllUserBox()
	{
		return By.id("mappingOptionAll");
	}
	
	public static final By installButton()
	{
		return By.xpath("//span[text()='Install']");
	}
	
	public static final By doneButton()
	{
		return By.xpath("//span[text()='Done']");
	}	
	
	public static final By viewProfileIcon()
	{
		return By.xpath("//div[@class='slds-global-header slds-grid slds-grid--align-spread']/span/ul/li[9]");
	}
	
	public static final By switchToSalesforceClassic()
	{
		return  By.xpath("//a[text()='Switch to Salesforce Classic']");
	}
	
	public static final By setUp()
	{
		return By.linkText("Setup");
	}
	
	public static final By quickFindOnLightningView()
	{
		return By.xpath("//input[@placeholder='Quick Find']");
	}
	
	public static final By selectDeploymentStatusOnLightningView()
	{
		return By.xpath("//mark[text()='Deployment Status']");
	}
	
	public static final By scrollToDeployComponents()
	{
		return By.xpath("//div[@id='inProgressDetailsContainer']");
	}
	
	public static final By deploymentStatusBar()
	{
		return By.xpath("//div[@id='inProgressSectionContainer']/div[2]/div/div[2]/div[text()='1/1']");
	}
	
	//Salesforce classic
	public static final By quickFindAndSearchInputField()
	{
		return By.id("setupSearch");
	}
	
	public static final By selectDeploymentStatus()
	{
		return By.linkText("Deployment Status");
	}
	
	public static final By inProgressCompleted()
	{
		return By.id("inProgressCompletedDateText");
	}
	
	public static final By addAssignmentButton()
	{
		return By.id("manage_user_assign_btn");
	}
	
	public static final By assignButton()
	{
		return By.id("assign_btn");
	}
	
	public static final By finalDoneButton()
	{
		return By.id("done_btn");
	}
	
	public static final By upperRightCornerDropdown()
	{
		return By.id("tsidButton");
	}
	
	public static final By selectLeankor()
	{
		return By.linkText("Leankor");
	}
	
	public static final By clickOnOffButtonAfterLeankorInstallationComplete()
	{
		return By.xpath("//div[@style='left: 0px; top: 70px;']/div[5]/a[4]");
	}
}