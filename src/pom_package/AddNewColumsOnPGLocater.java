package pom_package;

import org.openqa.selenium.By;

import helper_package.AddNewColumsOnPGHelper;

public class AddNewColumsOnPGLocater {

	
	public static final By clickOnThreeDots()
	{
		return By.xpath("//div[text()='A "+AddNewColumsOnPGHelper.createFolderNameRandomly+"']/following-sibling::div[@class='lmenu']");
	} 

	public static final By clickOnCreatedProject()
	{
	    return By.xpath("//div[contains(text(),'"+ AddNewColumsOnPGHelper.createProjectNameRandomly +"')]");
	}
	
	
	
	public static final By addNewColumn()
	{
		return By.xpath("//div[@class='x-menu-item x-menu-item-default x-box-item']//*[text()='Add New Column']");
	}
	
	public static final By addNewColumnsAllPopUpElementsSize()
	{
		//return By.xpath("//div[@class='x-menu submenu2 x-layer x-menu-default x-border-box']//span");
		
		return By.xpath("//div[@class='x-menu x-layer x-menu-default x-border-box']//span");//summer24
	}
	
	public static final By dividerBar()
	{
		return By.xpath("//div[contains(@class,'customGanttPanelCls ')]//div[contains(@class,'x-splitter sch-timelinepanel-splitter x-border-item x-box-item x-splitter-default x-splitter')]");
	}
	
	
	//following xpath for removing the Added columns
	
	public static final By removePercentageDoneColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='% Done']");
	}
	
	
	public static final By triggerofPercentageDoneColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='% Done']/parent::div/parent::div/parent::div/following-sibling::div");
	}
	
	public static final By removeAssignedResourceColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Assigned Resources']");
	}
	
	public static final By triggerofAssignedResourceColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Assigned Resources']/parent::div/parent::div/parent::div/following-sibling::div");
	}
	
	public static final By removeCategoryColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Category']");
	}
	
	public static final By triggerofCategoryColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Category']/parent::div/parent::div/parent::div/following-sibling::div");
	}
	
	
	public static final By removeDescriptionColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Description']");
	}
	
	public static final By triggerofDescriptionColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Description']/parent::div/parent::div/parent::div/following-sibling::div");
	}
	
	
	public static final By removeDiscussColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Discuss']");
	}
	
	public static final By triggerofDiscussColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Discuss']/parent::div/parent::div/parent::div/following-sibling::div");
	}
	
	public static final By removeElapsedTimeColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Elapsed Time']");
	}
	
	public static final By triggerofElapsedTimeColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Elapsed Time']/parent::div/parent::div/parent::div/following-sibling::div");
	}
	
	public static final By removeFilesColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Files']");
	}
	
	public static final By triggerofFilesColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Files']/parent::div/parent::div/parent::div/following-sibling::div");
	}
	
	
	public static final By removeOnHoldColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='On Hold']");
	}
	
	public static final By triggerofOnHoldColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='On Hold']/parent::div/parent::div/parent::div/following-sibling::div");
	}
	
	public static final By removePredecessorColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Predecessors']");
	}
	
	public static final By triggerofPredecessorColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Predecessors']/parent::div/parent::div/parent::div/following-sibling::div");
	}
	
	public static final By removePriorityColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Priority']");
	}
	
	public static final By triggerofPriorityColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Priority']/parent::div/parent::div/parent::div/following-sibling::div");
	}

	
	public static final By removeRiskColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Risk']");
	}
	
	public static final By triggerofRiskColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Risk']/parent::div/parent::div/parent::div/following-sibling::div");
	}
	
	public static final By removeSequenceColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Sequence']");
	}
	
	public static final By triggerofSequenceColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Sequence']/parent::div/parent::div/parent::div/following-sibling::div");
	}
	
	
	public static final By removeStickersColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Stickers']");
	}
	
	public static final By triggerofStickersColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Stickers']/parent::div/parent::div/parent::div/following-sibling::div");
	}
	
	public static final By removeSuccessorsColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Successors']");
	}
	
	public static final By triggerofSuccessorColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Successors']/parent::div/parent::div/parent::div/following-sibling::div");
	}
	
	
	public static final By removeTimeToLaunch()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Time To Launch']");
	}
	
	public static final By triggerofTimeToLaunchColumn()
	{
		return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Time To Launch']/parent::div/parent::div/parent::div/following-sibling::div");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
