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
		return By.xpath("//div[@class='x-menu submenu2 x-layer x-menu-default x-border-box']//span");
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
