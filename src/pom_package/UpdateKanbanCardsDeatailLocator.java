package pom_package;

import org.openqa.selenium.By;

import helper_package.AutomateConstraintColumnfieldOnCalendarViewHelper;
import helper_package.UpdateKanbanCardsDeatailHelper;

public class UpdateKanbanCardsDeatailLocator {
	

	public static final By clickonProjectBoard()
	{
		return By.xpath("//div[text()='Project Boards']");
	}
	
	
	public static final By ClickOnCreatedFolder()
	{
		return By.xpath("//*[text()='"+ AutomateConstraintColumnfieldOnCalendarViewHelper.folderName +"']");
	}
	
	public static final By ClickoncreatedProject()
	{
		return By.xpath("//*[text()='"+AutomateConstraintColumnfieldOnCalendarViewHelper.projectName+"']");
	}
	
   public static final By ClickOnCreatedKanbanBoard()
   {
	   return By.xpath("//*[text()='"+AutomateConstraintColumnfieldOnCalendarViewHelper.projectBoardName+"']");
   }

   public static final By ClickOnCreatedFolderCard()
	{
		return By.xpath("//*[text()='"+UpdateKanbanCardsDeatailHelper.folderName+"']");
	}
	
	public static final By ClickoncreatedProjectCard()
	{
		return By.xpath("//*[text()='"+UpdateKanbanCardsDeatailHelper.projectName+"']");
	}
	
  public static final By ClickOnCreatedKanbanBoardCard()
  {
	   return By.xpath("//*[text()='"+UpdateKanbanCardsDeatailHelper.projectBoardName+"']");
  }

  
}
