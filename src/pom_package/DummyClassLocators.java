package pom_package;

import org.openqa.selenium.By;

public class DummyClassLocators {
	
	public static final By clickOnFolderName()
	{
		return By.xpath("//div[text()='A DP']");
	}
	
	public static final By clickOnProjectName()
	{
		return By.xpath("//div[text()='DP Project']");
	}
	
	public static final By clickOnProjectBoard()
	{
		return By.xpath("//div[text()='Project Boards']");
	}
	
	public static final By clickOnCreatedKanbanBoard()
	{
		return By.xpath("//div[text()='KB1']");
	}
	
	public static final By clickOnProjectNameAnotherOne()
	{
		return By.xpath("//div[text()='Regression Project for link kanban card']");
	}
	
	public static final By clickOnCreatedKanbanBoardAnotherOne()
	{
		return By.xpath("//div[text()='Regression Kanban Board for link one card to it']");
	}
	
	//Reach towards another kanban board xpath
	public static final By clickOnAnotherProjectName()
	{
		return By.xpath("//div[contains(@title,'Regression Project for link')]");
	}
	
	public static final By clickOnAnotherKanbanBoardName() 
	{
		return By.xpath("//div[contains(@title,'Regression Kanban Board for link')]");
	}
	
	public static final By loadMaskAfterSave()
	{
		return By.xpath("//div[contains(@id,'ext-loadmask-')]//div[@class='x-loading-spinner-outer']");
	}
}