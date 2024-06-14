package helper_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_package.CommonMethodsOfWebDriver;
import pom_package.AddKanbanCardRegressionOnCalendarViewLocater;
import pom_package.AddToBoardFanButtonLocators;
import pom_package.CreateCardLocators;
import pom_package.FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators;
import pom_package.KanbanBoardSettingLocators;


public class FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMC extends CommonMethodsOfWebDriver{

	
    public static String getMasterContainerDynamicWebElementIdinfolder;
	public static int cardLimit,getSizeOfAllMasterContainersFromRegressionKanbanBoardfolder;
	public static WebElement sourceLocator;
	
	public void clickOn_CreateFolderProjectKanbanBoard()
	{
		
		/*
		 * try {Thread.sleep(4000);}catch(InterruptedException ie) {} WebElement eleme
		 * =driver.findElement(By.
		 * xpath("//div[text()='ALL FOLDERS']/ancestor::div[@class='headParent']/child::div[@class='addicon']"
		 * ));////div[text()='ALL
		 * FOLDERS']/ancestor::div[@class='headParent']/child::div[@class='addicon']
		 * 
		 * WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		 * 
		 * wait.until(ExpectedConditions.elementToBeClickable(eleme)); eleme.click();
		 */
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		//explicitWaitVisibilityOf(findElement(FolderProjectKanbanCardLocators.clickOnFolderIcon()));
		//findElement(FolderProjectKanbanCardLocators.clickOnFolderIcon()).click();
		
       try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		
				
		
	    explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnFolderIcon()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnFolderIcon()).click();

		
		explicitWaitVisibilityOf(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.enterFolderName()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.enterFolderName()).sendKeys("A Folder");
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnAddButton()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnAddButton()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		scrollinToView(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectFolder()));
		explicitWaitVisibilityOf(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectFolder()));
		// click on the compose button as soon as the "compose" button is visible
		jsExecutorClickOnElement(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectFolder()));
		
		
		

		/*scrollinToView(findElement(FolderProjectKanbanCardLocators.clickOnCreatedFolder()));
		jsExecutorClickOnElement(findElement(FolderProjectKanbanCardLocators.selectFolder()));
		*/
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnThreeDots()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnThreeDots()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnAddProject()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnAddProject()).click();
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.enterProjectName()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.enterProjectName()).sendKeys("Project P1");
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnProjectAddButton()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnProjectAddButton()).click();
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeLocated(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnCreatedProject());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnCreatedProject()).click();
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnProjectBoardThreeDots()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnProjectBoardThreeDots()).click();		
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnCreateKanbanBoardButton()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnCreateKanbanBoardButton()).click();		
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.enterKanbanBoardNameInputArea()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.enterKanbanBoardNameInputArea()).sendKeys("Kanban Board1");		
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnAddKanbanBoardButton()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnAddKanbanBoardButton()).click();	
		
		explicitWaitElementToBeLocated(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.openKanbanBoard());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.openKanbanBoard()).click();
	}	
	
	
	public void createKanbanCard()
	{
		driver.switchTo().frame("boardIfram");
		
		try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		
		/*
		 * explicitWaitVisibilityOf(findElement(CreateCardLocators.clickOnZoomIcon()));
		 * findElement(CreateCardLocators.clickOnZoomIcon()).click();
		 * 
		 * for(String kanbanBoardWindowHandle : driver.getWindowHandles()) {
		 * driver.switchTo().window(kanbanBoardWindowHandle); }
		 */
		
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter how many cards you want to create in each master container : ");
		System.out.print("Enter Total Number of Cards :");
		cardLimit = sc.nextInt();
		//System.out.println("This is card limit "+cardLimit +" and each master container have "+cardLimit +" cards");
		System.out.println("Card Limit is : "+cardLimit);
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddToBoardFan()));
		findElement(CreateCardLocators.clickOnAddToBoardFan()).click();
		
		
	for(int i=1; i<=cardLimit; i++)
		{
			//Card creation in Backlog master container
			if(i<=5)
			{
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
				sourceLocator = findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton());
				explicitWaitVisibilityOf(findElement(CreateCardLocators.dropToBackLogMasterContainer()));
				WebElement destinationLocator = findElement(CreateCardLocators.dropToBackLogMasterContainer());
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				actions.dragAndDrop(sourceLocator, destinationLocator).build().perform();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementBy("elementToBeLocated", CreateCardLocators.enterCardId());
				findElement(CreateCardLocators.enterCardId()).sendKeys("HR"+i);
				explicitWaitElementBy("elementToBeLocated", CreateCardLocators.enterCardTitle());
				findElement(CreateCardLocators.enterCardTitle()).sendKeys("Card"+i);
				try{Thread.sleep(1500);}catch(InterruptedException ie){}
				explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCreateButtonForCard()));
				findElement(CreateCardLocators.clickOnCreateButtonForCard()).click();
			}
			
			else if(i<=10)		//Card creation in inprogress master container
			{
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
				sourceLocator = findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton());
				explicitWaitVisibilityOf(findElement(CreateCardLocators.inprogressMasterContainer()));
				WebElement destinationLocator = findElement(CreateCardLocators.inprogressMasterContainer());
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				actions.dragAndDrop(sourceLocator, destinationLocator).build().perform();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementBy("elementToBeLocated", CreateCardLocators.enterCardId());
				findElement(CreateCardLocators.enterCardId()).sendKeys("Operation"+i);
				explicitWaitElementBy("elementToBeLocated", CreateCardLocators.enterCardTitle());
				findElement(CreateCardLocators.enterCardTitle()).sendKeys("Card"+i);
				try{Thread.sleep(1500);}catch(InterruptedException ie){}
				explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCreateButtonForCard()));
				findElement(CreateCardLocators.clickOnCreateButtonForCard()).click();
				System.out.println(i+" ");
			}
			
			else if(i<=15)		//Card creation in Review & Approval master container
			{	
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
				sourceLocator = findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton());
				explicitWaitVisibilityOf(findElement(CreateCardLocators.reviewAndApproveMasterContainer()));
				WebElement destinationLocator = findElement(CreateCardLocators.reviewAndApproveMasterContainer());
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				actions.dragAndDrop(sourceLocator, destinationLocator).build().perform();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementBy("elementToBeLocated", CreateCardLocators.enterCardId());
				findElement(CreateCardLocators.enterCardId()).sendKeys("Finance"+i);
				explicitWaitElementBy("elementToBeLocated", CreateCardLocators.enterCardTitle());
				findElement(CreateCardLocators.enterCardTitle()).sendKeys("Card"+i);
				try{Thread.sleep(1500);}catch(InterruptedException ie){}
				explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCreateButtonForCard()));
				findElement(CreateCardLocators.clickOnCreateButtonForCard()).click();
			}
			
			else if(i<=20)		//Card creation in Done master container
			{
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
				sourceLocator = findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton());
				explicitWaitVisibilityOf(findElement(CreateCardLocators.doneMasterContainer()));
				WebElement destinationLocator = findElement(CreateCardLocators.doneMasterContainer());
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				actions.dragAndDrop(sourceLocator, destinationLocator).build().perform();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementBy("elementToBeLocated", CreateCardLocators.enterCardId());
				findElement(CreateCardLocators.enterCardId()).sendKeys("Sales"+i);
				explicitWaitElementBy("elementToBeLocated", CreateCardLocators.enterCardTitle());
				findElement(CreateCardLocators.enterCardTitle()).sendKeys("Card"+i);
				try{Thread.sleep(1500);}catch(InterruptedException ie){}
				explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCreateButtonForCard()));
				findElement(CreateCardLocators.clickOnCreateButtonForCard()).click();
			}
			
			else if(i<=cardLimit)		//Card creation in Archive master container
			{
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
				sourceLocator = findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton());
				explicitWaitVisibilityOf(findElement(CreateCardLocators.archiveMasterContainer()));
				WebElement destinationLocator = findElement(CreateCardLocators.archiveMasterContainer());
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				actions.dragAndDrop(sourceLocator, destinationLocator).build().perform();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementBy("elementToBeLocated", CreateCardLocators.enterCardId());
				findElement(CreateCardLocators.enterCardId()).sendKeys("Marketing"+i);
				explicitWaitElementBy("elementToBeLocated", CreateCardLocators.enterCardTitle());
				findElement(CreateCardLocators.enterCardTitle()).sendKeys("Card"+i);
				try{Thread.sleep(1500);}catch(InterruptedException ie){}
				explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCreateButtonForCard()));
				findElement(CreateCardLocators.clickOnCreateButtonForCard()).click();
			}
		}
		
		
		
		
		
		// card create in Backlog master container with HR
		for(int i=1;i<=cardLimit; i++)
		{
			explicitWaitElementBy("elementToBeLocated", CreateCardLocators.clickOnNewToAddCardToBoard());
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			findElement(CreateCardLocators.clickOnNewToAddCardToBoard()).click();
			explicitWaitElementBy("elementToBeLocated", CreateCardLocators.enterCardId());
			findElement(CreateCardLocators.enterCardId()).sendKeys("HR"+i);
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCategoryDropDown()));
			findElement(CreateCardLocators.clickOnCategoryDropDown()).click();
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectCategoryFromDropDownValueHr()));
			findElement(CreateCardLocators.selectCategoryFromDropDownValueHr()).click();
			findElement(CreateCardLocators.enterCardId()).sendKeys("HR"+i);
			explicitWaitElementBy("elementToBeLocated", CreateCardLocators.enterCardTitle());
			findElement(CreateCardLocators.enterCardTitle()).sendKeys("Card"+i);
			
			findElement(CreateCardLocators.enterCardDescription()).sendKeys("Human resources is used to describe both the people who work for a company or organization and the department responsible for managing resources related to employees.");
			findElement(CreateCardLocators.enterCardAcceptanceCriteria()).sendKeys("Some companies have strict criteria from the kind of B Schools they hire Human Resource Managers. They don't go beyond those colleges for the hiring.");
			
			scrollinToView(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			findElement(CreateCardLocators.clickOnPrioirtyDropDown()).click();
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectPriorityFromDropDown()));
			findElement(CreateCardLocators.selectPriorityFromDropDown()).click();
			
			findElement(CreateCardLocators.enterEstimationTime()).clear();
			findElement(CreateCardLocators.enterEstimationTime()).sendKeys("10");
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementBy("elementToBeLocated", CreateCardLocators.clickOnCreateButtonForCard());
			findElement(CreateCardLocators.clickOnCreateButtonForCard()).click();
			System.out.print(i+" ");
		}		
		System.out.println();
		
		//CLONE BACKLOG master container card's to In Progress
		
		
		
		
		//Get All Master Container Length
				
		//Get All Master Container Length
		        KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).size();
				System.out.println("Size of all master containers present on Regression kanban board :"+KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard);
						
				//In Progress MasterContainer
				getMasterContainerDynamicWebElementIdinfolder = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
														get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 5).
														getAttribute("id");
				System.out.println("InProgress master container uploadStickerOnKanbanBoardAndApplyOnKanbanCard method, class KanbanBoardRegressionHelper :"+FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMC.getMasterContainerDynamicWebElementIdinfolder);
				
	
		
		
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnBacklogMasterContainerArrow());
		
		findElement(KanbanBoardSettingLocators.clickOnBacklogMasterContainerArrow()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnCloneCardsUnderBacklogMasterContainer());
		findElement(KanbanBoardSettingLocators.clickOnCloneCardsUnderBacklogMasterContainer()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		int hyperJumpCardsTargetBoardFieldSize = findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).size();
		System.out.println("CloneBacklogMasterContainerCardsTo ^^Project P1-Kanban Board1^^ KANBAN BOARD LINE and Sub Window size 125:"+hyperJumpCardsTargetBoardFieldSize);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Select Project dropdown
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-6).click();
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectFolder());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectFolder()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectProject());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectProject()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click On Select Project Board
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-5).click();
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectKanbanBoard());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectKanbanBoard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
		//Click on Select Column
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-4).click();
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectColumnInProgressMasterContainer());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectColumnInProgressMasterContainer()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnCloneCardsButton()));
		findElement(KanbanBoardSettingLocators.clickOnCloneCardsButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		/*
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.alertMessageOnKanbanBoard());
		boolean alertMessageShown = findElement(KanbanBoardSettingLocators.alertMessageOnKanbanBoard()).isDisplayed();
		if(alertMessageShown==true)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOkButtonOnAlertMessage()));
			findElement(KanbanBoardSettingLocators.clickOkButtonOnAlertMessage()).click();
			explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		}
		*/
		
		//CLONE BACKLOG master container card's to Review and Approval master container
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnBacklogMasterContainerArrow());
		findElement(KanbanBoardSettingLocators.clickOnBacklogMasterContainerArrow()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnCloneCardsUnderBacklogMasterContainer());
		findElement(KanbanBoardSettingLocators.clickOnCloneCardsUnderBacklogMasterContainer()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Select Project dropdown
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-6).click();
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectFolder());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectFolder()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectProject());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectProject()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click On Select Project Board
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-5).click();
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectKanbanBoard());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectKanbanBoard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
		//Click on Select Column
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-4).click();
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectColumnInReviewAndApprovalContainer());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectColumnInReviewAndApprovalContainer()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnCloneCardsButton()));
		findElement(KanbanBoardSettingLocators.clickOnCloneCardsButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		/*
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.alertMessageOnKanbanBoard());
		boolean alertMessageShown1 = findElement(KanbanBoardSettingLocators.alertMessageOnKanbanBoard()).isDisplayed();
		if(alertMessageShown1==true)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOkButtonOnAlertMessage()));
			findElement(KanbanBoardSettingLocators.clickOkButtonOnAlertMessage()).click();
			explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		}
		*/
		
		//CLONE BACKLOG master container card's to Done master container
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnBacklogMasterContainerArrow());
		findElement(KanbanBoardSettingLocators.clickOnBacklogMasterContainerArrow()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnCloneCardsUnderBacklogMasterContainer());
		findElement(KanbanBoardSettingLocators.clickOnCloneCardsUnderBacklogMasterContainer()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Select Project dropdown
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-6).click();
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectFolder());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectFolder()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectProject());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectProject()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click On Select Project Board
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-5).click();
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectKanbanBoard());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectKanbanBoard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
		//Click on Select Column
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-4).click();
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectColumnDoneContainer());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectColumnDoneContainer()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnCloneCardsButton()));
		findElement(KanbanBoardSettingLocators.clickOnCloneCardsButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.alertMessageOnKanbanBoard());
		boolean alertMessageShown2 = findElement(KanbanBoardSettingLocators.alertMessageOnKanbanBoard()).isDisplayed();
		if(alertMessageShown2==true)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOkButtonOnAlertMessage()));
			findElement(KanbanBoardSettingLocators.clickOkButtonOnAlertMessage()).click();
			explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		}
		
		
		//CLONE BACKLOG master container card's to Archive master container
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnBacklogMasterContainerArrow());
		findElement(KanbanBoardSettingLocators.clickOnBacklogMasterContainerArrow()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnCloneCardsUnderBacklogMasterContainer());
		findElement(KanbanBoardSettingLocators.clickOnCloneCardsUnderBacklogMasterContainer()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Select Project dropdown
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-6).click();
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectFolder());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectFolder()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectProject());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectProject()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click On Select Project Board
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-5).click();
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectKanbanBoard());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectKanbanBoard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
		//Click on Select Column
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-4).click();
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectColumnArchiveContainer());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.selectColumnArchiveContainer()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnCloneCardsButton()));
		findElement(KanbanBoardSettingLocators.clickOnCloneCardsButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		/*
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.alertMessageOnKanbanBoard());
		boolean alertMessageShown3 = findElement(KanbanBoardSettingLocators.alertMessageOnKanbanBoard()).isDisplayed();
		if(alertMessageShown3==true)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOkButtonOnAlertMessage()));
			findElement(KanbanBoardSettingLocators.clickOkButtonOnAlertMessage()).click();
			explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		}
		
		*/
		
		
		
		//Cards create in inProgress master container with FINANCE
		System.out.print("Now cards create on in progress master container\n");
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddToBoardFan()));
		findElement(CreateCardLocators.clickOnAddToBoardFan()).click();
		for(int j=1; j<=cardLimit; j++)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
			sourceLocator = findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton());
			
			explicitWaitVisibilityOf(findElement(CreateCardLocators.inprogressMasterContainer()));
			WebElement destinationLocator = findElement(CreateCardLocators.inprogressMasterContainer());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			Actions action = new Actions(driver);
			action.dragAndDrop(sourceLocator, destinationLocator).build().perform();
			//action.dragAndDropBy(sourceLocator, 321, 385).build().perform();
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCategoryDropDown()));
			findElement(CreateCardLocators.clickOnCategoryDropDown()).click();
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectCategoryFromDropDownValueFinance()));
			findElement(CreateCardLocators.selectCategoryFromDropDownValueFinance()).click();
			findElement(CreateCardLocators.enterCardId()).sendKeys("Finance"+j);
			findElement(CreateCardLocators.enterCardTitle()).sendKeys("Finance Department"+j);
			findElement(CreateCardLocators.enterCardDescription()).sendKeys("Financial manager: job description. AddThis Sharing Buttons. Financial managers work within the public and private sector where they are responsible for providing financial advice and undertaking related accounts administration. Financial managers are also known as financial or business analysts.");
			findElement(CreateCardLocators.enterCardAcceptanceCriteria()).sendKeys("Microsoft Press defines Acceptance Criteria as �Conditions that a software product must satisfy to be accepted by a user, customer or other stakeholder.� ... These criteria define the boundaries and parameters of a User Story/feature and determine when a story is completed and working as expected.");
			scrollinToView(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			findElement(CreateCardLocators.clickOnPrioirtyDropDown()).click();
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectPriorityFromDropDownMedium()));
			findElement(CreateCardLocators.selectPriorityFromDropDownMedium()).click();
			findElement(CreateCardLocators.enterEstimationTime()).clear();
			findElement(CreateCardLocators.enterEstimationTime()).sendKeys("10");
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCreateButtonForCard()));
			findElement(CreateCardLocators.clickOnCreateButtonForCard()).click();
			System.out.print(j+" ");
		}
		System.out.println();
		
		//Card create in Review and Approve master container with MARKETING
		System.out.print("Now card creates on review and approve master container\n");
		for(int k=1; k<=cardLimit; k++)
		{
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
			sourceLocator = findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton());
			
			explicitWaitVisibilityOf(findElement(CreateCardLocators.reviewAndApproveMasterContainer()));
			WebElement destinationLocator = findElement(CreateCardLocators.reviewAndApproveMasterContainer());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			Actions action = new Actions(driver);
			action.dragAndDrop(sourceLocator, destinationLocator).build().perform();
			//action.dragAndDropBy(sourceLocator, 534, 370).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCategoryDropDown()));
			findElement(CreateCardLocators.clickOnCategoryDropDown()).click();
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectCategoryFromDropDownValueMarketing()));
			findElement(CreateCardLocators.selectCategoryFromDropDownValueMarketing()).click();
			findElement(CreateCardLocators.enterCardId()).sendKeys("Marketing"+k);
			findElement(CreateCardLocators.enterCardTitle()).sendKeys("Marketing Manager"+k);
			findElement(CreateCardLocators.enterCardDescription()).sendKeys("Marketing is the study and management of exchange relationships. Marketing is used to create, keep and satisfy the customer. With the customer as the focus of its activities, it can be concluded that marketing is one of the premier components of business management - the other being innovation.");
			findElement(CreateCardLocators.enterCardAcceptanceCriteria()).sendKeys("The following 5 market segmentation criteria should be useful when planning your own company's market segmentation strategy. A market segment should be: Measurable: Market segments are usually measured in terms of sales value or volume (i.e. the number of customers within the segment).");
			scrollinToView(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			findElement(CreateCardLocators.clickOnPrioirtyDropDown()).click();
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectPriorityFromDropDownLow()));
			findElement(CreateCardLocators.selectPriorityFromDropDownLow()).click();
			findElement(CreateCardLocators.enterEstimationTime()).clear();
			findElement(CreateCardLocators.enterEstimationTime()).sendKeys("15");
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCreateButtonForCard()));
			findElement(CreateCardLocators.clickOnCreateButtonForCard()).click();
			System.out.print(k+" ");
		}
		System.out.println();
		
		//Cards create in Done master container with OPERATION
		System.out.print("Now card creates on Done master container\n");
		for(int i=1; i<=cardLimit; i++)
		{
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
			sourceLocator = findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton());
			
			explicitWaitVisibilityOf(findElement(CreateCardLocators.doneMasterContainer()));
			WebElement destinationLocator = findElement(CreateCardLocators.doneMasterContainer());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			Actions action = new Actions(driver);
			action.dragAndDrop(sourceLocator, destinationLocator).build().perform();
			//action.dragAndDropBy(sourceLocator, 744, 369).build().perform();
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCategoryDropDown()));
			findElement(CreateCardLocators.clickOnCategoryDropDown()).click();
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectCategoryFromDropDownValueOperations()));
			findElement(CreateCardLocators.selectCategoryFromDropDownValueOperations()).click();
			findElement(CreateCardLocators.enterCardId()).sendKeys("Operation"+i);
			findElement(CreateCardLocators.enterCardTitle()).sendKeys("Operation Title"+i);
			findElement(CreateCardLocators.enterCardDescription()).sendKeys("An operations manager is a senior role which involves overseeing the production of goods and/or provision of services. It's an operations manager's job to make sure an organisation is running as well as it possibly can, with a smooth efficient service that meets the expectations and needs of customers and clients.");
			findElement(CreateCardLocators.enterCardAcceptanceCriteria()).sendKeys("Operational requirements are those statements that \"identify the essential capabilities, associated requirements, performance measures, and the process or series of actions to be taken in effecting the results that are desired in order to address mission area deficiencies, evolving applications or threats, emerging technologies, or system cost improvements [1].\" The operational requirements assessment starts with the Concept of Operations (CONOPS) and goes to a greater level of detail in identifying mission performance assumptions and constraints and current deficiencies of or enhancements needed for operations and mission success. Operational requirements are the basis for system requirements.");
			scrollinToView(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			findElement(CreateCardLocators.clickOnPrioirtyDropDown()).click();
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectPriorityFromDropDownMedium()));
			findElement(CreateCardLocators.selectPriorityFromDropDownMedium()).click();
			findElement(CreateCardLocators.enterEstimationTime()).clear();
			findElement(CreateCardLocators.enterEstimationTime()).sendKeys("20");
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCreateButtonForCard()));
			findElement(CreateCardLocators.clickOnCreateButtonForCard()).click();
			System.out.print(i+" ");
		}
		System.out.println();
		
		//Card create in Archive master container with SALES
		System.out.print("Now card creates on Archive master container\n");		
		for(int i=1; i<=cardLimit; i++)
		{
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
			sourceLocator = findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton());
			
			explicitWaitVisibilityOf(findElement(CreateCardLocators.archiveMasterContainer()));
			WebElement destinationLocator = findElement(CreateCardLocators.archiveMasterContainer());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			Actions action = new Actions(driver);
			action.dragAndDrop(sourceLocator, destinationLocator).build().perform();
			//action.dragAndDropBy(sourceLocator, 944, 370).build().perform();
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCategoryDropDown()));
			findElement(CreateCardLocators.clickOnCategoryDropDown()).click();
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectCategoryFromDropDownValueSales()));
			findElement(CreateCardLocators.selectCategoryFromDropDownValueSales()).click();
			findElement(CreateCardLocators.enterCardId()).sendKeys("Sales"+i);
			findElement(CreateCardLocators.enterCardTitle()).sendKeys("Sales Manager"+i);
			findElement(CreateCardLocators.enterCardDescription()).sendKeys("Sales representatives sell retail products, goods and services to customers. ... Sometimes, sales representatives will focus on inside sales, which typically involves \"cold calling\" for new clients while in an office setting, or outside sales, which involves visiting clients in the field with new or existing clients.");
			findElement(CreateCardLocators.enterCardAcceptanceCriteria()).sendKeys("Sales Criteria for Success. Answering the phone. Using their name. Showing an interest. Offering a professional viewpoint/opinion. Not wasting their time (if we can't help them, we should just say). Asking insightful questions. Not having to repeat themselves. Receiving quality and timely information.");
			scrollinToView(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			findElement(CreateCardLocators.clickOnPrioirtyDropDown()).click();
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectPriorityFromDropDown()));
			findElement(CreateCardLocators.selectPriorityFromDropDown()).click();
			findElement(CreateCardLocators.enterEstimationTime()).clear();
			findElement(CreateCardLocators.enterEstimationTime()).sendKeys("25");
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCreateButtonForCard()));
			findElement(CreateCardLocators.clickOnCreateButtonForCard()).click();
			System.out.print(i+" ");
		}
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddToBoardFan()));
		findElement(CreateCardLocators.clickOnAddToBoardFan()).click();
		System.out.println("\n************************************************************************************");
	}

	
	public boolean cardCategory()
	{
		boolean cardCategory = findElement(CreateCardLocators.verifyCardCategory()).isDisplayed();
		System.out.println("Card Category:"+cardCategory);
		return cardCategory;
	}
	
	public boolean cardTitle()
	{
		boolean cardTitle = findElement(CreateCardLocators.verifyCardTitle()).isDisplayed();
		System.out.println("Card Title:"+cardTitle);
		return cardTitle;
	}
	
	public boolean cardDate()
	{
		boolean cardDate = findElement(CreateCardLocators.verifyCardDate()).isDisplayed();
		System.out.println("Card Date:"+cardDate);		
		return cardDate;
	}
	
	public boolean cardId()
	{
		boolean cardId = findElement(CreateCardLocators.verifyCardId()).isDisplayed();
		System.out.println("Card ID:"+cardId);		
		return cardId;
	}
	
	public boolean cardEffort()
	{
		boolean cardEffort = findElement(CreateCardLocators.verifyCardEffort()).isDisplayed();
		System.out.println("Card Effort:"+cardEffort);
		return cardEffort;
	}
	
	
}
	
