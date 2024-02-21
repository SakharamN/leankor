package pom_package;

import org.openqa.selenium.By;
import helper_package.CreateKanbanCardsOnDifferentMasterContainersHelper;

public class CreateKanbanCardWithThreeTaskLocators {

	public static final By clickOnBacklogMasterContainerArrowIcon()
	{
		return By.xpath("//form[@id='ext-zonePanel-8']/div/div[2]/div/child::div[1]/div//div[@id='ext-container-16']");
	}
	
	public static final By clickOnCloneCards()
	{
		return By.xpath("//div[@style='transform: translate3d(0px, 0px, 0px);']//div[@style='min-height: 40px !important;']//div[text()='Clone Cards']");
	}
	
	public static final By clickOnFolderNameForExpand()
	{
		return By.xpath("//div[text()='A "+CreateKanbanCardsOnDifferentMasterContainersHelper.createFolderNameRandomly+"']");
	}
	
	public static final By selectProjectNameAfterExpandFolder()
	{
		return By.xpath("//div[text()='"+CreateKanbanCardsOnDifferentMasterContainersHelper.createProjectNameRandomly+"']");
	}
	
	public static final By selectkanbanBoardNameUnderProjectBoard()
	{
		return By.xpath("//div[text()='Kanban Board1']");
	}
	
	public static final By clickOnCloneButton()
	{
		return By.xpath("//span[text()='Clone']");
	}
	
	public static final By cloneNewCardsOnToBoardPopup()
	{
		return By.xpath("//div[contains(@id,'ext-messagebox-')]");
	}
	
	public static final By clickOnOKButtonOfMessagePopup()
	{
		return By.xpath("//span[text()='OK']");
	}
	
	public static final By selectBacklogMasterContainerUnderSelectColumnDropdown()
	{
		return By.xpath("//div[@style='min-height: 40px !important; transform: translate3d(0px, 47px, 0px);']");
	}
	
	public static final By selectInProgressMasterContainerUnderSelectColumnDropdown()
	{
		return By.xpath("//div[@style='min-height: 40px !important; transform: translate3d(0px, 94px, 0px);']");
	}
	
	public static final By selectReviewAndApprovalMasterContainerUnderSelectColumnDropdown()
	{
		return By.xpath("//div[@style='min-height: 40px !important; transform: translate3d(0px, 141px, 0px);']");
	}
		
	public static final By selectDoneMasterContainerUnderSelectColumnDropdown()
	{
		return By.xpath("//div[@style='min-height: 40px !important; transform: translate3d(0px, 188px, 0px);']");
	}
	
	
	public static final By selectArchiveMasterContainerUnderSelectColumnDropdown()
	{
		return By.xpath("//div[@style='min-height: 40px !important; transform: translate3d(0px, 235px, 0px);']");
	}
	
	public static final By clickOnListIconButton()
	{
		return By.id("listIconBtn");
	}
	
	public static final By clickOnCloneBoardUnderListIcon()
	{
		return By.xpath("//div[contains(@class,'cloneBtnCls')]");
	}
	
	
	public static final By enterClonedProjectBoardName()
	{
		return By.name("projectBoard");
	}
	
	
	public static final By clickOnCreateButtonOnCloneProjectBoard()
	{
		return By.xpath("//span[text()='Create']");
	}
	
	
	//Reach towards kanbanBoard xpath
	public static final By clickOnFolderName()
	{
		return By.xpath("//div[text()='A aAiCLF']");
	}
	
	public static final By clickOnProjectName()
	{
		return By.xpath("//div[text()='loIyA']");
	}
	
	public static final By clickOnProjectBoard()
	{
		return By.xpath("//div[text()='Project Boards']");
	}
	
	public static final By clickOnCreatedKanbanBoard()
	{
		return By.xpath("//div[text()='Kanban Board1']");
	}
}