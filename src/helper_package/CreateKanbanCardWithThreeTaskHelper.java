package helper_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common_package.CommonMethodsOfWebDriver;
import pom_package.CreateCardLocators;
import pom_package.CreateKanbanCardWithThreeTaskLocators;
import pom_package.CreateKanbanCardsOnDifferentMasterContainerLocators;
import pom_package.KanbanBoardRegressionLocators;


public class CreateKanbanCardWithThreeTaskHelper extends CommonMethodsOfWebDrive {

	

	public void kanbanCard() throws InterruptedException
	{		
		CreateKanbanCardsOnDifferentMasterContainersHelper kanbanCard = new CreateKanbanCardsOnDifferentMasterContainersHelper();
		kanbanCard.create_KanbanBoard();
		
		
		try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOn_KanbanBoardZoomIcon()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOn_KanbanBoardZoomIcon()).click();
		
		for(String browserWindowsValue : driver.getWindowHandles())
		{
			driver.switchTo().window(browserWindowsValue);
		}
		
		try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		
		for(int i=1; i<=5; i++)
		{
			explicitWaitVisibilityOf(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnNewToAddCardToBoard()));
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnNewToAddCardToBoard()).click();
			
			explicitWaitVisibilityOf(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreateButtonForCard()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreateButtonForCard()).click();
			
			//*****************************************************Edit Pensil Icon for Kanban Card***************************************************************
			if(i<=5)
			{
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitVisibilityOf(driver.findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")));
				driver.findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")).click();
				
				explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
				findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
				
				try {Thread.sleep(3000);}catch(InterruptedException ie) {}
				
				for(int j=1; j<=3; j++)
				{
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+j);
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskAddButton()));
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).clear();
				}
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()));
				findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()).click();
			}
			else if(i>=6)
			{
				scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")));
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				// Kanban card pensil icon				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitVisibilityOf(findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")));
				findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")).click();
								
				//form[@id='ext-zonePanel-32']//div[@id='ext-dataview-element-container-2']/div[15]/div/div[2]/div[2]/ul/li[8]
				
				explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
				findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
				
				try {Thread.sleep(3000);}catch(InterruptedException ie) {}
				
				for(int j=1; j<=3; j++)
				{
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+j);
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskAddButton()));
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).clear();
				}
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()));
				findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()).click();
			}
			System.out.print(i+" ");			
		}
		refresh();
		try {Thread.sleep(8000);}catch(InterruptedException ie) {}
	}
	
	public void cloneCardsIninProgressMasterContainer()
	{
		//***************************Click on backlog MasterContainer arrow icon****************************************
		
		//Clone Card from Backlog master container To in'progress master
		try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnBacklogMasterContainerArrowIcon()));
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnBacklogMasterContainerArrowIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneCards()));
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneCards()).click();
		
		int hyperJumpCardsTargetBoardFieldSize = findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).size();
		System.out.println("\nhyperJumpCardsTargetBoardFieldSize LINE 122:"+hyperJumpCardsTargetBoardFieldSize+"\n************************************************");
				
		//Click on Select Project dropdown
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-6).click();
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnFolderNameForExpand())); //comment static statement on CreateKanbanCardWithThreeTaskLocators class when script run from start
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnFolderNameForExpand()).click();	//comment static statement on CreateKanbanCardWithThreeTaskLocators class when script run from start
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.selectProjectNameAfterExpandFolder()));		//comment static statement on CreateKanbanCardWithThreeTaskLocators class when script run from start
		findElement(CreateKanbanCardWithThreeTaskLocators.selectProjectNameAfterExpandFolder()).click();	//comment static statement on CreateKanbanCardWithThreeTaskLocators class when script run from start
		
		
		//Click On Select Project Board
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-5).click();
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.selectkanbanBoardNameUnderProjectBoard()));
		findElement(CreateKanbanCardWithThreeTaskLocators.selectkanbanBoardNameUnderProjectBoard()).click();
		
		
		//Click on Select Column
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-4).click();
		
		explicitWaitElementToBeLocated(CreateKanbanCardWithThreeTaskLocators.selectInProgressMasterContainerUnderSelectColumnDropdown());
		findElement(CreateKanbanCardWithThreeTaskLocators.selectInProgressMasterContainerUnderSelectColumnDropdown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneButton()));
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneButton()).click();
		
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.cloneNewCardsOnToBoardPopup()));
		boolean visibilityOfMessagePopup = findElement(CreateKanbanCardWithThreeTaskLocators.cloneNewCardsOnToBoardPopup()).isDisplayed();
		System.out.println("Popup messaage is visible LINE 156:"+visibilityOfMessagePopup);
		
		if(visibilityOfMessagePopup==true)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnOKButtonOfMessagePopup()));
			findElement(CreateKanbanCardWithThreeTaskLocators.clickOnOKButtonOfMessagePopup()).click();
		}
	}
	
	
	public void cloneCardsInReviewAndApprovalMasterContainer()
	{
		//***************************Click on backlog MasterContainer arrow icon****************************************
		
		try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnBacklogMasterContainerArrowIcon()));
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnBacklogMasterContainerArrowIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneCards()));
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneCards()).click();
		
		int hyperJumpCardsTargetBoardFieldSize = findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).size();
		System.out.println("hyperJumpCardsTargetBoardFieldSize LINE 180:"+hyperJumpCardsTargetBoardFieldSize+"\n************************************************");
				
		//Click on Select Project dropdown
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-6).click();
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnFolderNameForExpand())); //comment static statement on CreateKanbanCardWithThreeTaskLocators class when script run from start
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnFolderNameForExpand()).click();	//comment static statement on CreateKanbanCardWithThreeTaskLocators class when script run from start
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.selectProjectNameAfterExpandFolder()));		//comment static statement on CreateKanbanCardWithThreeTaskLocators class when script run from start
		findElement(CreateKanbanCardWithThreeTaskLocators.selectProjectNameAfterExpandFolder()).click();	//comment static statement on CreateKanbanCardWithThreeTaskLocators class when script run from start
		
		
		//Click On Select Project Board
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-5).click();
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.selectkanbanBoardNameUnderProjectBoard()));
		findElement(CreateKanbanCardWithThreeTaskLocators.selectkanbanBoardNameUnderProjectBoard()).click();
		
		
		//Click on Select Column
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-4).click();
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.selectReviewAndApprovalMasterContainerUnderSelectColumnDropdown()));
		findElement(CreateKanbanCardWithThreeTaskLocators.selectReviewAndApprovalMasterContainerUnderSelectColumnDropdown()).click();
		
		
		//Click on clone button
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneButton()));
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneButton()).click();
		
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.cloneNewCardsOnToBoardPopup()));
		boolean visibilityOfMessagePopup = findElement(CreateKanbanCardWithThreeTaskLocators.cloneNewCardsOnToBoardPopup()).isDisplayed();
		System.out.println("Popup messaage is visible LINE 216:"+visibilityOfMessagePopup);
		
		if(visibilityOfMessagePopup==true)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnOKButtonOfMessagePopup()));
			findElement(CreateKanbanCardWithThreeTaskLocators.clickOnOKButtonOfMessagePopup()).click();
		}
	}
	
	
	public void cloneCardsInDoneMasterContainer()
	{
		//***************************Click on backlog MasterContainer arrow icon****************************************
		
		try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnBacklogMasterContainerArrowIcon()));
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnBacklogMasterContainerArrowIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneCards()));
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneCards()).click();
		
		int hyperJumpCardsTargetBoardFieldSize = findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).size();
		System.out.println("hyperJumpCardsTargetBoardFieldSize LINE 240:"+hyperJumpCardsTargetBoardFieldSize+"\n************************************************");
				
		//Click on Select Project dropdown
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-6).click();
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnFolderNameForExpand())); //comment static statement on CreateKanbanCardWithThreeTaskLocators class when script run from start
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnFolderNameForExpand()).click();	//comment static statement on CreateKanbanCardWithThreeTaskLocators class when script run from start
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.selectProjectNameAfterExpandFolder()));		//comment static statement on CreateKanbanCardWithThreeTaskLocators class when script run from start
		findElement(CreateKanbanCardWithThreeTaskLocators.selectProjectNameAfterExpandFolder()).click();	//comment static statement on CreateKanbanCardWithThreeTaskLocators class when script run from start
		
		
		//Click On Select Project Board
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-5).click();
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.selectkanbanBoardNameUnderProjectBoard()));
		findElement(CreateKanbanCardWithThreeTaskLocators.selectkanbanBoardNameUnderProjectBoard()).click();
		
		
		//Click on Select Column
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-4).click();
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.selectDoneMasterContainerUnderSelectColumnDropdown()));
		findElement(CreateKanbanCardWithThreeTaskLocators.selectDoneMasterContainerUnderSelectColumnDropdown()).click();
		
		//Click on clone button
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneButton()));
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneButton()).click();
		
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.cloneNewCardsOnToBoardPopup()));
		boolean visibilityOfMessagePopup = findElement(CreateKanbanCardWithThreeTaskLocators.cloneNewCardsOnToBoardPopup()).isDisplayed();
		System.out.println("Popup messaage is visible LINE 275:"+visibilityOfMessagePopup);
		
		if(visibilityOfMessagePopup==true)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnOKButtonOfMessagePopup()));
			findElement(CreateKanbanCardWithThreeTaskLocators.clickOnOKButtonOfMessagePopup()).click();
		}
	}
	
	
	public void cloneCardsInArchiveMasterContainer()
	{
		//***************************Click on backlog MasterContainer arrow icon****************************************
		
		try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnBacklogMasterContainerArrowIcon()));
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnBacklogMasterContainerArrowIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneCards()));
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneCards()).click();
		
		int hyperJumpCardsTargetBoardFieldSize = findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).size();
		System.out.println("hyperJumpCardsTargetBoardFieldSize LINE 299:"+hyperJumpCardsTargetBoardFieldSize+"\n************************************************");
				
		//Click on Select Project dropdown
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-6).click();
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnFolderNameForExpand())); //comment static statement on CreateKanbanCardWithThreeTaskLocators class when script run from start
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnFolderNameForExpand()).click();	//comment static statement on CreateKanbanCardWithThreeTaskLocators class when script run from start
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.selectProjectNameAfterExpandFolder()));		//comment static statement on CreateKanbanCardWithThreeTaskLocators class when script run from start
		findElement(CreateKanbanCardWithThreeTaskLocators.selectProjectNameAfterExpandFolder()).click();	//comment static statement on CreateKanbanCardWithThreeTaskLocators class when script run from start
		
		
		//Click On Select Project Board
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-5).click();
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.selectkanbanBoardNameUnderProjectBoard()));
		findElement(CreateKanbanCardWithThreeTaskLocators.selectkanbanBoardNameUnderProjectBoard()).click();
		
		
		//Click on Select Column
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-4).click();
		
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.selectArchiveMasterContainerUnderSelectColumnDropdown()));
		findElement(CreateKanbanCardWithThreeTaskLocators.selectArchiveMasterContainerUnderSelectColumnDropdown()).click();
		
		
		//Click on clone button
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneButton()));
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneButton()).click();
		
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.cloneNewCardsOnToBoardPopup()));
		boolean visibilityOfMessagePopup = findElement(CreateKanbanCardWithThreeTaskLocators.cloneNewCardsOnToBoardPopup()).isDisplayed();
		System.out.println("Popup messaage is visible LINE 336:"+visibilityOfMessagePopup);
		
		if(visibilityOfMessagePopup==true)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnOKButtonOfMessagePopup()));
			findElement(CreateKanbanCardWithThreeTaskLocators.clickOnOKButtonOfMessagePopup()).click();
		}
	}
	
	
	public void cloneKanbanBoard()
	{
		//********************************************Clone board script start from here***************************************
		try {Thread.sleep(10000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnListIconButton()));
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnListIconButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneBoardUnderListIcon()));
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCloneBoardUnderListIcon()).click();
		
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardWithThreeTaskLocators.enterClonedProjectBoardName()));
		findElement(CreateKanbanCardWithThreeTaskLocators.enterClonedProjectBoardName()).sendKeys("C1");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCreateButtonOnCloneProjectBoard()));
		findElement(CreateKanbanCardWithThreeTaskLocators.clickOnCreateButtonOnCloneProjectBoard()).click();
	}
}