/*
	public void clickOn_StickerSideColumn()
	{
	
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(CreateCardLocators.addStickerToBoardOrCard()));
		WebElement source = findElement(CreateCardLocators.addStickerToBoardOrCard());
		
		explicitWaitVisibilityOf(findElement(CreateCardLocators.inprogressMasterContainer()));
		WebElement inProgressMasterContainerZone = findElement(CreateCardLocators.inprogressMasterContainer());
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, inProgressMasterContainerZone).build().perform();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		//action.dragAndDropBy(source, 330, 338).build().perform();
		
		String imageName[] = {"download.jpg","download2.png","download3.jpg","download4.jpg"};
		
		//Apply loop from here
		for(int i=0; i<imageName.length; i++)
		{
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnStickerUploaderPlusIcon()));
			findElement(CreateCardLocators.clickOnStickerUploaderPlusIcon()).click();
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.enterNameOnUploadStickerInputField()));
			findElement(CreateCardLocators.enterNameOnUploadStickerInputField()).sendKeys("myUploadedImageOnKanbanBoard999"+i);
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.uploadStickerGlobalFieldCheck()));
			findElement(CreateCardLocators.uploadStickerGlobalFieldCheck()).click();
			
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.chooseFileNameFromDriveForUploadSticker()));
			findElement(CreateCardLocators.chooseFileNameFromDriveForUploadSticker()).sendKeys(filePath+"\\ImageFolder/"+imageName[i]);
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.uploadStickerUploadButton()));
			findElement(CreateCardLocators.uploadStickerUploadButton()).click();
		}
		//End here
		
		try	{
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				robot = new Robot();
			}
		catch (AWTException awtExcp){}
		robot.mouseMove(50,50);
		action.click().build().perform();
		explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddToBoardFan()));
		findElement(CreateCardLocators.clickOnAddToBoardFan()).click();
	}
	
	public boolean verifyStickersOnCard()
	{
		boolean stickerApplyOrNot = false;
		for(int i=1; i<=10; i++)
		{
			stickerApplyOrNot = findElement(By.xpath("//*[contains(@class,'kanbancard ')]//li[@class='sticker']/img["+i+"]")).isDisplayed();
			System.out.println("sticker value of "+i +" : "+stickerApplyOrNot);
		}
		return stickerApplyOrNot;
	}
    }*/