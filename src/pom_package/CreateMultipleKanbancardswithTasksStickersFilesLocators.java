package pom_package;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;

import helper_package.CreateKanbanCardsOnDifferentMasterContainersHelper;
import helper_package.CreateMultipleKanbancardswithTasksStickersFilesHelper;
import helper_package.ToAddingConstraintsColumnInCVHelper;

public class CreateMultipleKanbancardswithTasksStickersFilesLocators {

	
	public static final By clickOnThreeDots()
	{
		return By.xpath("//div[text()='A "+CreateMultipleKanbancardswithTasksStickersFilesHelper.createFolderNameRandomly+"']/following-sibling::div[@class='lmenu']");
	}
	
	public static final By clickOnCreatedProject()
	{
			return By.xpath("//div[contains(text(),'"+ CreateMultipleKanbancardswithTasksStickersFilesHelper.createProjectNameRandomly +"')]");
	}	
	
	public static final By clickonProjectBoard()
	{
		return By.xpath("//div[text()='Project Boards']");
	}
	
	public static final By ClickOnCreatedFolder()
	{
		return By.xpath("//*[text()='"+ CreateMultipleKanbancardswithTasksStickersFilesHelper.folderName +"']");
	}
	
	
	//===========================================
	public static final By OpenCreatedFolder()
	{
		return By.xpath("//*[text()='"+ ToAddingConstraintsColumnInCVHelper.folderName +"']");
	}

	
	
	public static final By OpencreatedProject()
	{
		return By.xpath("//*[text()='"+ToAddingConstraintsColumnInCVHelper.projectName+"']");
	}
	
   public static final By OpenCreatedKanbanBoard()
   {
	   return By.xpath("//*[text()='"+ToAddingConstraintsColumnInCVHelper.projectBoardName+"']");
   }
	
	
	
	
	
	
	
	
	//==================================================================
	
	public static final By ClickoncreatedProject()
	{
		return By.xpath("//*[text()='"+CreateMultipleKanbancardswithTasksStickersFilesHelper.projectName+"']");
	}
	
   public static final By ClickOnCreatedKanbanBoard()
   {
	   return By.xpath("//*[text()='"+CreateMultipleKanbancardswithTasksStickersFilesHelper.projectBoardName+"']");
   }
	
	
	
	
	
}
