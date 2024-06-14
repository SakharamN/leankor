package pom_package;

import org.openqa.selenium.By;

import helper_package.CreateMilestoneAndAutomateThreedotfunctionalityOnPgHelper;

public class CreateSingleMilestoneAndAutomateEditInformationfieldLocator {
	
	
	public static final By clickOnThreeDot()
	{
		return By.xpath("//div[text()='A "+CreateMilestoneAndAutomateThreedotfunctionalityOnPgHelper.createFolderNameRandomly+"']/following-sibling::div[@class='lmenu']");
	}
	
	public static final By clickOnCreatedProject()
	{
		return By.xpath("//*[contains(text(),'"+ CreateMilestoneAndAutomateThreedotfunctionalityOnPgHelper.createProjectNameRandomly+"')]");
	}
	
	public static final By clickOnThreeDotOnMilestone()
	{
		return By.xpath("//span[text()='milestone1']/parent::span/following-sibling::span");
	}
	
	public static final By clickingOnEditInformation()
	{
		//return By.xpath("//div[contains(@class,'x-boundlist x-boundlist-floating x-layer')]/following-sibling::div[contains(@class,'launchBoardMenuCls ')][2]/div/div/div/div/div[1]");
		
		return By.xpath("//span[text()='milestone1']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Edit Information']");
		
		//return By.xpath("//span[text()='milestone1']/ancestor::body//div[@class='x-menu-body x-menu-body x-unselectable x-menu-body-default x-box-layout-ct x-menu-body-default x-noborder-trbl x-vertical-scroller x-menu-body-vertical-scroller x-menu-body-default-vertical-scroller']/child::div[2]//span[text()='Edit Information']");
	}
	
	public static final By salesforceTabIsVisible()
	{
		return By.xpath("//div[contains(@id,'filedataview-')]//span[text()='Salesforce Files Upload']");
	}
	
	public static final By clickOnSalesforcefileUpload()
	{
		return By.xpath("//div[contains(@id,'tabpanel-')]//input[@placeholder='No file chosen']");
	}
	
	
	
	
	
	
	

}
