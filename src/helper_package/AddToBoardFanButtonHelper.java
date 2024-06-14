package helper_package;
import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;

import common_package.CommonMethodsOfWebDriver;
import pom_package.AddToBoardFanButtonLocators;
import pom_package.CreateKanbanCardsOnDifferentMasterContainerLocators;
import pom_package.KanbanBoardRegressionLocators;

public class AddToBoardFanButtonHelper extends CommonMethodsOfWebDriver {
	
	


	public static String getIframeSRCAttribute ,childiFrameValue ,getSrcAttributeValueClonedImageWindow ,childiFrameValueOnClonedImageWindow;
	public static int sizeOfLargeText;

	
	//Add To Board Fan Button
	public void addTextToKanbanBoard()
	{
		//**************************************Add text To kanban board***************************************
		try {Thread.sleep(6000);} catch(InterruptedException ie) {}
		
		//Get All Master Container Length
		KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).size();// we can call glv to another class do not require create object we can cll it by using class name only needs it is public and static
		System.out.println("Size of all master containers present on Regression kanban board :"+KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard);
		
		//In Progress MasterContainer
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
																		    get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard -4).
																		    getAttribute("id");
		System.out.println("InProgress master container addTextToKanbanBoard method, class AddToBoardFanButtonHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId);
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.addTextToBoardUnderFanButton());
		actions.moveToElement(findElement(AddToBoardFanButtonLocators.addTextToBoardUnderFanButton())).
		dragAndDrop(findElement(AddToBoardFanButtonLocators.addTextToBoardUnderFanButton()),
		findElement(AddToBoardFanButtonLocators.inprogressMasterContainer())).build().perform();
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		for(int i=1; i<=5; i++)
		{
			explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnPlusButtonToIncreaseFontSize());
			findElement(AddToBoardFanButtonLocators.clickOnPlusButtonToIncreaseFontSize()).click();
		}
		
		//Click on Color dropdown and select text color
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.openColorInputDropDown());
		findElement(AddToBoardFanButtonLocators.openColorInputDropDown()).click();
		int sizeOfColorPicker = findElements(AddToBoardFanButtonLocators.colorDropDownColorPickerList()).size();
		System.out.println("Color picker size LINE 57 :"+sizeOfColorPicker);
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.selectWhiteColorOfTextFromColorDropDown());
		findElement(AddToBoardFanButtonLocators.selectWhiteColorOfTextFromColorDropDown()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Background dropdown and select color for background
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.openBackGroundInputDropDown());
		findElement(AddToBoardFanButtonLocators.openBackGroundInputDropDown()).click();
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.selectBrownColorFromBackGroundDropDown());
		findElement(AddToBoardFanButtonLocators.selectBrownColorFromBackGroundDropDown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.writeSomeTextOnTextAreaField());
		findElement(AddToBoardFanButtonLocators.writeSomeTextOnTextAreaField()).sendKeys("Hey!! This text is written by automated test script.");
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(AddToBoardFanButtonLocators.clickOnCreateButtonForAddImageToKanbanBoard()));
		findElement(AddToBoardFanButtonLocators.clickOnCreateButtonForAddImageToKanbanBoard()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()));
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		
		int sizeOfTextPresentOnBoard = findElements(AddToBoardFanButtonLocators.createTextOnKanbanBoard()).size();
		System.out.println("Count of text present on Kanban board, class AddToBoardFanButton :"+sizeOfTextPresentOnBoard);
		
		boolean addedTextToBoard = findElement(AddToBoardFanButtonLocators.createTextOnKanbanBoard()).isDisplayed();
		System.out.println("Text to kanban board :"+addedTextToBoard);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.createTextOnKanbanBoard());
		
		//Review & Approval Master Container
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
																			get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 3).
																			getAttribute("id");
		System.out.println("Review & Approval master container addTextToKanbanBoard method, class AddToBoardFanButtonHelper :"+
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId+"\n*******************************************************************************************************************");
		
		actions.dragAndDrop(findElement(AddToBoardFanButtonLocators.createTextOnKanbanBoard()),
		findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId))).build().perform();
		
	}
	
	public void clickOn_TextAreaForResize()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnCreatedTextForEdit());
		findElement(AddToBoardFanButtonLocators.clickOnCreatedTextForEdit()).click();
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnResizeForIncreaseTextArea());
		findElement(AddToBoardFanButtonLocators.clickOnResizeForIncreaseTextArea()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.stretchTextAreaForCompletelyVisibleText());
		boolean smallPointerForStretch = findElement(AddToBoardFanButtonLocators.stretchTextAreaForCompletelyVisibleText()).isDisplayed();// small pointer area for resize the text
		System.out.println("smallPointerForStretch LINE 114 :"+smallPointerForStretch+"\n*******************************************************************************************************************");
		//System.out.println("smallpointreforstretch :"+smallPointerForStretch+"\n**************************************************");This is for break the line start frome new line
		
		
		
	    //-------------------actions.dragAndDropBy(source, xOffset, yOffset)
		//-------------------actions.dragAndDrop(source, target)
		
		WebElement stretchTextAreaSource = findElement(AddToBoardFanButtonLocators.stretchTextAreaForCompletelyVisibleText());
		
		actions.dragAndDropBy(stretchTextAreaSource, 100, 100).build().perform();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnCreatedTextForEdit());
		findElement(AddToBoardFanButtonLocators.clickOnCreatedTextForEdit()).click();
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnTextAreaAfterResize());//once again click on resize button
		findElement(AddToBoardFanButtonLocators.clickOnTextAreaAfterResize()).click();
	}
	
	
	public void clickOn_LinkTextToKanbanBoard()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnCreatedTextForEdit());
		findElement(AddToBoardFanButtonLocators.clickOnCreatedTextForEdit()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnLinkIconOnText());
		findElement(AddToBoardFanButtonLocators.clickOnLinkIconOnText()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//get list size of LINK To windows
		int projectSize = findElements(AddToBoardFanButtonLocators.getListOfProjectBoardProjectAndLinkToCardDropDown()).size();
		System.out.println("getListOfProjectBoardProjectAndLinkToCardDropDown :"+projectSize);
		
		//click On Project DropDown
		findElements(AddToBoardFanButtonLocators.getListOfProjectBoardProjectAndLinkToCardDropDown()).get(projectSize-3).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.clickOnFolderWhichWillSelect()));
		findElement(AddToBoardFanButtonLocators.clickOnFolderWhichWillSelect()).click();
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.selectProjectName());
		findElement(AddToBoardFanButtonLocators.selectProjectName()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Link To Project Board DropDown
		findElements(AddToBoardFanButtonLocators.getListOfProjectBoardProjectAndLinkToCardDropDown()).get(projectSize-2).click();
		
		int attempts = 0;
		while(attempts <= 2)
		{
			try 
			{
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.selectKanbanBoard());
				findElement(AddToBoardFanButtonLocators.selectKanbanBoard()).click();
				break;
			}
			catch(StaleElementReferenceException staleElementReferenceException)
			{
				staleElementReferenceException.printStackTrace();
				attempts++;
			}
		}
		System.out.println("number of attempts :"+attempts+"\n*******************************************************************************************************************");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Link To Card DropDown
		findElements(AddToBoardFanButtonLocators.getListOfProjectBoardProjectAndLinkToCardDropDown()).get(projectSize-1).click();
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.selectKanbanCardFromList());
		findElement(AddToBoardFanButtonLocators.selectKanbanCardFromList()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnSaveButtonForLinkTo());
		findElement(AddToBoardFanButtonLocators.clickOnSaveButtonForLinkTo()).click();
	}
	
	
	public void clickOn_TextShuffleToFront()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.addTextToBoardUnderFanButton());
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.inprogressMasterContainer());
		WebElement reviewAndApprovalMasterContainerDestination = findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId));
		
		System.out.println("This is for checking the id for review and master container id value"+reviewAndApprovalMasterContainerDestination);
		System.out.println("Review And Approval Master Container id :"+String.valueOf(reviewAndApprovalMasterContainerDestination));//In Java, String.valueOf() is a method that converts different types of values (such as numbers, characters, booleans, objects, etc.) into their string representations. It is a way to convert non-string data types into strings so that you can concatenate or print them as part of a string.
		
		actions.dragAndDrop(findElement(AddToBoardFanButtonLocators.addTextToBoardUnderFanButton()), 
		findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId))).build().perform();
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Color dropdown and select text color
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.openColorInputDropDown());
		findElement(AddToBoardFanButtonLocators.openColorInputDropDown()).click();
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.selectWhiteColorOfTextFromColorDropDown());
		findElement(AddToBoardFanButtonLocators.selectWhiteColorOfTextFromColorDropDown()).click();
		 
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Background dropdown and select color for background
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.openBackGroundInputDropDown()));
		findElement(AddToBoardFanButtonLocators.openBackGroundInputDropDown()).click();
		try {Thread.sleep(500);}catch(InterruptedException ie) {}
		
		for(int i=1; i<=104; i++)
		{
			actions.moveToElement(findElement(By.xpath("//div[@class='x-container x-panel x-sized x-floating']//div[contains(@class,'x-unsized x-dataview-container')]/div["+i+"]"))).build().perform();
		}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.selectBlackColorFromBackGroundDropDown());
		findElement(AddToBoardFanButtonLocators.selectBlackColorFromBackGroundDropDown()).click();
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.writeSomeTextOnTextAreaField());
		findElement(AddToBoardFanButtonLocators.writeSomeTextOnTextAreaField()).sendKeys("Text For Shuffle.");
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(AddToBoardFanButtonLocators.clickOnCreateButtonForAddImageToKanbanBoard()));
		findElement(AddToBoardFanButtonLocators.clickOnCreateButtonForAddImageToKanbanBoard()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()));
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		WebElement textToBoardSource =  findElement(AddToBoardFanButtonLocators.createTextOnKanbanBoard());
		reviewAndApprovalMasterContainerDestination = findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId));
		actions.dragAndDrop(textToBoardSource, reviewAndApprovalMasterContainerDestination).build().perform();
		
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		sizeOfLargeText = findElements(AddToBoardFanButtonLocators.bothTextAreaXpath()).size();
		System.out.println("Count of large text on kanban board :"+sizeOfLargeText+"\n*******************************************************************************************************************");
		
		findElements(AddToBoardFanButtonLocators.bothTextAreaXpath()).get(sizeOfLargeText-1).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnArrowUpIconForShuffleTextToFront());
		actions.click(findElement(AddToBoardFanButtonLocators.clickOnArrowUpIconForShuffleTextToFront())).build().perform();
	}	
	
	public void clickOn_TextShuffleToBehind()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		findElements(AddToBoardFanButtonLocators.bothTextAreaXpath()).get(sizeOfLargeText-1).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnArrowDownIconForShuffleTextToBehind());
		actions.click(findElement(AddToBoardFanButtonLocators.clickOnArrowDownIconForShuffleTextToBehind())).build().perform();
	}
	
	public void chatterOnFirstlyCreatedText()
	{
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		findElements(AddToBoardFanButtonLocators.bothTextAreaXpath()).get(sizeOfLargeText-1).click();
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnChatterIconOfText());
		findElement(AddToBoardFanButtonLocators.clickOnChatterIconOfText()).click();
		
		try {Thread.sleep(6000);}catch(InterruptedException ie) {}
				
		getIframeSRCAttribute = findElement(AddToBoardFanButtonLocators.inspectIframe()).getAttribute("src");
		System.out.println("getIframeSRCAttribute src attribute value :"+getIframeSRCAttribute);
		
		//driver.switchTo().frame(findElement(AddToBoardFanButtonLocators.iFrameSrcValueAndSwitchTo()));
		driver.switchTo().frame(findElement(AddToBoardFanButtonLocators.iFrameSrcValueAndSwitchTo()));
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.clickOnPostLink()));
		findElement(AddToBoardFanButtonLocators.clickOnPostLink()).click();
		
		explicitWaitElementToBeLocated(AddToBoardFanButtonLocators.afterClickOnPostLinkWindowsVisibility());
		boolean postWindowVisibility = findElement(AddToBoardFanButtonLocators.afterClickOnPostLinkWindowsVisibility()).isDisplayed();
		System.out.println("Post window is visible LINE 287 :"+postWindowVisibility);
		
		if(postWindowVisibility == true)
		{
			explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.inspectChildiFrame());
			childiFrameValue = findElement(AddToBoardFanButtonLocators.inspectChildiFrame()).getAttribute("class");
			System.out.println("Child iFrame class attribute value LINE 293 :"+childiFrameValue);
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			driver.switchTo().frame(findElement(AddToBoardFanButtonLocators.getChildiFrameClassAttributeValue()));
			
			explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnChatterTextArea());
			findElement(AddToBoardFanButtonLocators.clickOnChatterTextArea()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			boolean chatterWindow = findElement(AddToBoardFanButtonLocators.writeOnChatterTextArea()).isDisplayed();
			System.out.println("Chatter Window visibility LINE 303 :"+chatterWindow+"\n*******************************************************************************************************************");
			
			if(chatterWindow == true)
			{
				explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.writeOnChatterTextArea()));
				findElement(AddToBoardFanButtonLocators.writeOnChatterTextArea()).sendKeys("Hello..!! Chatter on Text From Kanban Board.");
				driver.switchTo().parentFrame();
				explicitWaitElementToBeClickable(findElement(AddToBoardFanButtonLocators.chatterShareButton()));
				findElement(AddToBoardFanButtonLocators.chatterShareButton()).click();
				driver.switchTo().parentFrame();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.closeChatterWindow()));
				findElement(AddToBoardFanButtonLocators.closeChatterWindow()).click();
			}
		}
	}
	
	
	public void updateText()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		findElements(AddToBoardFanButtonLocators.bothTextAreaXpath()).get(sizeOfLargeText-1).click();
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnEditPensilIcon());
		findElement(AddToBoardFanButtonLocators.clickOnEditPensilIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		for(int i=1; i<=5; i++)
		{
			explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.increaseTextValueOnEdit());
			findElement(AddToBoardFanButtonLocators.increaseTextValueOnEdit()).click();
		}
		
		//Click on Color dropdown and select text color
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.openColorInputDropDown());
		findElement(AddToBoardFanButtonLocators.openColorInputDropDown()).click();
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.selectRedColorOfTextFromColorDropDown());
		findElement(AddToBoardFanButtonLocators.selectRedColorOfTextFromColorDropDown()).click();
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Background dropdown and select color for background
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.openBackGroundInputDropDown());
		findElement(AddToBoardFanButtonLocators.openBackGroundInputDropDown()).click();
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.selectLightblueColorOfTextFromBackGroundDropDown());
		findElement(AddToBoardFanButtonLocators.selectLightblueColorOfTextFromBackGroundDropDown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.writeSomeTextOnTextAreaField());
		findElement(AddToBoardFanButtonLocators.writeSomeTextOnTextAreaField()).clear();
		findElement(AddToBoardFanButtonLocators.writeSomeTextOnTextAreaField()).sendKeys("Text is Update after performing all operation done.");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnUpdateButtonOfText());
		findElement(AddToBoardFanButtonLocators.clickOnUpdateButtonOfText()).click();
	}
	
	
	
	public void addVisualAnalyticsToKanbanBoard()
	{
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.addVisualAnalytics());
		WebElement addVisualAnalyticsSource = findElement(AddToBoardFanButtonLocators.addVisualAnalytics());
		
		//InProgress Master Container Id
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
																		    get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 4).
																		    getAttribute("id");
		System.out.println("Inprogress master container zone id :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId);
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.inprogressMasterContainer());
		actions.dragAndDrop(addVisualAnalyticsSource, 
		findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId))).build().perform();
		
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.OpenReportNameDropDown());
		findElement(AddToBoardFanButtonLocators.OpenReportNameDropDown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//***************************************************| Add Visual Analytic 60 Days Zone Cycle To Kanban Board |***************************************************
		
		int sizeOfReportNameDropDownValue = findElements(By.xpath("//div[contains(@class,'x-selectFld-allOverlayList')]//div[contains(@style,'translate3d(0px, 0px, 0px);')]//div[contains(@id,'ext-simplelistitem-')]")).size();//this xpath for all the dropdown values
		System.out.println("Report Name List LINE 397 :"+sizeOfReportNameDropDownValue);
		
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)driver;
		
		//Iterate loop till 60 Days Zone Cycle Time value visible and select it
		for(int i=3; i<= sizeOfReportNameDropDownValue; i++)
		{
			javaScriptExecutor.executeScript("arguments[0].scrollIntoView();",
			findElement(By.xpath("//div[contains(@class,'x-selectFld-allOverlayList')]//div[contains(@style,'translate3d(0px, 0px, 0px);')]/div["+i+"]")));
			
			if(i == 44)
			{
				try {Thread.sleep(1500);} catch(InterruptedException ie) {}
				findElement(By.xpath("//div[contains(@class,'x-selectFld-allOverlayList')]//div[contains(@style,'translate3d(0px, 0px, 0px);')]/div["+i+"]")).click();
				break;
			}
		}
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnCreateButtonForAddVisual());
		findElement(AddToBoardFanButtonLocators.clickOnCreateButtonForAddVisual()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		//***************************************************| Add Visual Analytic Burn Down Report To Kanban Board |***************************************************
		
		actions.dragAndDrop(addVisualAnalyticsSource, 
		findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId))).
		build().perform();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnReportNameDropDown());
		findElement(AddToBoardFanButtonLocators.clickOnReportNameDropDown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		for(int i=3; i<=sizeOfReportNameDropDownValue; i++)
		{
			javaScriptExecutor.executeScript("arguments[0].scrollIntoView();",
			findElement(By.xpath("//div[contains(@class,'x-selectFld-allOverlayList')]//div[contains(@style,'translate3d(0px, 0px, 0px);')]/div["+i+"]")));
			
			if(i == 48)
			{
				try {Thread.sleep(1000);} catch(InterruptedException ie) {}
				findElement(By.xpath("//div[contains(@class,'x-selectFld-allOverlayList')]//div[contains(@style,'translate3d(0px, 0px, 0px);')]/div["+i+"]")).click();
				break;
			}
		}
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnCreateButtonForAddVisual());
		findElement(AddToBoardFanButtonLocators.clickOnCreateButtonForAddVisual()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}		
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.createdVisualAnalyticBurnDownReportChart());
		actions.moveToElement(findElement(AddToBoardFanButtonLocators.createdVisualAnalyticBurnDownReportChart())).
		dragAndDrop(findElement(AddToBoardFanButtonLocators.createdVisualAnalyticBurnDownReportChart()),
		findElement(AddToBoardFanButtonLocators.inprogressMasterContainer())).
		build().perform();
		
		//Template MasterContainer Id
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
																			get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 6).
																			getAttribute("id");
		System.out.println("Template master container addVisualAnalyticsToKanbanBoard method, class AddToBoardFanButtonHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId+
		"\n*******************************************************************************************************************");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.createdVisualAnalyticSixtyDayZoneCycleChart());
		actions.moveToElement(findElement(AddToBoardFanButtonLocators.createdVisualAnalyticSixtyDayZoneCycleChart())).
		dragAndDrop(findElement(AddToBoardFanButtonLocators.createdVisualAnalyticSixtyDayZoneCycleChart()),
		findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId))).build().perform();
		
	}
	
	
	public void addImageToKanbanBoard()
	{
		//*********************************************** Add Image to kanban board****************************
		try {Thread.sleep(6000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.addImageToKanbanBoard());
		WebElement addImageToKanbanBoardSource = findElement(AddToBoardFanButtonLocators.addImageToKanbanBoard());
		
		
		
// Copy code from Add TextToBoard
		//Get All Master Container Length
				KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).size();
				System.out.println("Size of all master containers present on Regression kanban board :"+KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard);
				
		
		
		
		
		//InProgress MasterContainer
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
																			get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 4).getAttribute("id");
																			
		System.out.println("InProgress master container addImageToKanbanBoard method, class AddToBoardFanButtonHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId);
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.inprogressMasterContainer());
		actions.dragAndDrop(addImageToKanbanBoardSource,findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId))).build().perform(); 
		
		
		
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		findElement(AddToBoardFanButtonLocators.sendImageToInputField()).sendKeys(filePath+"\\ImageFolder/download6.jpg");
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnUploadButtonForUploadImage());
		findElement(AddToBoardFanButtonLocators.clickOnUploadButtonForUploadImage()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeLocated(AddToBoardFanButtonLocators.clickOnImageAndDrag());
		WebElement createdImageSource = findElement(AddToBoardFanButtonLocators.clickOnImageAndDrag());
		
		//Archive MasterContainer
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
																			get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 1).
																			getAttribute("id");
		System.out.println("Archive master container addImageToKanbanBoard method, class AddToBoardFanButtonHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId+
		"\n*******************************************************************************************************************");
		
		explicitWaitElementToBeLocated(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId));
		actions.dragAndDrop(createdImageSource, findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId)))
		.build().perform();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	
	public void clickOn_LinkIcon()
	{
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnImageAndDrag());
		findElement(AddToBoardFanButtonLocators.clickOnImageAndDrag()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.imageLinkIcon()));
		findElement(AddToBoardFanButtonLocators.imageLinkIcon()).click();
		
		int linkToDropdown = findElements(AddToBoardFanButtonLocators.linkToWindowLinkToProjectBoardCardAndProjectDropdownList()).size();
		System.out.println("ProjectBoard,Project and Card dropdown size LINE 548 :"+linkToDropdown+"\n*******************************************************************************************************************");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Project DropDown
		findElements(AddToBoardFanButtonLocators.linkToWindowLinkToProjectBoardCardAndProjectDropdownList()).get(linkToDropdown-3).click();
		try {Thread.sleep(1300);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnFolderWhichWillSelect());
		findElement(AddToBoardFanButtonLocators.clickOnFolderWhichWillSelect()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.selectProjectNameChild()));
		findElement(AddToBoardFanButtonLocators.selectProjectNameChild()).click();
		
		//Click on Link to Project Board Dropdown
		findElements(AddToBoardFanButtonLocators.linkToWindowLinkToProjectBoardCardAndProjectDropdownList()).get(linkToDropdown-2).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.selectKanbanBoardChild()));
		findElement(AddToBoardFanButtonLocators.selectKanbanBoardChild()).click();
		
		//Click on Link To Card Dropdown
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementToBeVisibleAllListItems(findElements(AddToBoardFanButtonLocators.linkToWindowLinkToProjectBoardCardAndProjectDropdownList()));
		findElements(AddToBoardFanButtonLocators.linkToWindowLinkToProjectBoardCardAndProjectDropdownList()).get(linkToDropdown-1).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.selectKanbanCardChild()));
		findElement(AddToBoardFanButtonLocators.selectKanbanCardChild()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(AddToBoardFanButtonLocators.clickOnSaveButtonLinkToWindow()));
		findElement(AddToBoardFanButtonLocators.clickOnSaveButtonLinkToWindow()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	
	public void clickOn_ImageLockIcon()
	{
		//**********************************Click on Lock icon on Image*********************************
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.clickOnImageAndDrag()));
		findElement(AddToBoardFanButtonLocators.clickOnImageAndDrag()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.clickOnImageLockIcon()));
		findElement(AddToBoardFanButtonLocators.clickOnImageLockIcon()).click();
		
		// Drag Image to InProgress Master Container
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.clickOnImageAndDrag()));
		WebElement imageSource = findElement(AddToBoardFanButtonLocators.clickOnImageAndDrag());
		
		//InProgress MasterContainer
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
																			get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 4).
																			getAttribute("id");
		System.out.println("InProgress master container clickOn_ImageLockIcon method, class AddToBoardFanButtonHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId);
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.inprogressMasterContainer()));
		actions.dragAndDrop(imageSource, findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId))).build().perform();
		
		
		boolean isTrue = findElement(AddToBoardFanButtonLocators.clickOnImageAndDrag()).isDisplayed();
		System.out.println("Created Image :"+isTrue+"\n*******************************************************************************************************************");
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	
	public void clickOn_CloneImage()
	{
		//*******************************Clone Image To kanban Board*****************************
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.clickOnImageAndDrag()));
		findElement(AddToBoardFanButtonLocators.clickOnImageAndDrag()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.clickOnCloneIcon()));
		findElement(AddToBoardFanButtonLocators.clickOnCloneIcon()).click();
		try {Thread.sleep(2500);}catch(InterruptedException ie) {}
	}
	
	
	public void shuffleImageByClickingUpArrowAndDownArrow()
	{
		//**************************Image Shuffle By clicking on UpArrow****************************
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clonedImageChild());
		findElement(AddToBoardFanButtonLocators.clonedImageChild()).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnImageLockIcon());
		findElement(AddToBoardFanButtonLocators.clickOnImageLockIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clonedImageChild());
		WebElement childClonedImageSource = findElement(AddToBoardFanButtonLocators.clonedImageChild());
		
		//Done Master Container
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
																			get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 2).
																			getAttribute("id");
		System.out.println("Done master container shuffleImageByClickingUpArrowAndDownArrow method, class AddToBoardFanButtonHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId+
		"\n*******************************************************************************************************************");
		
		explicitWaitElementBy("elementToBeLocated", By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId));
		actions.dragAndDrop(childClonedImageSource, 
		findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId))).build().perform();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clonedImageChild());
		findElement(AddToBoardFanButtonLocators.clonedImageChild()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.imagePopupDownArrow()));
		findElement(AddToBoardFanButtonLocators.imagePopupDownArrow()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
	}
	
	public void clonedImageResize()
	{
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnImageAndDrag());
		findElement(AddToBoardFanButtonLocators.clickOnImageAndDrag()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.imageResizeIcon()));
		findElement(AddToBoardFanButtonLocators.imageResizeIcon()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		//explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.cloneImageSmallDivForResize()));
		WebElement stretch=findElement(AddToBoardFanButtonLocators.cloneImageSmallDivForResize());//clicking on stretch area for resize the image
		actions.dragAndDropBy(stretch, 100, 100);
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.clickOnImageAndDrag()));
		findElement(AddToBoardFanButtonLocators.clickOnImageAndDrag()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.imageResizeIcon()));
		findElement(AddToBoardFanButtonLocators.imageResizeIcon()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
	}
	
	public void chatterOnClonedImage()
	{	
		//***************************Chatter on Cloned Image**************************************
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnImageAndDrag());
		findElement(AddToBoardFanButtonLocators.clickOnImageAndDrag()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.imageChatterIcon());
		findElement(AddToBoardFanButtonLocators.imageChatterIcon()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		try {Thread.sleep(1200);}catch(InterruptedException ie) {}
		
		//Chatter on text area
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.inspectiFrameOnChatterWindowOfClonedImage());
		getSrcAttributeValueClonedImageWindow = findElement(AddToBoardFanButtonLocators.inspectiFrameOnChatterWindowOfClonedImage()).getAttribute("src");
		System.out.println("Cloned image sub window iFrame src value LINE 706 :"+getSrcAttributeValueClonedImageWindow);
		
		driver.switchTo().frame(findElement(AddToBoardFanButtonLocators.getParentiFramexPath()));
		try {Thread.sleep(3000);} catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnPostLinkOnChatterWindow());
		findElement(AddToBoardFanButtonLocators.clickOnPostLinkOnChatterWindow()).click();
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.afterClickOnPostLinkWindowsVisibility());
		boolean postWindowVisibility = findElement(AddToBoardFanButtonLocators.afterClickOnPostLinkWindowsVisibility()).isDisplayed();
		System.out.println("After click on post, window is visible LINE 715 :"+postWindowVisibility);
		
		if(postWindowVisibility == true)
		{
			explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.inspectChildiFrame());
			childiFrameValueOnClonedImageWindow = findElement(AddToBoardFanButtonLocators.inspectChildiFrame()).getAttribute("class");
			System.out.println("Child iFrame class attribute value LINE 721 :"+childiFrameValueOnClonedImageWindow);
			
			driver.switchTo().frame(findElement(AddToBoardFanButtonLocators.chatterTextAreaiFramexPath()));
			
			explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnChatterTextArea());
			findElement(AddToBoardFanButtonLocators.clickOnChatterTextArea()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			boolean chatterWindow = findElement(AddToBoardFanButtonLocators.writeOnChatterTextArea()).isDisplayed();
			System.out.println("Chatter Window visibility LINE 730 :"+chatterWindow+"\n***************************************************************************************************************");
			
			if(chatterWindow == true)
			{
				explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.writeOnChatterTextArea());
				findElement(AddToBoardFanButtonLocators.writeOnChatterTextArea()).sendKeys("Hello..!! Chatter on cloned image For Kanban Board.");
				driver.switchTo().parentFrame();
				explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.chatterShareButton());
				findElement(AddToBoardFanButtonLocators.chatterShareButton()).click();
				driver.switchTo().parentFrame();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.closeChatterWindow());
				findElement(AddToBoardFanButtonLocators.closeChatterWindow()).click();
			}
		}
		try {Thread.sleep(3000);} catch(InterruptedException ie) {}
	}
	
	
	public void addKanbanCardToKanbanBoard()
	{

		//*******************************Add Kanban Card to Kanban Board******************************
		
	explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		
		/*	explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.addKanbanCardToBoard());
		WebElement addCardToBoardSource = findElement(AddToBoardFanButtonLocators.addKanbanCardToBoard());
		
		//InProgress Master Container
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
																			get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 4).
																			getAttribute("id");
		System.out.println("InProgress master container addKanbanCardToKanbanBoard method, class AddToBoardFanButtonHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId+
		"\n*******************************************************************************************************************");
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.inprogressMasterContainer());
		
		actions.dragAndDrop(addCardToBoardSource,findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId))).build().perform(); 
		
		*/
		
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddCardToBoardUnderFanButton()));
		WebElement sourceLocator = findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddCardToBoardUnderFanButton());
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.inprogressMasterContainer()));
		WebElement destinationLocator = findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.inprogressMasterContainer());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceLocator, destinationLocator).build().perform();
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.categoryDropdownOnKanbanCard());
		findElement(AddToBoardFanButtonLocators.categoryDropdownOnKanbanCard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.selectCategoryFromDropdown());
		findElement(AddToBoardFanButtonLocators.selectCategoryFromDropdown()).click();
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.enterCardId());
		findElement(AddToBoardFanButtonLocators.enterCardId()).sendKeys("Hr001");
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.enterCardTitle());
		findElement(AddToBoardFanButtonLocators.enterCardTitle()).sendKeys("Demo Kanban Card.");
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.enterCardDescription());
		findElement(AddToBoardFanButtonLocators.enterCardDescription()).sendKeys("Create kanban Card using drag and drop from ADD TO BOARD FAN.");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnCreateButton());
		findElement(AddToBoardFanButtonLocators.clickOnCreateButton()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	
	public void uploadStickerOnKanbanBoard()
	{
		//**************************Upload Sticker on kanban Board***********************
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.dragToAddStickerOnBoard());
		WebElement addStickerToCardSource = findElement(AddToBoardFanButtonLocators.dragToAddStickerOnBoard());
		
	/*	explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.inprogressMasterContainer());
		actions.dragAndDrop(addStickerToCardSource, 
		findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId))).build().perform();
		*/
		
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.inprogressMasterContainer()));
		WebElement destinationLocator = findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.inprogressMasterContainer());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		Actions action = new Actions(driver);
		action.dragAndDrop(addStickerToCardSource, destinationLocator).build().perform();
		
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnPlusIconForStickerUpload());
		findElement(AddToBoardFanButtonLocators.clickOnPlusIconForStickerUpload()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.uploadStickerWindowNameInputField());
		findElement(AddToBoardFanButtonLocators.uploadStickerWindowNameInputField()).sendKeys("Image1");
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		findElement(AddToBoardFanButtonLocators.inputFieldForImageUpload()).sendKeys(filePath+"\\ImageFolder/download4.jpg");
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnUploadButtonStickerWindow());
		findElement(AddToBoardFanButtonLocators.clickOnUploadButtonStickerWindow()).click();
		
		try
		{
			robot = new Robot();
		}
		catch(AWTException awtExp) {}
		Actions act=new Actions(driver);
		robot.mouseMove(50,50);
		act.click().build().perform();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
}