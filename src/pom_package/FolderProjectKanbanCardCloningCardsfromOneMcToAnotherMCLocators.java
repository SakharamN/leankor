package pom_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common_package.CommonMethodsOfWebDriver;


public class FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators extends CommonMethodsOfWebDriver {
	

	public static final By clickOnFolderIcon()
	{
		//return By.className("addicon");
		//return By.xpath("//div[@class='headParent']/child::div[text()='ALL FOLDERS']/following-sibling::div");
		return By.xpath("//div[@class='headParent']//div[@class='addicon']");
	}
	
	public static final By enterFolderName()
	{
		return By.xpath("//div[@id='ext-input-4']/input[@class='x-input-el x-input-text x-form-field searchFieldCls']");
	}

	public static final By clickOnAddButton()
	{
		return By.xpath("//div[@class='x-container x-panel x-layout-box-item x-stretched']/div[1]/div[2]");
	}	
	
	public static final By clickOnCreatedFolder()
	{
		return By.xpath("//*[text()='A Folder']");
	}
	
	public static final By clickOnThreeDots()
	{
		return By.xpath("//div[text()='A Folder']/following-sibling::div[@class='lmenu']");
	}
	
	public static final By clickOnAddProject()
	{
		return By.xpath("//div[contains(text(),'Add Project')]");
	}
	
	public static final By enterProjectName()
	{
		return By.xpath("//div[@class='x-component-outer']/div[1]/input[@placeholder='New Project']");
	}
	
	public static final By clickOnProjectAddButton()
	{
		return By.xpath("//div[@class='x-button-normal x-button addBtnCls x-layout-box-item x-stretched']");
	}
	
	public static final By clickOnCreatedProject()
	{
		//return By.xpath("//div[contains(text(),'Project P1')]");
		
		return By.xpath("//div[contains(@class,'innerclass contentseprator')]/div[2]");
		
		//return By.xpath("//div[contains(@style,'min-height: 35px !important; transform: translate3d(0px, 40px, 0px);')]//div[contains(text(),'Project P1')]");
	}
	
	public static final By clickOnProjectBoardThreeDots()
	{
		return By.xpath("//div[contains(text(),'Project Boards')]/following-sibling::div[@class='lmenu']");				
	}
	
	public static final By clickOnCreateKanbanBoardButton()
	{
		return By.xpath("//div[contains(text(),'Create Kanban Board')]");
	}
	
	public static final By enterKanbanBoardNameInputArea()
	{
		return By.xpath("//input[@placeholder='New Kanban Board']");
	}
	
	public static final By clickOnAddKanbanBoardButton()
	{
		return By.xpath("//div[@class='x-button-normal x-button addBtnCls x-layout-box-item x-stretched']");
	}
	
	public static final By openKanbanBoard()
	{
		return By.xpath("//div[contains(text(),'Kanban Board1')]");
	}
	
	public static final By clickOnAddToBoardFan()
	{
		return By.xpath("//div[@class='x-dock-body']/div[@class='x-body']/div[2]");
	}
	
	public static final By addCardToBoard()
	{
		return By.id("cardFanBtn");
	}
	
	public static final By dropToBacklog()
	{		
		return By.xpath("//div[@class='x-body x-scroll-view']/div[@class='x-scroll-container x-size-monitored x-paint-monitored']/div[1]");
	}
	
	public static final By selectFolder()
	{
		return By.xpath("//*[text()='A Folder']");
	}
	
	public static final By selectProject()
	{
		return By.xpath("//div[text()='Project P1']");
	}
	
	public static final By selectKanbanBoard()
	{
		return By.xpath("//div[text()='Kanban Board1']");
	}
	
	public static final By selectColumnInProgressMasterContainer()
	{
		//return By.xpath("//div[@style='min-height: 40px !important; transform: translate3d(0px, 94px, 0px);']");
		return By.xpath("//div[contains(@class,'wrapData listOverData') and text()='In Progress']");
	}
	
	public static final By selectColumnInReviewAndApprovalContainer()
	{
		//return By.xpath("//div[@style='min-height: 40px !important; transform: translate3d(0px, 141px, 0px);']");
		
		return By.xpath("//div[contains(@class,'wrapData listOverData') and text()='Review & Approve']");
		
		
	}	
	
	public static final By selectColumnDoneContainer()
	{
		//return By.xpath("//div[@style='min-height: 40px !important; transform: translate3d(0px, 188px, 0px);']");
		
		return By.xpath("//div[contains(@class,'wrapData listOverData') and text()='Done']");
	}
	
	public static final By selectColumnArchiveContainer()
	{
		//return By.xpath("//div[@style='min-height: 40px !important; transform: translate3d(0px, 235px, 0px);']");
		return By.xpath("//div[contains(@class,'wrapData listOverData') and text()='Archive']");
	}
	
	
	
	
}