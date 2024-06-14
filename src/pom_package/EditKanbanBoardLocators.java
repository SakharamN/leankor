package pom_package;

import org.openqa.selenium.By;

public class EditKanbanBoardLocators {

	public static final By editBoardIcon()
	{
		return By.id("viewerModeChangeEditBtn");
	}
	
	public static final By editTemplateMasterContainer()
	{
		return By.xpath("//div[@id='ext-masterContainer-1']//div[contains(@class,'editMasterCntCls')]");
	}
	
	public static final By changeTemplateMasterContainerType()
	{
		return By.xpath("//div[contains(@id,'ext-selectfield-')]//div[contains(@class,'x-component-outer')]");
	}
	
	public static final By selectTypeForTemplateMasterContainer()
	{
		return By.xpath("//span[text()='Regular']");
	}
	
	public static final By updateButton()
	{
		return By.xpath("//span[text()='Update']");
	}
	
	public static final By loadMaskAfterSave()
	{
		return By.xpath("//div[contains(@id,'ext-loadmask-')]//div[@class='x-loading-spinner-outer']");
	}
	
	public static final By addNewMasterContainer()
	{
		return By.id("newMasterBtn");
	}
	
	public static final By masterContainerTitle()
	{
		return By.name("Title");
	}
	
	public static final By newMasterContainerColorCategory()
	{
		return By.xpath("//div[contains(@class,'categoryColorField')]");
	}
	
	public static final By selectColorForNewMasterContainer()
	{
		return By.xpath("//div[contains(@id,'ext-dataview-')]//div[contains(@id,'ext-dataview-element-container-')]/div");
	}
	
	public static final By selectNewMasterContainerColor()
	{
		//return By.xpath("//div[contains(@id,'ext-dataview-')]//div[contains(@id,'ext-dataview-element-container-')]/div[99]");
		return By.xpath("//div[contains(@id,'ext-dataview-')]//div[contains(@class,'x-unsized x-dataview-container')]/div[99]");
	}
	
	public static final By createMasterContainerButton()
	{
		return By.xpath("//span[text()='Create']");
	}
	
	public static final By backToBoard()
	{
		return By.id("viewerModeChangeBtn");
	}
	
	public static final By customCreatedMasterContainerOnKanbanBoard()
	{
		return By.id("ext-zonePanel-46");
	}
	
	public static final By customCreatedMasterContainer()
	{
		return By.id("ext-masterContainer-7");
	}
	
	public static final By editCustomCreatedMasterContainer()
	{
		return By.xpath("//div[@id='ext-masterContainer-7']//div[contains(@class,'editMasterCntCls')]");
	}
	
	public static final By editMasterContainerLimit()
	{
		return By.xpath("//div[contains(@id,'ext-numberfield-')]//input");
	}
	
	public static final By editMasterContainerCardLimitRadioButton()
	{
		return By.xpath("//div[contains(@id,'ext-fieldset-')]//div[contains(@id,'ext-radiofield-')]");
	}
	
	public static final By editMasterContainerSelectColor()
	{
		//return By.xpath("//div[contains(@id,'ext-dataview-')]//div[contains(@id,'ext-dataview-element-container-')]/div[85]");
		return By.xpath("//div[contains(@id,'ext-dataview-')]//div[contains(@class,'x-unsized x-dataview-container')]/div[85]");
	}
	
	public static final By automationMasterContainer()
	{
		return By.xpath("//form[@id='ext-zonePanel-81']");
	}
	
	public static final By resetkanbanBoard()
	{
		return By.id("resetButton");
	}
	
	public static final By addToBoard()
	{
		return By.id("mainMenuBtn");
	}
	
	public static final By kanbanBoardLeftNav()
	{
		return By.xpath("//span[contains(@class,'sidemanuicon')]");
	}
	
	public static final By clickOnPlanGantt()
	{
		//return By.xpath("//div[text()='Plan Gantt']");
		
		return By.xpath("//div[contains(@title,'Plan')]");
	}
	
	public static final By addCardToBoard()
	{
		return By.id("cardFanBtn");
	}
	
	public static final By createCardButton()
	{
		return By.xpath("//span[text()='Create']");
	}
	
	public static final By clickOnEditAutomationCard()
	{
		return By.xpath("//form[@id='ext-zonePanel-81']//div[@class='footer']/ul/li[@class='edit']");
	}
	
	public static final By linkToProject()
	{
		return By.xpath("//form[contains(@id,'ext-linkView-')]/div/div[2]/div[1]/div[5]//div[@class='x-dock-body']");
	}
	
	public static final By selectFolderName()
	{
		return By.xpath("//div[text()='Regression Folder']");
	}
	
	public static final By selectProjectName()
	{
		return By.xpath("//div[text()='Regression Project']");
	}
	
	public static final By linkToProjectBoard()
	{
		return By.xpath("//form[contains(@id,'ext-linkView-')]/div/div[2]/div[1]/div[6]//div[@class='x-dock-body']");
	}
	
	public static final By selectBoardUnderLinkToProjectBoard()
	{
		return By.xpath("//p[text()='Plan Board(Regression Project)']");
	}
	
	public static final By linkToCard()
	{
		return By.xpath("//form[contains(@id,'ext-linkView-')]/div/div[2]/div[1]/div[7]//div[@class='x-dock-body']");
	}
	
	public static final By selectActivity()
	{
		return By.xpath("//p[text()='Default']");
	}
	
	public static final By clickOnCardSaveButton()
	{
		return By.xpath("//span[text()='Save']");
	}
	
	public static final By activityCount()
	{
		return By.xpath("//div[contains(@id,'customganttpanel-')]//table[contains(@id,'customganttpanel-')]//div[@class='task-body-parent-custom projectgantt']");
		//div[contains(@id,'customganttpanel-')]//table[@id='customganttpanel-1011-timelineview-record-517']//div[@class='task-body-parent-custom projectgantt']/child::div[2]/div
	}
	
	
}