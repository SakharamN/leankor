package helper_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import common_package.CommonMethodsOfWebDriver;
import pom_package.AddToBoardFanButtonLocators;
import pom_package.CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator;
import pom_package.KanbanBoardRegressionLocators;
import pom_package.KanbanBoardSettingLocators;
import pom_package.ToCheckingHeaderButtonsOnCalendarViewLocator;
import pom_package.WhiteBoardRegressionLocators;




public class WhiteBoardRegressionHelper extends CommonMethodsOfWebDriver {

	public String cardStartDateWhileCreating;
	public static String getWhiteBoardWindowHandleValue;
	public String getCardDuedate;
	public String getUpdatedCardDuedate;
	
	
	public void createFolderProjectValueStream()
	{
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnFolderIcon()));
		findElement(KanbanBoardRegressionLocators.clickOnFolderIcon()).click();
		
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.enterFolderName());
		findElement(KanbanBoardRegressionLocators.enterFolderName()).sendKeys("Regression Folder");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnAddButton()));
		findElement(KanbanBoardRegressionLocators.clickOnAddButton()).click();
		
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.clickOnCreatedFolder());
		findElement(KanbanBoardRegressionLocators.clickOnCreatedFolder()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnThreeDots()));
		findElement(KanbanBoardRegressionLocators.clickOnThreeDots()).click();
		
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.clickOnAddProject());
		findElement(KanbanBoardRegressionLocators.clickOnAddProject()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterProjectName()));
		findElement(KanbanBoardRegressionLocators.enterProjectName()).sendKeys("Regression Project");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnProjectAddButton()));
		findElement(KanbanBoardRegressionLocators.clickOnProjectAddButton()).click();
		
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.clickOnCreatedProject());
		findElement(KanbanBoardRegressionLocators.clickOnCreatedProject()).click();
				
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnProjectSetupUnderCreatedProject()));
		findElement(KanbanBoardRegressionLocators.clickOnProjectSetupUnderCreatedProject()).click();
		
		switchToiFrame("boardIfram");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.checkAssignActivityResourceUnderProjectSetup()));
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.checkAssignActivityResourceUnderProjectSetup())).click().build().perform();
		
		actions.sendKeys(Keys.END).build().perform();
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.checkRollupCheckBox()));
		findElement(KanbanBoardRegressionLocators.checkRollupCheckBox()).click();
		
		explicitWaitElementToBeVisibleAllListItems(findElements(KanbanBoardRegressionLocators.clickOnSaveButtonForProjectSetup()));
		int saveButtonCount = findElements(KanbanBoardRegressionLocators.clickOnSaveButtonForProjectSetup()).size();
		findElements(KanbanBoardRegressionLocators.clickOnSaveButtonForProjectSetup()).get(saveButtonCount-2).click();
		
		//this line is for success message appears or not
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.projectSetupSaveSuccessMessageAfterSave()));
		boolean projectSetupSettingSuccessfullSave = findElement(KanbanBoardRegressionLocators.projectSetupSaveSuccessMessageAfterSave()).isDisplayed();
		System.out.println("Project setup successfull save message LINE 82 : "+projectSetupSettingSuccessfullSave);
		
		driver.switchTo().parentFrame();
		
		if(projectSetupSettingSuccessfullSave==true)
		{
			boolean navScroller = findElement(KanbanBoardRegressionLocators.clickOn_NavIconScroller()).isDisplayed();
			System.out.println("Nav scroller : "+navScroller+"\n***************************************************************************************");
			actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOn_NavIconScroller())).click().build().perform();
		}
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	
	public void addTextToOnWhiteBoard()
	{
		driver.switchTo().window(KanbanBoardRegressionHelper.handleValueOfKanbanBoardiFrameWindow);		//uncomment this 5 lines piece of code when run script from start kanbanRegression
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOn_NavIconScroller());
		findElement(KanbanBoardRegressionLocators.clickOn_NavIconScroller()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnWhiteBoardThreeDots());
		findElement(WhiteBoardRegressionLocators.clickOnWhiteBoardThreeDots()).click();
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.createWhiteBoard());
		findElement(WhiteBoardRegressionLocators.createWhiteBoard()).click();
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.enterWhiteBoardName());
		findElement(WhiteBoardRegressionLocators.enterWhiteBoardName()).sendKeys("White Board Regression");
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnWhiteBoardAddButton());
		findElement(WhiteBoardRegressionLocators.clickOnWhiteBoardAddButton()).click();
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.openWhiteBoard());
		findElement(WhiteBoardRegressionLocators.openWhiteBoard()).click();
		
		switchToiFrame("boardIfram");
		
		boolean loadMask = findElement(WhiteBoardRegressionLocators.whiteBoardLoadMask()).isDisplayed();
		System.out.print("\n************************************************************************************************\nWhite Board loader LINE 124:"+loadMask);
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnWhiteBoardZoomIcon());
		findElement(WhiteBoardRegressionLocators.clickOnWhiteBoardZoomIcon()).click();
		
		for(String whiteBoardWindowHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(whiteBoardWindowHandle);
		}
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		int attempts=1;
		boolean result=false;
		while(attempts<=5)
		{
			try
			{
				explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
				findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
				result = true;
				System.out.println("\nAdd to board is clickable in "+attempts+" attempt:"+result);
				break;
			}
			catch(WebDriverException webDriverExp) {
				attempts++;
			}
		}
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.addTextToWhiteBoard());
		actions.dragAndDrop(findElement(WhiteBoardRegressionLocators.addTextToWhiteBoard()), findElement(WhiteBoardRegressionLocators.whiteBoardBackground())).build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		for(int i=1; i<=5; i++)
		{
			findElement(WhiteBoardRegressionLocators.increaseFontSize()).click();
		}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.openBackGroundInputDropDown());
		findElement(AddToBoardFanButtonLocators.openBackGroundInputDropDown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.selectColorFromBackgroundInput()); 
		findElement(WhiteBoardRegressionLocators.selectColorFromBackgroundInput()).click(); 
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.enterTextAreaField());
		findElement(WhiteBoardRegressionLocators.enterTextAreaField()).sendKeys("Text written on white board.");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(WhiteBoardRegressionLocators.clickOnCreateButton()));
		findElement(WhiteBoardRegressionLocators.clickOnCreateButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.firstTextCreatedOnWhiteBoard());
		actions.dragAndDropBy(findElement(WhiteBoardRegressionLocators.firstTextCreatedOnWhiteBoard()), 152, -243).build().perform();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	public boolean isTextToBoardVisible()
	{
		boolean isTextVisible = findElement(WhiteBoardRegressionLocators.firstTextCreatedOnWhiteBoard()).isDisplayed();
		System.out.println("Text on white board visibility:"+isTextVisible);
		return isTextVisible;
	}
	
	
	public void linkWhiteBoardTextToKanbanBoardCard()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.firstTextCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.firstTextCreatedOnWhiteBoard()).click();
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnTextLinkIcon());
		findElement(WhiteBoardRegressionLocators.clickOnTextLinkIcon()).click();
		
		int linkToWindowDropdownSize = findElements(AddToBoardFanButtonLocators.getListOfProjectBoardProjectAndLinkToCardDropDown()).size();
		System.out.println("link to Window dropdown size:"+linkToWindowDropdownSize);
		
		//click On Project DropDown
		findElements(AddToBoardFanButtonLocators.getListOfProjectBoardProjectAndLinkToCardDropDown()).get(linkToWindowDropdownSize-3).click();
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.clickOnFolderWhichWillSelect()));
		findElement(AddToBoardFanButtonLocators.clickOnFolderWhichWillSelect()).click();
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.selectProjectName());
		findElement(WhiteBoardRegressionLocators.selectProjectName()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Link To Project Board DropDown
		findElements(AddToBoardFanButtonLocators.getListOfProjectBoardProjectAndLinkToCardDropDown()).get(linkToWindowDropdownSize-2).click();
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.selectKanbanBoardChild()));
		findElement(AddToBoardFanButtonLocators.selectKanbanBoardChild()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Link To Card DropDown
		findElements(AddToBoardFanButtonLocators.getListOfProjectBoardProjectAndLinkToCardDropDown()).get(linkToWindowDropdownSize-1).click();
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.selectKanbanCardFromList());
		findElement(WhiteBoardRegressionLocators.selectKanbanCardFromList()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(WhiteBoardRegressionLocators.linkToWindowSaveButtonOnWhiteBoard()));
		findElement(WhiteBoardRegressionLocators.linkToWindowSaveButtonOnWhiteBoard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	public void resizeTextOnWhiteBoard()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.firstTextCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.firstTextCreatedOnWhiteBoard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(AddToBoardFanButtonLocators.clickOnResizeForIncreaseTextArea()));
		findElement(AddToBoardFanButtonLocators.clickOnResizeForIncreaseTextArea()).click();
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.stretchTextAreaForCompletelyVisibleText()));
		boolean smallPointerForStretch = findElement(AddToBoardFanButtonLocators.stretchTextAreaForCompletelyVisibleText()).isDisplayed();
		System.out.println("smallPointerForStretch is visible LINE 260:"+smallPointerForStretch);
		
		WebElement stretchTextAreaSource = findElement(AddToBoardFanButtonLocators.stretchTextAreaForCompletelyVisibleText());
		actions.dragAndDropBy(stretchTextAreaSource, 100, 100).build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.firstTextCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.firstTextCreatedOnWhiteBoard()).click();
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.clickOnTextAreaAfterResize()));
		findElement(AddToBoardFanButtonLocators.clickOnTextAreaAfterResize()).click();
	}
	
	public void shuffleTextUpOnWhiteBoard()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.addTextToWhiteBoard());
		actions.dragAndDrop(findElement(WhiteBoardRegressionLocators.addTextToWhiteBoard()), findElement(WhiteBoardRegressionLocators.whiteBoardBackground())).build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Color dropdown and select text color
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.openColorInputDropDown()));
		findElement(AddToBoardFanButtonLocators.openColorInputDropDown()).click();
		findElement(AddToBoardFanButtonLocators.selectWhiteColorOfTextFromColorDropDown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Background dropdown and select color for background
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.openBackGroundInputDropDown()));
		findElement(AddToBoardFanButtonLocators.openBackGroundInputDropDown()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		for(int i=1; i<=104; i++)
		{
			actions.moveToElement(findElement(By.xpath("//div[@class='x-container x-panel x-sized x-floating']//div[contains(@class,'x-unsized x-dataview-container')]/div["+i+"]"))).build().perform();
		}
		
		explicitWaitVisibilityOf(findElement(WhiteBoardRegressionLocators.selectBlackColorFromBackgroundColorDropdown()));
		findElement(WhiteBoardRegressionLocators.selectBlackColorFromBackgroundColorDropdown()).click();
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.writeSomeTextOnTextAreaField()));
		findElement(AddToBoardFanButtonLocators.writeSomeTextOnTextAreaField()).sendKeys("Text For Shuffle.");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(AddToBoardFanButtonLocators.clickOnCreateButtonForAddImageToKanbanBoard()));
		findElement(AddToBoardFanButtonLocators.clickOnCreateButtonForAddImageToKanbanBoard()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()));
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.secondTextCreatedOnWhiteBoard());
		actions.dragAndDropBy(findElement(WhiteBoardRegressionLocators.secondTextCreatedOnWhiteBoard()), 152 , -243).build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.firstTextCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.firstTextCreatedOnWhiteBoard()).click();
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnUpArrow());
		findElement(WhiteBoardRegressionLocators.clickOnUpArrow()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.firstTextCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.firstTextCreatedOnWhiteBoard()).click();
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnDownArrow());
		findElement(WhiteBoardRegressionLocators.clickOnDownArrow()).click();
	}
	
	public void chatterOnFirstTextOnWhiteBoard()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.secondTextCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.secondTextCreatedOnWhiteBoard()).click();
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.clickOnChatterIconOfText()));
		findElement(AddToBoardFanButtonLocators.clickOnChatterIconOfText()).click();
		
		try {Thread.sleep(5000);}catch(InterruptedException ie) {}
				
		AddToBoardFanButtonHelper.getIframeSRCAttribute = findElement(AddToBoardFanButtonLocators.inspectIframe()).getAttribute("src");
		System.out.println("src:"+AddToBoardFanButtonHelper.getIframeSRCAttribute);
		
		driver.switchTo().frame(findElement(AddToBoardFanButtonLocators.iFrameSrcValueAndSwitchTo()));
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.clickOnPostLink()));
		findElement(AddToBoardFanButtonLocators.clickOnPostLink()).click();
		
		explicitWaitElementToBeLocated(AddToBoardFanButtonLocators.afterClickOnPostLinkWindowsVisibility());
		boolean postWindowVisibility = findElement(AddToBoardFanButtonLocators.afterClickOnPostLinkWindowsVisibility()).isDisplayed();
		System.out.println("Post window is visible LINE 363:"+postWindowVisibility);
		
		if(postWindowVisibility==true)
		{	
			AddToBoardFanButtonHelper.childiFrameValue = findElement(AddToBoardFanButtonLocators.inspectChildiFrame()).getAttribute("class");
			System.out.println("Child iFrame classs attribute value :"+AddToBoardFanButtonHelper.childiFrameValue);
			
			driver.switchTo().frame(findElement(AddToBoardFanButtonLocators.getChildiFrameClassAttributeValue()));
			
			explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnChatterTextArea());
			findElement(AddToBoardFanButtonLocators.clickOnChatterTextArea()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			boolean chatterWindow = findElement(AddToBoardFanButtonLocators.writeOnChatterTextArea()).isDisplayed();
			System.out.println("Chatter Window visibility LINE 377:"+chatterWindow);
			
			if(chatterWindow=true)
			{
				explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.writeOnChatterTextArea()));
				findElement(AddToBoardFanButtonLocators.writeOnChatterTextArea()).sendKeys("Hello..!! Chatter on Text From White Board.");
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
	
	
	public void updateFirstTextOfWhiteBoard()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.secondTextCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.secondTextCreatedOnWhiteBoard()).click();
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.clickOnEditPensilIcon()));
		findElement(AddToBoardFanButtonLocators.clickOnEditPensilIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		for(int i=1; i<=5; i++)
		{
			explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.increaseTextValueOnEdit()));
			findElement(AddToBoardFanButtonLocators.increaseTextValueOnEdit()).click();
		}
		
		//Click on Color dropdown and select text color
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.openColorInputDropDown()));
		findElement(AddToBoardFanButtonLocators.openColorInputDropDown()).click();
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.selectRedColorOfTextFromColorDropDown()));
		findElement(AddToBoardFanButtonLocators.selectRedColorOfTextFromColorDropDown()).click();
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Background dropdown and select color for background
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.openBackGroundInputDropDown()));
		findElement(AddToBoardFanButtonLocators.openBackGroundInputDropDown()).click();
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.selectLightblueColorOfTextFromBackGroundDropDown()));
		findElement(AddToBoardFanButtonLocators.selectLightblueColorOfTextFromBackGroundDropDown()).click();
				
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.writeSomeTextOnTextAreaField()));
		findElement(AddToBoardFanButtonLocators.writeSomeTextOnTextAreaField()).clear();
		findElement(AddToBoardFanButtonLocators.writeSomeTextOnTextAreaField()).sendKeys("Text is Update after performing all operation done.");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(AddToBoardFanButtonLocators.clickOnUpdateButtonOfText()));
		findElement(AddToBoardFanButtonLocators.clickOnUpdateButtonOfText()).click();
	}
	
	
	public void deleteBothTextFromWhiteBoard()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.secondTextCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.secondTextCreatedOnWhiteBoard()).click();
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnDeleteTextOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.clickOnDeleteTextOnWhiteBoard()).click();
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.yesButtonAfterDelete());
		findElement(WhiteBoardRegressionLocators.yesButtonAfterDelete()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.firstTextCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.firstTextCreatedOnWhiteBoard()).click();
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnDeleteTextOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.clickOnDeleteTextOnWhiteBoard()).click();
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.yesButtonAfterDelete());
		findElement(WhiteBoardRegressionLocators.yesButtonAfterDelete()).click();
	}
	
	
	public void addVisualAnalyticsOnWhiteBoard()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		int attempts=1;
		boolean result=false;
		while(attempts<=5)
		{
			try
			{
				explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
				findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
				result = true;
				System.out.println("Add to board is clickable in "+attempts+" attempt: "+result);
				break;
			}
			catch(WebDriverException webDriverExp) {
				attempts++;
			}
		}
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.addVisualAnalytics()));
		actions.dragAndDropBy(findElement(AddToBoardFanButtonLocators.addVisualAnalytics()), 152, -243).build().perform();
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		
		try {Thread.sleep(6000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(WhiteBoardRegressionLocators.clickOnReportNameDropdown()));
		findElement(WhiteBoardRegressionLocators.clickOnReportNameDropdown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		int sizeOfReportNameDropDownValue = findElements(By.xpath("//div[contains(@class,'x-selectFld-allOverlayList')]//div[@class='x-inner x-size-monitored x-paint-monitored x-scroll-scroller']/div")).size();
		System.out.println("Report Name List LINE 501:-"+sizeOfReportNameDropDownValue);
		
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		
		//iterate loop till 60 days zone cycle time value visible
		for(int i=3; i<=sizeOfReportNameDropDownValue; i++)
		{
			jss.executeScript("arguments[0].scrollIntoView();", findElement(By.xpath("//div[contains(@class,'x-selectFld-allOverlayList')]//div[@class='x-inner x-size-monitored x-paint-monitored x-scroll-scroller']/div["+i+"]")));
		}
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(WhiteBoardRegressionLocators.selectSixtyDayZoneCycleTimeFromReportNameDropDown()));
		findElement(WhiteBoardRegressionLocators.selectSixtyDayZoneCycleTimeFromReportNameDropDown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(AddToBoardFanButtonLocators.clickOnCreateButtonForAddVisual()));
		findElement(AddToBoardFanButtonLocators.clickOnCreateButtonForAddVisual()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.visualAnalyticChartToolbar());
		actions.dragAndDropBy(findElement(WhiteBoardRegressionLocators.visualAnalyticChartToolbar()), 152, -243).build().perform();
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.visualAnalyticOptionButton());
		findElement(WhiteBoardRegressionLocators.visualAnalyticOptionButton()).click();
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.resizeVisualAnalyticChartIcon());
		findElement(WhiteBoardRegressionLocators.resizeVisualAnalyticChartIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.resizeVisualChartToolPoint());
		actions.dragAndDropBy(findElement(WhiteBoardRegressionLocators.resizeVisualChartToolPoint()), 100, 100).build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.visualAnalyticOptionButton());
		findElement(WhiteBoardRegressionLocators.visualAnalyticOptionButton()).click();
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.resizeVisualAnalyticChartIcon());
		findElement(WhiteBoardRegressionLocators.resizeVisualAnalyticChartIcon()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	
	public void cloneVisualAnalyticChart()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.visualAnalyticOptionButton());
		findElement(WhiteBoardRegressionLocators.visualAnalyticOptionButton()).click();
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.cloneVisualAnalyticIcon());
		findElement(WhiteBoardRegressionLocators.cloneVisualAnalyticIcon()).click();
	}
	
	
	public void delectVisualAnalytics()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnVisualAnalyticChartFirst());
		findElement(WhiteBoardRegressionLocators.clickOnVisualAnalyticChartFirst()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.deleteVisualAnalyticChart());
		findElement(WhiteBoardRegressionLocators.deleteVisualAnalyticChart()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.yesButtonAfterDelete());
		findElement(WhiteBoardRegressionLocators.yesButtonAfterDelete()).click(); 
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnVisualAnalyticChartSecond());
		findElement(WhiteBoardRegressionLocators.clickOnVisualAnalyticChartSecond()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.deleteVisualAnalyticChart());
		findElement(WhiteBoardRegressionLocators.deleteVisualAnalyticChart()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.yesButtonAfterDelete());
		findElement(WhiteBoardRegressionLocators.yesButtonAfterDelete()).click();
	}
	
	
	public void addImageToWhiteBoard()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.addImageToKanbanBoard()));
		actions.dragAndDropBy(findElement(AddToBoardFanButtonLocators.addImageToKanbanBoard()) ,152 ,-243).build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.sendImageToInputField()));
		findElement(AddToBoardFanButtonLocators.sendImageToInputField()).sendKeys("E:\\Wallpaper/download.jpg");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(AddToBoardFanButtonLocators.clickOnUploadButtonForUploadImage()));
		findElement(AddToBoardFanButtonLocators.clickOnUploadButtonForUploadImage()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard());
		actions.dragAndDropBy(findElement(WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard()), 152, -243).build().perform();
	}
	
	public void cloneImageOnWhiteBoard()
	{
		try {Thread.sleep(2000);}catch (InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.clickOnCloneIcon()));
		findElement(AddToBoardFanButtonLocators.clickOnCloneIcon()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	public void resizeImageOnWhiteBoard()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.imageResizeIcon()));
		findElement(AddToBoardFanButtonLocators.imageResizeIcon()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.cloneImageSmallDivForResize()));
		actions.dragAndDropBy(findElement(AddToBoardFanButtonLocators.cloneImageSmallDivForResize()), 100, 100).build().perform();
		System.out.println("resize done on LINE 640");
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.cloneImageSmallDivForResize()));
		findElement(AddToBoardFanButtonLocators.cloneImageSmallDivForResize()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard()).click(); 
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.imageResizeIcon()));
		findElement(AddToBoardFanButtonLocators.imageResizeIcon()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	public void shuffleImageUpAndDownOnWhiteBoard()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard()).click();
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.imagePopupUpArrow()));
		findElement(AddToBoardFanButtonLocators.imagePopupUpArrow()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.imagePopupDownArrow()));
		findElement(AddToBoardFanButtonLocators.imagePopupDownArrow()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	public void chatterOnFirstImage()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard()).click();
		
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.imageChatterIcon()));
		findElement(AddToBoardFanButtonLocators.imageChatterIcon()).click();
		
		try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		//Chatter on text area
		
		AddToBoardFanButtonHelper.getSrcAttributeValueClonedImageWindow = findElement(AddToBoardFanButtonLocators.inspectiFrameOnChatterWindowOfClonedImage()).getAttribute("src");
		System.out.println("Cloned image sub window iFrame src value LINE 686 :-"+AddToBoardFanButtonHelper.getSrcAttributeValueClonedImageWindow);
		
		driver.switchTo().frame(findElement(AddToBoardFanButtonLocators.getParentiFramexPath()));
		 
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.clickOnPostLinkOnChatterWindow()));
		findElement(AddToBoardFanButtonLocators.clickOnPostLinkOnChatterWindow()).click();
		
		explicitWaitElementToBeLocated(AddToBoardFanButtonLocators.afterClickOnPostLinkWindowsVisibility());
		boolean postWindowVisibility = findElement(AddToBoardFanButtonLocators.afterClickOnPostLinkWindowsVisibility()).isDisplayed();
		System.out.println("Post window is visible LINE 695:"+postWindowVisibility);
		
		if(postWindowVisibility==true)
		{
			AddToBoardFanButtonHelper.childiFrameValueOnClonedImageWindow = findElement(AddToBoardFanButtonLocators.inspectChildiFrame()).getAttribute("class");
			System.out.println("Child iFrame classs attribute value LINE 700:"+AddToBoardFanButtonHelper.childiFrameValueOnClonedImageWindow);
			
			driver.switchTo().frame(findElement(AddToBoardFanButtonLocators.chatterTextAreaiFramexPath()));
			
			explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.clickOnChatterTextArea()));
			findElement(AddToBoardFanButtonLocators.clickOnChatterTextArea()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			boolean chatterWindow = findElement(AddToBoardFanButtonLocators.writeOnChatterTextArea()).isDisplayed();
			System.out.println("Chatter Window visibility LINE 709:"+chatterWindow);
			System.out.println("***************************************************************************************************************");
			
			if(chatterWindow==true)
			{
				explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.writeOnChatterTextArea()));
				findElement(AddToBoardFanButtonLocators.writeOnChatterTextArea()).sendKeys("Hello..!! Chatter on cloned image For White Board.");
				driver.switchTo().parentFrame();
				explicitWaitElementToBeClickable(findElement(AddToBoardFanButtonLocators.chatterShareButton()));
				findElement(AddToBoardFanButtonLocators.chatterShareButton()).click();
				driver.switchTo().parentFrame();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.closeChatterWindow()));
				findElement(AddToBoardFanButtonLocators.closeChatterWindow()).click();
			}
		}
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	
	public void linkImageToCard()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard()).click();
		
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.imageLinkIcon()));
		findElement(AddToBoardFanButtonLocators.imageLinkIcon()).click();
		
		int linkToSubWindowDropdown = findElements(AddToBoardFanButtonLocators.linkToWindowLinkToProjectBoardCardAndProjectDropdownList()).size();
		System.out.println("Project,Link to Project Board and Link to Card dropdown size LINE 739:"+linkToSubWindowDropdown);
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		//Click on Project DropDown
		findElements(AddToBoardFanButtonLocators.linkToWindowLinkToProjectBoardCardAndProjectDropdownList()).get(linkToSubWindowDropdown-3).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnFolderWhichWillSelect());
		findElement(AddToBoardFanButtonLocators.clickOnFolderWhichWillSelect()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.selectProjectNameChild()));
		findElement(AddToBoardFanButtonLocators.selectProjectNameChild()).click();
		
		//Click on Link to Project Board Dropdown
		findElements(AddToBoardFanButtonLocators.linkToWindowLinkToProjectBoardCardAndProjectDropdownList()).get(linkToSubWindowDropdown-2).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddToBoardFanButtonLocators.selectKanbanBoardChild()));
		findElement(AddToBoardFanButtonLocators.selectKanbanBoardChild()).click();
		
		//Click on Link To Card Dropdown
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementToBeVisibleAllListItems(findElements(AddToBoardFanButtonLocators.linkToWindowLinkToProjectBoardCardAndProjectDropdownList()));
		findElements(AddToBoardFanButtonLocators.linkToWindowLinkToProjectBoardCardAndProjectDropdownList()).get(linkToSubWindowDropdown-1).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.selectKanbanCardForImageLink());
		findElement(WhiteBoardRegressionLocators.selectKanbanCardForImageLink()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.linkToWindowSaveButtonOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.linkToWindowSaveButtonOnWhiteBoard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	public void deleteImageFromWhiteBoard()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.imageCreatedOnWhiteBoard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnDeleteTextOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.clickOnDeleteTextOnWhiteBoard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.yesButtonAfterDelete());
		findElement(WhiteBoardRegressionLocators.yesButtonAfterDelete()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.secondImageOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.secondImageOnWhiteBoard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnDeleteTextOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.clickOnDeleteTextOnWhiteBoard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.yesButtonAfterDelete());
		findElement(WhiteBoardRegressionLocators.yesButtonAfterDelete()).click();
		refresh();
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	
	public void addCardToWhiteBoard()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.addKanbanCardToBoard());
		actions.dragAndDropBy(findElement(AddToBoardFanButtonLocators.addKanbanCardToBoard()), 153, -243).build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCategoryDropDown()));
		findElement(KanbanBoardRegressionLocators.clickOnCategoryDropDown()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectCategoryFromDropDownValueMarketing()));
		findElement(KanbanBoardRegressionLocators.selectCategoryFromDropDownValueMarketing()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardId()));
		findElement(KanbanBoardRegressionLocators.enterCardId()).sendKeys("Mark001");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardTitle()));
		findElement(KanbanBoardRegressionLocators.enterCardTitle()).sendKeys("New Card");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardDescription()));
		findElement(KanbanBoardRegressionLocators.enterCardDescription()).sendKeys("Description of card");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardAcceptanceCriteria()));
		findElement(KanbanBoardRegressionLocators.enterCardAcceptanceCriteria()).sendKeys("Information of Card");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnPrioirtyDropDown()));
		findElement(KanbanBoardRegressionLocators.clickOnPrioirtyDropDown()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectPriorityFromDropDown()));
		findElement(KanbanBoardRegressionLocators.selectPriorityFromDropDown()).click();
		
		int cardStartDateSize = findElements(KanbanBoardRegressionLocators.fetchStartDateOfCardWhileCreating()).size();
		cardStartDateWhileCreating = findElements(KanbanBoardRegressionLocators.fetchStartDateOfCardWhileCreating()).get(cardStartDateSize-4).getText().substring(12,23);
		System.out.println("cardStartDateWhileCreating LINE 835:"+cardStartDateWhileCreating);
		
		//scroll to Estimation time
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.enterEstimationTime())).build().perform();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterEstimationTime()));
		findElement(KanbanBoardRegressionLocators.enterEstimationTime()).clear();
		findElement(KanbanBoardRegressionLocators.enterEstimationTime()).sendKeys("7");
				
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnCardDurationDropDown()));
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnCardDurationDropDown())).click().build().perform();
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectValueFromCardDurationDropDownMinutes()));
		findElement(KanbanBoardRegressionLocators.selectValueFromCardDurationDropDownMinutes()).click();
		
		getCardDuedate = findElement(KanbanBoardRegressionLocators.fetchDueDateOfCardWhileCreating()).getText().substring(10,21);
		System.out.println("getCardDuedate LINE 850 : "+getCardDuedate);
		
		scrollinToView(findElement(KanbanBoardRegressionLocators.clickOnCardDurationDropDown()));
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		boolean allocationBar = findElement(WhiteBoardRegressionLocators.cardAllocationBar()).isDisplayed();
		System.out.println("Allocation Bar is visible or not : "+allocationBar);
		for(int i=1; i<=5; i++)
		{
			explicitWaitVisibilityOf(findElement(WhiteBoardRegressionLocators.cardAllocationBar()));
			findElement(WhiteBoardRegressionLocators.cardAllocationBar()).click();
		}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnHoldCheckboxOnKanbanCard());
		findElement(KanbanBoardRegressionLocators.clickOnHoldCheckboxOnKanbanCard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(WhiteBoardRegressionLocators.clickOnCreateButton()));
		findElement(WhiteBoardRegressionLocators.clickOnCreateButton()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.selectKanbanCard());
		actions.dragAndDropBy(findElement(WhiteBoardRegressionLocators.selectKanbanCard()), 153, -243).build().perform();
		System.out.println("********************************************************************************************");
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	public String verifyCardCategory()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getCardCategory());
		String cardCategory = findElement(WhiteBoardRegressionLocators.getCardCategory()).getText();
		System.out.println("Get kanban card category before update:"+cardCategory);
		return cardCategory;
	}
	
	public String verifyCardDuration()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getCardDuration()); 
		String cardDuration = findElement(WhiteBoardRegressionLocators.getCardDuration()).getText();
		System.out.println("Get kanban card duration before update:"+cardDuration);
		return cardDuration;
	}
	
	public String verifyCardHarveyBall()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getCardPercentStatus()); 
		String cardStatus = findElement(WhiteBoardRegressionLocators.getCardPercentStatus()).getAttribute("class").substring(70);
		System.out.println("Get kanban card harvey ball status before update:"+cardStatus);
		return cardStatus;
	}
	
	public String verifyCardTitleDescriptino()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getCardTitleAndDescription());
		String cardTitleAndDescription = findElement(WhiteBoardRegressionLocators.getCardTitleAndDescription()).getText();
		System.out.println("Get kanban card title and description before update:"+cardTitleAndDescription);
		return cardTitleAndDescription;
	}
	
	public String verifyCardDueDate()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getCardDate());
		String cardDueDate = findElement(WhiteBoardRegressionLocators.getCardDate()).getText();
		System.out.println("Get kanban card due date before update:"+cardDueDate);
		return cardDueDate;
	}
	
	public String verifyCardPriority()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getCardPriority());
		String cardPriority = findElement(WhiteBoardRegressionLocators.getCardPriority()).getAttribute("class").substring(43);
		System.out.println("Get kanban card priority before update:"+cardPriority);
		return cardPriority;
	}
	
	public void updateKanbanCard()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCardInfo());
		findElement(KanbanBoardRegressionLocators.clickOnCardInfo()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
				
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCategoryDropDown()));
		findElement(KanbanBoardRegressionLocators.clickOnCategoryDropDown()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectCategoryFromDropDownValueOperations()));
		findElement(KanbanBoardRegressionLocators.selectCategoryFromDropDownValueOperations()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardId()));
		findElement(KanbanBoardRegressionLocators.enterCardId()).clear();
		findElement(KanbanBoardRegressionLocators.enterCardId()).sendKeys("M999");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardTitle()));
		findElement(KanbanBoardRegressionLocators.enterCardTitle()).clear();
		findElement(KanbanBoardRegressionLocators.enterCardTitle()).sendKeys("Update card title from New Card to LATEST CARD");
		
		explicitWaitVisibilityOf(findElement(WhiteBoardRegressionLocators.updateKanbanCardDescriptionField()));
		findElement(WhiteBoardRegressionLocators.updateKanbanCardDescriptionField()).clear();
		findElement(WhiteBoardRegressionLocators.updateKanbanCardDescriptionField()).sendKeys("Description is updated on white board card.");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardAcceptanceCriteria()));
		findElement(KanbanBoardRegressionLocators.enterCardAcceptanceCriteria()).clear();
		findElement(KanbanBoardRegressionLocators.enterCardAcceptanceCriteria()).sendKeys("Fill detail about card and this is updated information");
		
		//For Scroll down to assign an owner dropdown
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnAssignAnOwnerDropDown())).build().perform();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnAssignAnOwnerDropDown()));
		findElement(KanbanBoardRegressionLocators.clickOnAssignAnOwnerDropDown()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.assignAnOwnerSearchInputFieldUnderDropDown()));
		findElement(KanbanBoardRegressionLocators.assignAnOwnerSearchInputFieldUnderDropDown()).sendKeys("chirayu malviya");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.assignAnOwnerClickOnSearchIcon()));
		findElement(KanbanBoardRegressionLocators.assignAnOwnerClickOnSearchIcon()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {};
		explicitWaitVisibilityOf(findElement(WhiteBoardRegressionLocators.selectOwnerNameAfterSearch()));
		findElement(WhiteBoardRegressionLocators.selectOwnerNameAfterSearch()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {};
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnPrioirtyDropDown()));
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnPrioirtyDropDown())).click().build().perform();
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectPriorityFromDropDownMedium()));
		findElement(KanbanBoardRegressionLocators.selectPriorityFromDropDownMedium()).click();
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.enterEstimationTime())).build().perform();
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterEstimationTime()));
		findElement(KanbanBoardRegressionLocators.enterEstimationTime()).clear();
		findElement(KanbanBoardRegressionLocators.enterEstimationTime()).sendKeys("15");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCardDurationDropDown()));
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnCardDurationDropDown())).click().build().perform();
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectDurationOfCardUnderDurationDropdown()));
		findElement(KanbanBoardRegressionLocators.selectDurationOfCardUnderDurationDropdown()).click();
		
		getUpdatedCardDuedate = findElement(KanbanBoardRegressionLocators.fetchDueDateOfCardWhileCreating()).getText().substring(10,21);
		System.out.print("********************************************************************************************\ngetUpdatedCardDuedate : "+getUpdatedCardDuedate);
		
		scrollinToView(findElement(KanbanBoardRegressionLocators.clickOnCardDurationDropDown()));
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		boolean allocationBar = findElement(WhiteBoardRegressionLocators.updateCardAllocationBar()).isDisplayed();
		System.out.println("\nAllocation Bar is visible or not : "+allocationBar);
		for(int i=1; i<=5; i++)
		{
			explicitWaitVisibilityOf(findElement(WhiteBoardRegressionLocators.updateCardAllocationBar()));
			findElement(WhiteBoardRegressionLocators.updateCardAllocationBar()).click();
		}
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnHoldCheckboxOnKanbanCard())).build().perform();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnHoldCheckboxOnKanbanCard());
		findElement(KanbanBoardRegressionLocators.clickOnHoldCheckboxOnKanbanCard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnSaveButtonForUpdateCard()));
		findElement(KanbanBoardRegressionLocators.clickOnSaveButtonForUpdateCard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	public String verifyUpdatedCardCategory()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getCardCategory());
		String UpdatedCardCategory = findElement(WhiteBoardRegressionLocators.getCardCategory()).getText();
		System.out.println("Get kanban card category after update:"+UpdatedCardCategory);
		return UpdatedCardCategory;
	}
	
	public String verifyUpdatedCardDuration()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getCardDuration()); 
		String updatedCardDuration = findElement(WhiteBoardRegressionLocators.getCardDuration()).getText();
		System.out.println("Get kanban card duration after update:"+updatedCardDuration);
		return updatedCardDuration;
	}
	
	public String verifyUpdatedCardTitleDescription()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getCardTitleAndDescription());
		String updatedCardTitleAndDescription = findElement(WhiteBoardRegressionLocators.getCardTitleAndDescription()).getText();
		System.out.println("Get kanban card title and description after update:"+updatedCardTitleAndDescription);
		return updatedCardTitleAndDescription;
	}
	
	public String verifyUpdatedCardDueDate()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getCardDate());
		String updatedCardDueDate = findElement(WhiteBoardRegressionLocators.getCardDate()).getText();
		System.out.println("Get kanban card due date after update:"+updatedCardDueDate);
		return updatedCardDueDate;
	}
	
	public String verifyUpdatedCardPriority()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getCardPriority());
		String updatedCardPriority = findElement(WhiteBoardRegressionLocators.getCardPriority()).getAttribute("class").substring(43);
		System.out.println("Get kanban card priority after update:"+updatedCardPriority);
		return updatedCardPriority;
	}
	
	
	public void clickOn_StatusSideColumn()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		
		findElement(KanbanBoardRegressionLocators.clickOnStatusSideColumn()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.statusOnTimeDropDown()));
		findElement(KanbanBoardRegressionLocators.statusOnTimeDropDown()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.enterStatusOnTimeValueDropDownValue()));
		findElement(KanbanBoardRegressionLocators.enterStatusOnTimeValueDropDownValue()).click();
		
		findElement(KanbanBoardRegressionLocators.statusOnQualityDropDown()).click();
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.enterStatusOnQualityValueDropDown()));
		findElement(KanbanBoardRegressionLocators.enterStatusOnQualityValueDropDown()).click();
		
		findElement(KanbanBoardRegressionLocators.statusOnBudgetDropDown()).click();
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.enterStatusOnBudgetValueDropDown()));
		findElement(KanbanBoardRegressionLocators.enterStatusOnBudgetValueDropDown()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.percentageCompleteHarveyBall()));
		findElement(KanbanBoardRegressionLocators.percentageCompleteHarveyBall()).click();
		
		findElement(KanbanBoardRegressionLocators.statusDescriptionTextArea()).sendKeys("Card is upto date.");
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.kanbanCardStatusSideColumnAddButton());
		findElement(WhiteBoardRegressionLocators.kanbanCardStatusSideColumnAddButton()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardRegressionLocators.statusRegisterTab()).click();
	}
	
	
	public String verifyDateOfStatusRegister()
	{
		String statusDate = findElement(KanbanBoardRegressionLocators.statusRegisterDateVerify()).getText().substring(0,11);
		System.out.println("kanban card statusDate on white board :" +statusDate+"\n***********************************************************************************************");
		return statusDate;
	}
	
	public String verifyStatusRegisterDescription()
	{
		return findElement(KanbanBoardRegressionLocators.statusRegisterDescriptionVerify()).getText();
	}
	
	public String verifyOnTimeColoumn()
	{
		return findElement(KanbanBoardRegressionLocators.statusRegisterOnTime()).getText();
	}
	
	public String verifyOnQualityColoumn()
	{
		return findElement(KanbanBoardRegressionLocators.statusRegisterOnQuality()).getText();
	}
	
	public String verifyOnBudgetColoumn()
	{		
		return findElement(KanbanBoardRegressionLocators.statusRegisterOnBudget()).getText();
	}
	
	public void clickOn_TaskSideColumn()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnTaskSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnTaskSideColumn()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.addTaskSubject());
		findElement(KanbanBoardRegressionLocators.addTaskSubject()).sendKeys("Task 1");
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.addDescriptionToTask());
		findElement(KanbanBoardRegressionLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnAssignAUserDropDown());
		findElement(KanbanBoardRegressionLocators.clickOnAssignAUserDropDown()).click();
		//findElement(KanbanBoardRegressionLocators.assignAnOwnerForTaskSearchIcon()).click();
		findElement(KanbanBoardRegressionLocators.searchUserNameInInputField()).click();
		findElement(KanbanBoardRegressionLocators.searchUserNameInInputField()).sendKeys("varsha rawat");
		findElement(KanbanBoardRegressionLocators.assignAnOwnerForTaskSearchIcon()).click();		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardRegressionLocators.selectUserAfterSearch()).click();
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.taskPriority()));
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardRegressionLocators.taskPriority()).click();
		findElement(KanbanBoardRegressionLocators.selectTaskPriorityFromDropDown()).click();
		findElement(KanbanBoardRegressionLocators.clickOnTaskAddButton()).click();
	}
	
	
	public String verifyTaskName()
	{	
		String getTaskNameBeforeUpdate = findElement(KanbanBoardRegressionLocators.createdTaskName()).getText();
		System.out.println("Task Name before update : "+getTaskNameBeforeUpdate);
		return getTaskNameBeforeUpdate;
	}
	
	public boolean verifyTaskDate()
	{
		boolean getTaskDateBeforeUpdate = findElement(KanbanBoardRegressionLocators.createdTaskDate()).isDisplayed();
		System.out.println("Task Date before update :"+getTaskDateBeforeUpdate);
		return getTaskDateBeforeUpdate;
	}
	
	public String verifyTaskStatus()
	{
		String getTaskStatus = findElement(KanbanBoardRegressionLocators.createdTaskStatus()).getText();
		System.out.println("Task status before update :"+getTaskStatus);
		System.out.println("****************************************************************************************");
		return getTaskStatus;
	}
	
	
	public void updateTaskWhiteBoard()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnTaskSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnTaskSideColumn()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		
		int taskEditIconSize = findElements(KanbanBoardRegressionLocators.clickOnEditTaskIcon()).size();
		System.out.println("taskEditIconSize LINE 1178:"+taskEditIconSize);
		findElements(KanbanBoardRegressionLocators.clickOnEditTaskIcon()).get(taskEditIconSize-2).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.editTaskSubjectName());
		findElement(KanbanBoardRegressionLocators.editTaskSubjectName()).clear();
		findElement(KanbanBoardRegressionLocators.editTaskSubjectName()).sendKeys("This is updated task name : Task2");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editTaskDescription()));
		findElement(KanbanBoardRegressionLocators.editTaskDescription()).clear();
		findElement(KanbanBoardRegressionLocators.editTaskDescription()).sendKeys("Updated Task description");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editTaskAssignToDropdown()));
		findElement(KanbanBoardRegressionLocators.editTaskAssignToDropdown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editTaskAssignAnOwnerInputFieldForSearchName()));
		findElement(KanbanBoardRegressionLocators.editTaskAssignAnOwnerInputFieldForSearchName()).sendKeys("chirayu malviya");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnSearchMagnifierIcon()));
		findElement(KanbanBoardRegressionLocators.clickOnSearchMagnifierIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectOwnerNameAfterSearchUnderEditTask()));
		findElement(KanbanBoardRegressionLocators.selectOwnerNameAfterSearchUnderEditTask()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editTaskPriorityDropdown()));
		findElement(KanbanBoardRegressionLocators.editTaskPriorityDropdown()).click();
				
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectPriorityForTask()));
		findElement(KanbanBoardRegressionLocators.selectPriorityForTask()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editTaskDueDateCalender()));
		findElement(KanbanBoardRegressionLocators.editTaskDueDateCalender()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectHighlightedDateUpdateTask());
		String getSelectedDateOfToday = findElement(KanbanBoardRegressionLocators.selectHighlightedDateUpdateTask()).getText();
		System.out.println("Select today date from Update task windows LINE 1217:"+getSelectedDateOfToday);
		//20
		int getDayPanelList = findElements(KanbanBoardRegressionLocators.dayPanelList()).size();
		System.out.println("List of All days on update task windows LINE 1220:"+getDayPanelList);
		
		for(int i=1; i<=getDayPanelList; i++)
		{
			String getTextOfAllLiElements = findElement(By.xpath("//div[contains(@class,'datepicker-dropdown')]//div[@class='datepicker-panel']/ul[3]/li["+i+"]")).getText();
			if(getSelectedDateOfToday.equals(getTextOfAllLiElements))
			{
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				//findElement(By.xpath("//div[contains(@class,'datepicker-dropdown')]//ul[3]/li["+(Integer.parseInt(getTextOfAllLiElements)+1)+"]")).click();
				findElement(By.xpath("//div[contains(@class,'datepicker-dropdown')]//div[@class='datepicker-panel']/ul[3]/li["+(i-2)+"]")).click();
			}
		}
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.editTaskClickOnStatusDropdown()));
		findElement(KanbanBoardRegressionLocators.editTaskClickOnStatusDropdown()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectTaskStatusUnderStatusDropDown()));
		findElement(KanbanBoardRegressionLocators.selectTaskStatusUnderStatusDropDown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.editTaskClickOnUpdateButton()));
		findElement(KanbanBoardRegressionLocators.editTaskClickOnUpdateButton()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	
	public String verifyEditTaskSubject()
	{		 
		String getTaskNameAfterUpdate = findElement(KanbanBoardRegressionLocators.createdTaskName()).getText();
		System.out.println("Task Name After update LINE 1250 : "+getTaskNameAfterUpdate);
		return getTaskNameAfterUpdate;
	}
	
	
	public boolean verifyEditTaskDate()
	{
		boolean getTaskDateAfterUpdate = findElement(KanbanBoardRegressionLocators.createdTaskDate()).isDisplayed();
		System.out.println("Task Date After update LINE 1258:"+getTaskDateAfterUpdate);
		return getTaskDateAfterUpdate;
	}
	
	
	public String verifyEditTaskStatus()
	{
		String getTaskStatusAfterUpdate = findElement(KanbanBoardRegressionLocators.createdTaskStatus()).getText();
		System.out.println("Task Status After update LINE 1266:"+getTaskStatusAfterUpdate);
		System.out.println("****************************************************************************************");
		return getTaskStatusAfterUpdate;
	}
	
	
	public void clickOn_LogtimeSideColumn()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnLogTimeSideColoumn()));
		findElement(KanbanBoardRegressionLocators.clickOnLogTimeSideColoumn()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnDateForLogTime()));
		findElement(KanbanBoardRegressionLocators.clickOnDateForLogTime()).click();
		findElement(KanbanBoardRegressionLocators.clickOnCalenderTodayButton()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnLogTimeAssignToTaskDropDown()));
		findElement(KanbanBoardRegressionLocators.clickOnLogTimeAssignToTaskDropDown()).click();
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.selectTaskNameFromList()));
		findElement(KanbanBoardRegressionLocators.selectTaskNameFromList()).click();
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.loggedTimeInputField()));
		findElement(KanbanBoardRegressionLocators.loggedTimeInputField()).click();
		findElement(KanbanBoardRegressionLocators.loggedTimeInputField()).clear();
		findElement(KanbanBoardRegressionLocators.loggedTimeInputField()).sendKeys("2");
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnDurationDropDown()));
		findElement(KanbanBoardRegressionLocators.clickOnDurationDropDown()).click();
		findElement(KanbanBoardRegressionLocators.selectValueFromDurationDropDown()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnLogTimeAssignAUserDropDown()));
		findElement(KanbanBoardRegressionLocators.clickOnLogTimeAssignAUserDropDown()).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnLogTimeAssignAnOwnerSearchField());
		findElement(KanbanBoardRegressionLocators.clickOnLogTimeAssignAnOwnerSearchField()).click();
		findElement(KanbanBoardRegressionLocators.clickOnLogTimeAssignAnOwnerSearchField()).sendKeys("varsha rawat");
		findElement(KanbanBoardRegressionLocators.assignAnOwnerForTaskSearchIcon()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardRegressionLocators.selectUserFromList()).click();
		//findElement(KanbanBoardRegressionLocators.clickOnNextArrow()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.enterDescriptionOnLogTimeField()));
		findElement(KanbanBoardRegressionLocators.enterDescriptionOnLogTimeField()).click();
		findElement(KanbanBoardRegressionLocators.enterDescriptionOnLogTimeField()).sendKeys("In Kanbanize, you can log time on your cards to track the pure time you have spent on a given task. You can log time on the card for the entire task or at a subtask level.");
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(WhiteBoardRegressionLocators.whiteBoardLogTimeAddButton()));
		findElement(WhiteBoardRegressionLocators.whiteBoardLogTimeAddButton()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	public String verifyLogTimeDateOnWhiteBoard()
	{
		String getLogtimeDateBeforeUpdate = findElement(KanbanBoardRegressionLocators.logTimeDate()).getText();
		System.out.println("getLogtimeDateBeforeUpdate on whiteBoard LINE 1321 :"+getLogtimeDateBeforeUpdate);
		return getLogtimeDateBeforeUpdate;
	}
	
	public String verifyLogTimeTaskNameOnWhiteBoard()
	{
		String getLogTimeTaskNameBeforeUpdate =  findElement(KanbanBoardRegressionLocators.logTimeTaskName()).getText();
		System.out.println("getLogtimeTaskNameBeforeUpdate on whiteBoard LINE 1328:"+getLogTimeTaskNameBeforeUpdate);
		return getLogTimeTaskNameBeforeUpdate;
	}
	
	public String verifyLogTimeHoursColumnOnWhiteBoard()
	{
		String getLogTimeHoursBeforeUpdate = findElement(KanbanBoardRegressionLocators.logTimeHours()).getText();
		System.out.println("getLogTimeHoursBeforeUpdate on whiteBoard LINE 1335:"+getLogTimeHoursBeforeUpdate);
		return getLogTimeHoursBeforeUpdate;
	}
	
	public boolean verifyLogTimeDescriptionOnWhiteBoard()
	{		
		boolean getLogTimeDescriptionBeforeUpdate = findElement(KanbanBoardRegressionLocators.logTimeDescription()).isDisplayed();
		System.out.println("getLogTimeDescriptionBeforeUpdate on whiteBoard LINE 1342:"+getLogTimeDescriptionBeforeUpdate+"\n******************************************************************************************************************");
		return getLogTimeDescriptionBeforeUpdate;
	}
	
	
	public void editLogTimeWhiteBoard()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnLogTimeSideColoumn()));
		findElement(KanbanBoardRegressionLocators.clickOnLogTimeSideColoumn()).click();
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editLogTimeEditIcon()));
		findElement(KanbanBoardRegressionLocators.editLogTimeEditIcon()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnEditDateForLogTime()));
		findElement(KanbanBoardRegressionLocators.clickOnEditDateForLogTime()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editLogTimeSelectDateFromDatePicker()));
		findElement(KanbanBoardRegressionLocators.editLogTimeSelectDateFromDatePicker()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editLogTimeLoggedTime()));
		findElement(KanbanBoardRegressionLocators.editLogTimeLoggedTime()).clear();
		findElement(KanbanBoardRegressionLocators.editLogTimeLoggedTime()).sendKeys("1");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		int sizeOfEditLogTimeDurationDropDown = findElements(KanbanBoardRegressionLocators.clickOnEditLogtimeDurationDropDown()).size();
		System.out.println("sizeOfEditLogTimeDurationDropDown on white board LINE 1372:"+sizeOfEditLogTimeDurationDropDown);
		findElements(KanbanBoardRegressionLocators.clickOnEditLogtimeDurationDropDown()).get(sizeOfEditLogTimeDurationDropDown-1).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectValueFromDurationDropdown()));
		findElement(KanbanBoardRegressionLocators.selectValueFromDurationDropdown()).click();		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editLogTimeAssignAnOwnerDropdown()));
		findElement(KanbanBoardRegressionLocators.editLogTimeAssignAnOwnerDropdown()).click();
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editLogTimeAssignAnOwnerSearchInputField()));
		findElement(KanbanBoardRegressionLocators.editLogTimeAssignAnOwnerSearchInputField()).sendKeys("chirayu malviya");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.editLogTimeAssignAnOwnerSearchIcon()));
		findElement(KanbanBoardRegressionLocators.editLogTimeAssignAnOwnerSearchIcon()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectOwnerNameAferClickOnSearchIcon()));
		findElement(KanbanBoardRegressionLocators.selectOwnerNameAferClickOnSearchIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editLogTimeDescriptionField()));
		findElement(KanbanBoardRegressionLocators.editLogTimeDescriptionField()).clear();
		findElement(KanbanBoardRegressionLocators.editLogTimeDescriptionField()).sendKeys("Update log time detail");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.editLogTimeclickOnUpdateButton()));
		findElement(KanbanBoardRegressionLocators.editLogTimeclickOnUpdateButton()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	
	public boolean verifyLogTimeDateAfterUpdateOnWhiteBoard()
	{
		boolean getLogtimeDateAfterUpdateOnWhiteBoard = findElement(KanbanBoardRegressionLocators.logTimeDate()).isDisplayed();
		System.out.println("getLogtimeDateAfterUpdate on whiteboard LINE 1404:"+getLogtimeDateAfterUpdateOnWhiteBoard);
		return getLogtimeDateAfterUpdateOnWhiteBoard;
	}
	
	public String verifyLogTimeTaskNameAfterUpdateOnWhiteBoard()
	{
		String getLogTimeTaskNameAfterUpdateOnWhiteBoard =  findElement(KanbanBoardRegressionLocators.logTimeTaskName()).getText();
		System.out.println("getLogTimeTaskNameAfterUpdate on whiteboard LINE 1411:"+getLogTimeTaskNameAfterUpdateOnWhiteBoard);
		return getLogTimeTaskNameAfterUpdateOnWhiteBoard;
	}
	
	public String verifyLogTimeHoursColumnAfterUpdateOnWhiteBoard()
	{
		String getLogTimeHoursAfterUpdateOnWhiteBoard = findElement(KanbanBoardRegressionLocators.logTimeHours()).getText();
		System.out.println("getLogTimeHoursAfterUpdate on whiteboard LINE 1418:"+getLogTimeHoursAfterUpdateOnWhiteBoard);
		return getLogTimeHoursAfterUpdateOnWhiteBoard;
	}
	
	public String verifyLogTimeDescriptionAfterUpdateOnWhiteBoard()
	{		
		String getLogTimeDescriptionAfterUpdateOnWhiteBoard = findElement(KanbanBoardRegressionLocators.logTimeDescription()).getText();
		System.out.println("getLogTimeDescriptionAfterUpdate on whiteboard LINE 1425:"+getLogTimeDescriptionAfterUpdateOnWhiteBoard+"\n******************************************************************************************************************");
		return getLogTimeDescriptionAfterUpdateOnWhiteBoard;
	}
	
	
	//Applied Risk on kanban Card on WhiteBoard
	public void clickOn_RiskSideColumn()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		
		findElement(KanbanBoardRegressionLocators.clickOnRiskSideColumn()).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.loadMaskAfterSave());
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnRiskAssignToTaskDropDown()));
		findElement(KanbanBoardRegressionLocators.clickOnRiskAssignToTaskDropDown()).click();
		findElement(KanbanBoardRegressionLocators.selectTaskNameUnderRiskColumn()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnRadioButtonForRiskType()));
		findElement(KanbanBoardRegressionLocators.clickOnRadioButtonForRiskType()).click();
		KanbanBoardRegressionHelper.riskTypeRadioButtonValue = findElement(KanbanBoardRegressionLocators.clickOnRadioButtonForRiskType()).getText();
		System.out.println("Radio button of Risk Type line 1447:"+KanbanBoardRegressionHelper.riskTypeRadioButtonValue);
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.detailRiskInputField()));
		findElement(KanbanBoardRegressionLocators.detailRiskInputField()).sendKeys("Relationship between conditions, events, or tasks such that one cannot begin or be-completed until one or more other conditions, events, or tasks have occurred, begun, or completed");
				
		findElement(KanbanBoardRegressionLocators.riskMitigationRiskInputField()).sendKeys("Risk mitigation is defined as taking steps to reduce adverse effects. There are four types of risk mitigation strategies that hold unique to Business Continuity and Disaster Recovery. It's important to develop a strategy that closely relates to and matches your company's profile");
		
		//Applied Scroller to Weight:How Important dropdown
		scrollinToView(findElement(KanbanBoardRegressionLocators.clickOnWeightHowImportantDropDown()));
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnWeightHowImportantDropDown()));		
		findElement(KanbanBoardRegressionLocators.clickOnWeightHowImportantDropDown()).click();
		findElement(KanbanBoardRegressionLocators.selectValueFromWeightHowImportantDropDown()).click();				
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnProbabilityHowLikely()));		
		findElement(KanbanBoardRegressionLocators.clickOnProbabilityHowLikely()).click();
		findElement(KanbanBoardRegressionLocators.selectValueFromProbabilityHowLikely()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnAtRiskCheckbox());		
		findElement(KanbanBoardRegressionLocators.clickOnAtRiskCheckbox()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnRiskAddButton()));
		findElement(KanbanBoardRegressionLocators.clickOnRiskAddButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnRiskRegisterTab());
		findElement(KanbanBoardRegressionLocators.clickOnRiskRegisterTab()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
	}
	
	public String verifyRiskDateBeforeUpdateOnWhiteBoard()
	{
		String getRiskDateBeforeUpdateOnWhiteBoard =  findElement(KanbanBoardRegressionLocators.riskDate()).getText();
		System.out.println("getRiskDateBeforeUpdate on whiteboard LINE 1481:"+getRiskDateBeforeUpdateOnWhiteBoard);
		return getRiskDateBeforeUpdateOnWhiteBoard;
	}
	
	public String verifyTaskNameOnRiskBeforeUpdateOnWhiteBoard()
	{
		String getRiskTaskNameBeforeUpdateOnWhiteBoard = findElement(KanbanBoardRegressionLocators.riskTaskName()).getText();
		System.out.println("getRiskTaskNameBeforeUpdate on WhiteBoard LINE 1488:"+getRiskTaskNameBeforeUpdateOnWhiteBoard);
		return getRiskTaskNameBeforeUpdateOnWhiteBoard;
	}
	
	public String verifyRiskScoreBeforeUpdateOnWhiteBoard()
	{
		String getRiskScoreBeforeUpdateOnWhiteBoard =  findElement(KanbanBoardRegressionLocators.riskScore()).getText();
		System.out.println("getRiskScoreBeforeUpdate on white board LINE 1495:"+getRiskScoreBeforeUpdateOnWhiteBoard);
		return getRiskScoreBeforeUpdateOnWhiteBoard;
	}
	
	public String verifyRiskTypeBeforeUpdateOnWhiteBoard()
	{
		String riskTypeBeforeUpdateOnWhiteBoard = findElement(KanbanBoardRegressionLocators.riskType()).getText();
		System.out.println("riskTypeBeforeUpdate on white board LINE 1502:"+riskTypeBeforeUpdateOnWhiteBoard);
		return riskTypeBeforeUpdateOnWhiteBoard;
	}
	
	public String verifyRiskDetailBeforeUpdateOnWhiteBoard()
	{
		String riskDetailBeforeUpdateOnWhiteBoard = findElement(KanbanBoardRegressionLocators.riskDetail()).getText();
		System.out.print("riskDetailBeforeUpdate on white board LINE 1509:"+riskDetailBeforeUpdateOnWhiteBoard+"\n************************************************************************************\n");
		return riskDetailBeforeUpdateOnWhiteBoard;
	}
	
	
	public void editRiskOnWhiteBoard()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnRiskSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnRiskSideColumn()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnRiskRegisterTab());
		findElement(KanbanBoardRegressionLocators.clickOnRiskRegisterTab()).click();		
		
		//click on edit icon for risk
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editRiskClickOnRiskEditIcon()));
		findElement(KanbanBoardRegressionLocators.editRiskClickOnRiskEditIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editRiskDate()));
		findElement(KanbanBoardRegressionLocators.editRiskDate()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editRiskDatePickerFromCalender()));
		findElement(KanbanBoardRegressionLocators.editRiskDatePickerFromCalender()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editRiskSelectBusinessDependencyRadioButton()));
		findElement(KanbanBoardRegressionLocators.editRiskSelectBusinessDependencyRadioButton()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editRiskDetailTextArea()));
		findElement(KanbanBoardRegressionLocators.editRiskDetailTextArea()).clear();
		findElement(KanbanBoardRegressionLocators.editRiskDetailTextArea()).sendKeys("Detail of Risk is updated : Now it is changed from Issue to Business Dependency");
		
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.editRiskRiskMitigationTextArea());
		findElement(KanbanBoardRegressionLocators.editRiskRiskMitigationTextArea()).clear();
		findElement(KanbanBoardRegressionLocators.editRiskRiskMitigationTextArea()).sendKeys("Business Dependency");

		try {Thread.sleep(1000);}catch(InterruptedException ie) {}		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.editRiskClickOnUpdateButton()));
		findElement(KanbanBoardRegressionLocators.editRiskClickOnUpdateButton()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
	}
	
	
	public boolean verifyRiskDateAfterUpdateOnWhiteBoard()
	{
		boolean getVerifyRiskDateAfterUpdateOnWhiteBoard = findElement(KanbanBoardRegressionLocators.riskDate()).isDisplayed();
		System.out.println("getVerifyRiskDateAfterUpdate on whiteboard LINE 1561:"+getVerifyRiskDateAfterUpdateOnWhiteBoard);
		return getVerifyRiskDateAfterUpdateOnWhiteBoard;
	}
	
	
	public String verifyTaskNameOnRiskAfterUpdateOnWhiteBoard()
	{
		String riskTaskNameAfterUpdateOnWhiteBoard = findElement(KanbanBoardRegressionLocators.riskTaskName()).getText();
		System.out.println("riskTaskNameAfterUpdate on whiteboard LINE 1569:"+riskTaskNameAfterUpdateOnWhiteBoard);	
		return riskTaskNameAfterUpdateOnWhiteBoard;
	}
	
	
	public String verifyRiskScoreAfterUpdateOnWhiteBoard()
	{
		String getRiskScoreAfterUpdateOnWhiteBoard =  findElement(KanbanBoardRegressionLocators.riskScore()).getText();
		System.out.println("getRiskScoreAfterUpdate on whiteboard LINE 1577:"+getRiskScoreAfterUpdateOnWhiteBoard);
		return getRiskScoreAfterUpdateOnWhiteBoard;
	}
	
	public String verifyRiskTypeAfterUpdateOnWhiteBoard()
	{
		String getRiskTypeAfterUpdateOnWhiteBoard = findElement(KanbanBoardRegressionLocators.getVerifyRiskTypeAfterEdit()).getText();
		System.out.println("getRiskTypeAfterUpdate on whiteboard LINE 1584:"+getRiskTypeAfterUpdateOnWhiteBoard);
		return getRiskTypeAfterUpdateOnWhiteBoard;
	}
	
	
	public String verifyRiskDetailAfterUpdateOnWhiteBoard()
	{
		String getRiskDetailAfterUpdateOnWhiteBoard = findElement(KanbanBoardRegressionLocators.riskDetail()).getText();
		System.out.println("getRiskDetailAfterUpdate on whiteboard LINE 1592:"+getRiskDetailAfterUpdateOnWhiteBoard+"\n***************************************************************************************************");
		return getRiskDetailAfterUpdateOnWhiteBoard;
	}
	
	
	public void clickOn_LinkSideColumn()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		getWhiteBoardWindowHandleValue = driver.getWindowHandle();
		System.out.println("Window handle value of white board in full screen LINE 1601:"+getWhiteBoardWindowHandleValue);
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnLinkSideColumn()));
		findElement(KanbanBoardRegressionLocators.clickOnLinkSideColumn()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnLinkToProject());
		findElement(KanbanBoardRegressionLocators.clickOnLinkToProject()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		findElement(KanbanBoardRegressionLocators.clickOnFolderWhichWillSelect()).click();
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.clickOnCreatedProject());
		findElement(KanbanBoardRegressionLocators.clickOnCreatedProject()).click();
		
		scrollinToView(findElement(KanbanBoardRegressionLocators.clickOnLinkToProjectBoard()));
		findElement(KanbanBoardRegressionLocators.clickOnLinkToProjectBoard()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());	
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.selectPlanBoardforLinkToProjectBoard());
		findElement(WhiteBoardRegressionLocators.selectPlanBoardforLinkToProjectBoard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnLinkToCard()));
		findElement(KanbanBoardRegressionLocators.clickOnLinkToCard()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.selectActivityForLinkToCard()); 
		findElement(WhiteBoardRegressionLocators.selectActivityForLinkToCard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.linkToWindowSaveButtonOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.linkToWindowSaveButtonOnWhiteBoard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnKanbanCardLinkIcon());
		findElement(WhiteBoardRegressionLocators.clickOnKanbanCardLinkIcon()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		for(String switchToPlanGantt : driver.getWindowHandles())
		{
			driver.switchTo().window(switchToPlanGantt);
		}
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.planGanttLoader());
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	public boolean isMinatureOfWhiteBoardVisible()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getWhiteBoardMinatureOnActivity());
		boolean isMinuature = findElement(WhiteBoardRegressionLocators.getWhiteBoardMinatureOnActivity()).isDisplayed();
		System.out.println("Plan gantt minature is visible LINE 1653:"+isMinuature);
		return isMinuature;
	}
	
	public void clickOn_SubscriberSideColumn()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		driver.switchTo().window(getWhiteBoardWindowHandleValue);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnSubscribersSideColumn()));
		findElement(KanbanBoardRegressionLocators.clickOnSubscribersSideColumn()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(WhiteBoardRegressionLocators.clickOnSelectSubscriberDropDown()));
		findElement(WhiteBoardRegressionLocators.clickOnSelectSubscriberDropDown()).click();
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.selectSubscriberSearchInputField()));
		findElement(KanbanBoardRegressionLocators.selectSubscriberSearchInputField()).click();
		findElement(KanbanBoardRegressionLocators.selectSubscriberSearchInputField()).sendKeys("varsha rawat");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnSelectSubscriberSearchIcon()));
		findElement(KanbanBoardRegressionLocators.clickOnSelectSubscriberSearchIcon()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.selectUserForSubscriber());
		findElement(WhiteBoardRegressionLocators.selectUserForSubscriber()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.addButtonOnKanbanCard());
		findElement(WhiteBoardRegressionLocators.addButtonOnKanbanCard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}

	
	public boolean verifySubscriberMovedCheckBox()
	{
		boolean result = false;
		int attempts = 0;
		
		while(attempts <= 2)
		{
			try
			{
				result = findElement(KanbanBoardRegressionLocators.movedCheckBox()).isDisplayed();
				System.out.println("Value of attempts LINE 1699 :"+attempts);
				break;
			} 
			catch(StaleElementReferenceException staleEleRef)
			{
				attempts++;
			}
		}		
		System.out.println("movecheckBox LINE 1707:"+result);
		return result;
	}
	
	public boolean verifySubscriberDoneCheckBox()
	{
		boolean doneCheckbox = findElement(KanbanBoardRegressionLocators.doneCheckbox()).isDisplayed();
		System.out.println("doneCheckbox LINE 1714:"+doneCheckbox);
		return doneCheckbox;
	}
	
	public boolean verifySubscriberCardPastDueCheckBox()
	{
		boolean cardPastDueCheckBox = findElement(KanbanBoardRegressionLocators.cardPastDueCheckBox()).isDisplayed();
		System.out.println("cardPastDueCheckBox LINE 1721:"+cardPastDueCheckBox);
		return cardPastDueCheckBox;
	}
	
	public boolean verifySubscriberTaskPastDueCheckBox()
	{
		boolean taskPastDueCheckBox =  findElement(KanbanBoardRegressionLocators.taskPastDueCheckBox()).isDisplayed();
		System.out.println("taskPastDue LINE 1728:"+taskPastDueCheckBox);
		return taskPastDueCheckBox;
		
	}
	
	public boolean verifySubscriberTaskCompletedCheckBox()
	{
		boolean taskCompletedCheckBox = findElement(KanbanBoardRegressionLocators.taskCompletedCheckBox()).isDisplayed();
		System.out.println("taskCompletedCheckBox LINE 1736:"+taskCompletedCheckBox+"\n*******************************************************");
		return taskCompletedCheckBox;
	}
	
	
	public void clickOn_CustomFieldSideColumn()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCustomFieldsSideColumn()));
		findElement(KanbanBoardRegressionLocators.clickOnCustomFieldsSideColumn()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterValueOnCurrencyCustomField()));
		findElement(KanbanBoardRegressionLocators.enterValueOnCurrencyCustomField()).clear();
		findElement(KanbanBoardRegressionLocators.enterValueOnCurrencyCustomField()).sendKeys("1540");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterValueOnTextCustomField()));
		findElement(KanbanBoardRegressionLocators.enterValueOnTextCustomField()).sendKeys("Custom field created on white board's kanban card.");
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	public String getCurrencyCustomFieldValue()
	{
		String getCurrencyValue = findElement(WhiteBoardRegressionLocators.getCurrencyCustomFieldValue()).getText();
		System.out.println("Whiteboard's kanban card have currency custom field and get value of it :"+getCurrencyValue);
		return getCurrencyValue;
	}
	
	public String getTextCustomFieldValue()
	{
		String getTextValue = findElement(WhiteBoardRegressionLocators.getTextCustomFieldValue()).getText();
		System.out.println("Whiteboard's kanban card have text custom field and get value of it :"+getTextValue);
		return getTextValue;
	}
	
	
	public void clickOn_CardModeSideColumn()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCardModeSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnCardModeSideColumn()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		int schedulingModeEffortUnitDropDown = findElements(KanbanBoardRegressionLocators.schedulingModeAndEffortUnitCommonXpath()).size();
		System.out.println("Scheduling Mode and Effort Unit dropdown list size LINE 1788:"+schedulingModeEffortUnitDropDown);
		
		findElements(KanbanBoardRegressionLocators.schedulingModeAndEffortUnitCommonXpath()).get(schedulingModeEffortUnitDropDown-2).click();
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.selectValueFromCardModeScheduleModeDropDown()));
		findElement(KanbanBoardRegressionLocators.selectValueFromCardModeScheduleModeDropDown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.actualEffortInputField()));
		findElement(KanbanBoardRegressionLocators.actualEffortInputField()).clear();
		findElement(KanbanBoardRegressionLocators.actualEffortInputField()).sendKeys("10");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardRegressionLocators.schedulingModeAndEffortUnitCommonXpath()).get(schedulingModeEffortUnitDropDown-1).click();		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.selectValueFromEffortUnitDropDown()));
		findElement(KanbanBoardRegressionLocators.selectValueFromEffortUnitDropDown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnCardInfoForCardMode()));
		findElement(KanbanBoardRegressionLocators.clickOnCardInfoForCardMode()).click();
				
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.scrollDownToAccecptanceCriteriaInputTextField()));
		scrollinToView(findElement(KanbanBoardRegressionLocators.scrollDownToAccecptanceCriteriaInputTextField()));
	}
	
	public boolean verifyCardModeEstimationDays()
	{
		boolean estimationDaysField = findElement(KanbanBoardRegressionLocators.estimationInputFieldCardInfo()).isEnabled();
		System.out.println("Estimation days input field LINE 1815:"+estimationDaysField);
		return estimationDaysField;
	}
	
	public boolean verifyCardModeDuration()
	{
		boolean durationInputField = findElement(KanbanBoardRegressionLocators.durationInputFieldCardInfo()).isEnabled();
		System.out.println("durationInputField LINE 1822:"+durationInputField+"\n*********************************************************");
		return durationInputField;
	}
	
	
	public void uploadSticker_OnWhiteBoard()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}	//this code is for uploading sticker to white board
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.clickOnAddToBoardFan());
		findElement(AddToBoardFanButtonLocators.clickOnAddToBoardFan()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		//findElement(KanbanBoardRegressionLocators.addStickerToBoardOrCard()), findElement(WhiteBoardRegressionLocators.whiteBoardBackground())
		actions.dragAndDropBy(findElement(KanbanBoardRegressionLocators.addStickerToBoardOrCard()),152, -243).build().perform();
		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}		  
		String imageName[] = {"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg"};
		 
		//Apply loop from here 
		for(int i=0; i<imageName.length; i++)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.uploadStickerPlusButton());
			findElement(WhiteBoardRegressionLocators.uploadStickerPlusButton()).click();
			explicitWaitElementToBeClickable(findElement(WhiteBoardRegressionLocators.enterNameOnUploadStickerInputField()));
			findElement(WhiteBoardRegressionLocators.enterNameOnUploadStickerInputField()).sendKeys("ImageOnWhiteBoard"+i);
				
			explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.uploadStickerGlobalFieldCheck()));
			findElement(KanbanBoardRegressionLocators.uploadStickerGlobalFieldCheck()).click();
			  
			explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.chooseFileNameFromDriveForUploadSticker()));
			findElement(KanbanBoardRegressionLocators.chooseFileNameFromDriveForUploadSticker()).sendKeys("E:\\Wallpaper/"+imageName[i]);
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(WhiteBoardRegressionLocators.uploadStickerWindowUploadButton()));
			findElement(WhiteBoardRegressionLocators.uploadStickerWindowUploadButton()).click();
		}//Loop End here
				 
		try{robot = new Robot();}catch (AWTException awtExcp){}
		robot.mouseMove(50,50); actions.click().build().perform();
		  
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnAddToBoardFan());
		findElement(KanbanBoardRegressionLocators.clickOnAddToBoardFan()).click();		//this code is for uploading sticker to white board & this will close Fan
		
		//****************************************Apply sticker on white board Card*******************************************************************
		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn()));
		findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//need to apply new logic here for apply sticker on kanban card for white board
		int sizeOfStickerWindow = findElements(KanbanBoardRegressionLocators.stickerWindowsElementSize()).size();
		System.out.println("sizeOfStickerWindow for white board window LINE 1880:"+sizeOfStickerWindow);
		
		for(int i=5; i<sizeOfStickerWindow-4; i++)
		{
			System.out.print(i+" ");
			//div[contains(@style,'translate3d(0px, 170px, 0px);')]
			findElements(KanbanBoardRegressionLocators.stickerWindowsElementSize()).get(i).click();
			try {Thread.sleep(500);}catch(InterruptedException ie) {}
		}
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
		System.out.println();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	public boolean isStickerVisible()
	{
		boolean stickerStatus = false;
		int getCountOfStickersOnWhiteBoardCard = findElements(WhiteBoardRegressionLocators.getWhiteBoardSticker()).size();
		System.out.println("Count of stickers uploaded on white board card : "+getCountOfStickersOnWhiteBoardCard);
		for(int i=3 ;i<=5; i++)
		{
			stickerStatus = findElement(By.xpath("//div[contains(@class,'stickerContainerCls')]/div/div[2]/child::div[1]/div["+i+"]//img[1]")).isDisplayed();
			System.out.print(stickerStatus+" ");
		}
		return stickerStatus;
	}
	
	
	public void cliclOn_CloneSideColumn()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCloneSideColumn()));
		findElement(KanbanBoardRegressionLocators.clickOnCloneSideColumn()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.clickOnCloneCardStartDate());
		findElement(KanbanBoardRegressionLocators.clickOnCloneCardStartDate()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		String cloneCardWithStartDate = findElement(KanbanBoardRegressionLocators.selectDateFromStartDatePicker()).getText();
		System.out.println("\nClone card with start date and select value from date picker LINE 1926: "+cloneCardWithStartDate);
		
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.selectDateFromStartDatePicker());
		findElement(KanbanBoardRegressionLocators.selectDateFromStartDatePicker()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCloneButton()));
		findElement(KanbanBoardRegressionLocators.clickOnCloneButton()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.cardFirstAfterClone());
		actions.dragAndDropBy(findElement(WhiteBoardRegressionLocators.cardFirstAfterClone()), 200, 0).build().perform();
		
		//Clone Kanban Card with Due Date
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCloneSideColumn()));
		findElement(KanbanBoardRegressionLocators.clickOnCloneSideColumn()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.clickOnCloneCardDueDate());
		findElement(KanbanBoardRegressionLocators.clickOnCloneCardDueDate()).click();
		
		String cloneCardWithDueDate = findElement(KanbanBoardRegressionLocators.selectDateFromDueDatePicker()).getText();
		System.out.println("Clone Card with due date and value from date picker LINE 1953: "+cloneCardWithDueDate);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.selectDateFromDueDatePicker());
		findElement(KanbanBoardRegressionLocators.selectDateFromDueDatePicker()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCloneButton()));
		findElement(KanbanBoardRegressionLocators.clickOnCloneButton()).click();
		//try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		//actions.dragAndDropBy(findElement(WhiteBoardRegressionLocators.cardSecondAfterClone()), 200, 0).build().perform();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	public boolean isKanbanCardCloned()
	{
		boolean isCardVisible = false;
		int kanbanCardCount = findElements(WhiteBoardRegressionLocators.clonedKanbanCardCount()).size();
		System.out.println("Count of kanban card after clone:"+kanbanCardCount);
		
		for(int i=1; i<=kanbanCardCount; i++)
		{
			isCardVisible = findElement(By.xpath("//div[contains(@id,'ext-kanbancard-"+i+"')]")).isDisplayed();
			System.out.print(isCardVisible+" ");
		}		
		return isCardVisible;
	}
	
	public void clickOn_HyperjumpSideColumn()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editSecondKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editSecondKanbanCardPensilIcon()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnHyperJumpSideColumn()));
		findElement(KanbanBoardRegressionLocators.clickOnHyperJumpSideColumn()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.searchBoardNameOnHyperjumpWindow());
		findElement(WhiteBoardRegressionLocators.searchBoardNameOnHyperjumpWindow()).sendKeys("Regression Kanban Board");
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.selectkanbanBoarAfterSearch());
		findElement(WhiteBoardRegressionLocators.selectkanbanBoarAfterSearch()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnJumpButton());
		findElement(WhiteBoardRegressionLocators.clickOnJumpButton()).click();
	}
	
	public void clickOn_HierarchySideColumn()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}//editKanbanCardPensilIcon() parent card who has sticker on it
		/*explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editFirstKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editFirstKanbanCardPensilIcon()).click();*/
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		
		scrollinToView(findElement(KanbanBoardRegressionLocators.clickOnHierarchySideColumn()));
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnHierarchySideColumn()));
		findElement(KanbanBoardRegressionLocators.clickOnHierarchySideColumn()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		for(String cardHierarchyHandleValue : driver.getWindowHandles())
		{
			driver.switchTo().window(cardHierarchyHandleValue);
			//System.out.print(cardHierarchyHandleValue+", ");
		}
		
		boolean isCardHierarchyLoaderVisible = findElement(KanbanBoardSettingLocators.calenderViewLoader()).isDisplayed();
		System.out.println("\ncard hierarchy loader visibility 2026:"+isCardHierarchyLoaderVisible);
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.calenderViewLoader());
	}
	
	
	public void clickOnFiles_SideColumn()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		driver.switchTo().window(getWhiteBoardWindowHandleValue);
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		
		scrollinToView(findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn()));
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn()));
		findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn()).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.loadMaskAfterSave());
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		boolean isRepositorySourceVisible = findElement(KanbanBoardRegressionLocators.repositorySourceTab()).isDisplayed();
		System.out.println("\nisRepositorySourceVisible on files is Visible LINE 2047 : "+isRepositorySourceVisible);
		
		if(isRepositorySourceVisible==true)
		{
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.switchToSalesforceFilesUpload());
			findElement(KanbanBoardRegressionLocators.switchToSalesforceFilesUpload()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		}		
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.uploadImageOnFilesInputField()));
		findElement(KanbanBoardRegressionLocators.uploadImageOnFilesInputField()).sendKeys("E:\\Wallpaper/og_image.jpg");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnUploadButton()));
		findElement(KanbanBoardRegressionLocators.clickOnUploadButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.afterUploadButtonClick());
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	public void clickOnDelete_SideColumn()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editKanbanCardPensilIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnHyperJumpSideColumn())).build().perform();
		actions.dragAndDrop(findElement(KanbanBoardRegressionLocators.clickOnHyperJumpSideColumn()), findElement(WhiteBoardRegressionLocators.randomArea())).build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnDeleteSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnDeleteSideColumn()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnDeletePopupYesButton()));
		findElement(KanbanBoardRegressionLocators.clickOnDeletePopupYesButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnDeleteAllTaskPopupNoButton()));
		findElement(KanbanBoardRegressionLocators.clickOnDeleteAllTaskPopupNoButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Delete second card on white board		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.editFirstKanbanCardPensilIcon());
		findElement(WhiteBoardRegressionLocators.editFirstKanbanCardPensilIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnHyperJumpSideColumn())).build().perform();
		actions.dragAndDrop(findElement(KanbanBoardRegressionLocators.clickOnHyperJumpSideColumn()), findElement(WhiteBoardRegressionLocators.randomArea())).build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnDeleteSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnDeleteSideColumn()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnDeletePopupYesButton()));
		findElement(KanbanBoardRegressionLocators.clickOnDeletePopupYesButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnDeleteAllTaskPopupNoButton()));
		findElement(KanbanBoardRegressionLocators.clickOnDeleteAllTaskPopupNoButton()).click();
	}
	
	
	//****************************************************************White Board Preference Setting**********************************************************************
		
	public void whiteBoardPreferences()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeLocated(KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeLocated(KanbanBoardSettingLocators.subscriberToCardsToggleSlider());
		findElement(KanbanBoardSettingLocators.subscriberToCardsToggleSlider()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
		//Check subscribe to cards checkboxes
		for(int i=1; i<=5; i++)
		{
			findElement(By.xpath("//*[contains(@id,'ext-formpanel-') and @class='x-container x-unsized x-form']/div/div["+i+"]//div[@class='x-component-outer']")).click();
		}
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.followOnChatterToggleSlider()));
		findElement(KanbanBoardSettingLocators.followOnChatterToggleSlider()).click();
		
		int sizeOfAllcheckbox = findElements(KanbanBoardSettingLocators.followOnChatterAllCheckbox()).size();
		System.out.println("followOnChatterAllCheckbox LINE 2145:"+sizeOfAllcheckbox);
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardSettingLocators.followOnChatterAllCheckbox()).get(sizeOfAllcheckbox-6).click();	
		
		int allcheckboxList = findElements(KanbanBoardSettingLocators.allCategoryCheckboxList()).size();
		System.out.println("White board My Preferences sub window Checkbox size LINE 2151:"+allcheckboxList);
		
		JavascriptExecutor javaScript = (JavascriptExecutor)driver;
		
		//Scroll till all the category visible
		for(int i=1; i<=allcheckboxList; i++)
		{
			javaScript.executeScript("arguments[0].scrollIntoView();", findElement(By.xpath("//form[contains(@id,'ext-formpanel-') and @style='height: 251px !important;']/div/div["+i+"]/div[@class='x-component-outer']")));
		}
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Tick the category checkboxes
		for(int i=1; i<=allcheckboxList; i++)
		{
			findElement(By.xpath("//form[contains(@id,'ext-formpanel-') and @style='height: 251px !important;']/div/div["+i+"]/div[@class='x-component-outer']")).click();
		}
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnSaveButton()));
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		
		// Again goto My Preference to uncheck both toggle slider
		/*explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.loadMaskAfterSave()));
		boolean isVisible = findElement(KanbanBoardSettingLocators.loadMaskAfterSave()).isDisplayed();
		System.out.println("load mask kanbanBoardPreferences method:"+isVisible);*/
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.toolBarSettingIcon()));
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitElementToBeLocated(KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeLocated(KanbanBoardSettingLocators.subscriberToCardsToggleSlider());
		findElement(KanbanBoardSettingLocators.subscriberToCardsToggleSlider()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.followOnChatterToggleSlider()));
		findElement(KanbanBoardSettingLocators.followOnChatterToggleSlider()).click();
		
		explicitWaitElementBy("presenceOfElementLocated", KanbanBoardSettingLocators.clickOnSaveButton());
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
	}
	
	
	public void clickOn_WhiteBoardSecurityCheckUnderPreferences()
	{
		//********************************Check Security Under Preference*******************************************
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnSecurityOptionUnderPreference());
		findElement(KanbanBoardSettingLocators.clickOnSecurityOptionUnderPreference()).click(); 
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnCEODesignationEditIcon());
		findElement(WhiteBoardRegressionLocators.clickOnCEODesignationEditIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.disableAbilityToMoveCardsCheckbox()));
		findElement(KanbanBoardSettingLocators.disableAbilityToMoveCardsCheckbox()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.disableAbilityToEditCards()));
		findElement(KanbanBoardSettingLocators.disableAbilityToEditCards()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnDoneButtonRolePreferenceUnderSecurity()));
		findElement(KanbanBoardSettingLocators.clickOnDoneButtonRolePreferenceUnderSecurity()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
	}
	
	public boolean verifyDisableMoveCheckBoxWhenChecked()
	{
		boolean getDisableMoveClassAttribute = findElement(WhiteBoardRegressionLocators.getDisableMoveCheckbox()).isDisplayed();
		System.out.println("Disable Move Checkbox White board LINE 2237:"+getDisableMoveClassAttribute);
		return getDisableMoveClassAttribute;
	}
	
	public boolean verifyDisableEditCheckboxWhenChecked()
	{
		boolean getDisableEditClassAttribute = findElement(WhiteBoardRegressionLocators.getDisableEditCheckbox()).isDisplayed();
		System.out.println("Disable Edit Checkbox White board LINE 2244:"+getDisableEditClassAttribute);
		return getDisableEditClassAttribute;
	}
	
	
	public void clickOn_WhiteBoardSecurityUncheckUnderPreferences()
	{
		//********************************Uncheck Security Under Preference*******************************************
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnSecurityOptionUnderPreference());
		findElement(KanbanBoardSettingLocators.clickOnSecurityOptionUnderPreference()).click();
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnCEODesignationEditIcon());
		findElement(WhiteBoardRegressionLocators.clickOnCEODesignationEditIcon()).click(); 
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.disableAbilityToMoveCardsCheckbox()));
		findElement(KanbanBoardSettingLocators.disableAbilityToMoveCardsCheckbox()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.disableAbilityToEditCards()));
		findElement(KanbanBoardSettingLocators.disableAbilityToEditCards()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnDoneButtonRolePreferenceUnderSecurity()));
		findElement(KanbanBoardSettingLocators.clickOnDoneButtonRolePreferenceUnderSecurity()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	
	public boolean verifyDisableMoveCheckBoxAfterUncheck()
	{
		boolean getDisableMoveCheckboxAfterUncheck = findElement(WhiteBoardRegressionLocators.getDisableMoveCheckbox()).isDisplayed();
		System.out.println("Disable Move Checkbox After Uncheck LINE 2284:"+getDisableMoveCheckboxAfterUncheck);
		return getDisableMoveCheckboxAfterUncheck;
	}
	
	public boolean verifyDisableEditCheckboxAfterUncheck()
	{
		boolean getDisableEditClassAttributeAfterUncheck = findElement(WhiteBoardRegressionLocators.getDisableEditCheckbox()).isDisplayed();
		System.out.println("Disable Edit Checkbox After Uncheck LINE 2291:"+getDisableEditClassAttributeAfterUncheck);
		return getDisableEditClassAttributeAfterUncheck;
	}
	
	
	public void clickOn_CasesForAddCaseCardOnWhiteBoard()
	{
		//********************************** Cases Under preference start here**********************************
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.preferenceOption()));
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("presenceOfElementLocated", KanbanBoardSettingLocators.clickOnCasesOptionUnderPreference());
		findElement(KanbanBoardSettingLocators.clickOnCasesOptionUnderPreference()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.turnOnCaseSyncCheckbox()));
		findElement(KanbanBoardSettingLocators.turnOnCaseSyncCheckbox()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnChooseNewCaseCardCategoryDropdown()));
		findElement(KanbanBoardSettingLocators.clickOnChooseNewCaseCardCategoryDropdown()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectCategoryFromDropdown());
		findElement(KanbanBoardSettingLocators.selectCategoryFromDropdown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnSaveButton()));
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOn_HomeButtonOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.clickOn_HomeButtonOnWhiteBoard()).click();
		
		for(String casesCardHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(casesCardHandle);
		}
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnPlusIconOnLeankorHomePage()));
		findElement(KanbanBoardSettingLocators.clickOnPlusIconOnLeankorHomePage()).click();
						
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.selectCasesObjectName()));
		findElement(KanbanBoardSettingLocators.selectCasesObjectName()).click();
		
		/*explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnCrossIconOnLexWindow()));
		findElement(KanbanBoardSettingLocators.clickOnCrossIconOnLexWindow()).click();*/
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnNewButtonForCreateCase()));
		findElement(KanbanBoardSettingLocators.clickOnNewButtonForCreateCase()).click();
 		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		//select value from Status Dropdown
		selectValueFromDropdown(findElement(KanbanBoardSettingLocators.caseObjectStatusDropdown()),"index","1");
		
		//select value from Case Origin Dropdown
		selectValueFromDropdown(findElement(KanbanBoardSettingLocators.caseObjectCaseOriginDropdown()),"index","3");
		
		int saveButtonSize = findElements(KanbanBoardSettingLocators.saveButtonOnCaseObjectPage()).size();
		
		explicitWaitElementToBeVisibleAllListItems(findElements(KanbanBoardSettingLocators.saveButtonOnCaseObjectPage()));
		findElements(KanbanBoardSettingLocators.saveButtonOnCaseObjectPage()).get(saveButtonSize-2).click();
				
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		int caseStandardObjectTitleLength = driver.getTitle().length();
		System.out.println("Case Standard Object page title length on White Board:"+caseStandardObjectTitleLength);
		
		switch(caseStandardObjectTitleLength)
		{
		case 50 :
			KanbanBoardSettingHelper.getCaseNameFromCaseObjectPage = driver.getTitle().substring(6,16);
			System.out.println("Case object record title LINE 2372 , Switch Case 50:"+KanbanBoardSettingHelper.getCaseNameFromCaseObjectPage);
			break;
		case 48:
			KanbanBoardSettingHelper.getCaseNameFromCaseObjectPage = driver.getTitle().substring(6,14);
			System.out.println("Case object record title LINE 2376 , Switch case 48:"+KanbanBoardSettingHelper.getCaseNameFromCaseObjectPage);
			break;
			
		default:
			System.out.println("Invalid length of Case Object Title page LINE 2380");
		}
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		close();
		
		//driver.switchTo().window(temporaryVariableForWindowHandleOfWhiteBoard);		//Comment/remove this line when script run from start
		driver.switchTo().window(getWhiteBoardWindowHandleValue);		//Uncomment this line when script run from start
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	public String verifyCaseCardTitleAfterCreating()
	{
		String caseName = findElement(KanbanBoardSettingLocators.verifyCaseNameOnCaseCard()).getText().substring(16);
		System.out.println("Get Case card title from kanban card on WHITE BOARD:"+caseName);
		return caseName;
	}
	
	
	public void clickOn_OpportunitiesAddOpportunityCardOnWhiteBoard()
	{
		//*******************************Opportunity Card Script start here *****************************************
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.toolBarSettingIcon()));
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.preferenceOption()));
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
			
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnCasesOptionUnderPreference()));
		findElement(KanbanBoardSettingLocators.clickOnCasesOptionUnderPreference()).click();
				
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.turnOffCaseSyncCheckbox()));
		findElement(KanbanBoardSettingLocators.turnOffCaseSyncCheckbox()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnOpprotunitiesOptionUnderPreference()));
		findElement(KanbanBoardSettingLocators.clickOnOpprotunitiesOptionUnderPreference()).click();
				
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.turnOnOpportunitySyncCheckbox()));
		findElement(KanbanBoardSettingLocators.turnOnOpportunitySyncCheckbox()).click();
		
		scrollinToView(findElement(KanbanBoardSettingLocators.scrollToNewOpportunityCardCategoryDropdown()));
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnNewOpportunityCardCategoryDropdown()));
		findElement(KanbanBoardSettingLocators.clickOnNewOpportunityCardCategoryDropdown()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectCategoryFromOpportunityDropdown());
		findElement(KanbanBoardSettingLocators.selectCategoryFromOpportunityDropdown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnSaveButton()));
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOn_HomeButtonOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.clickOn_HomeButtonOnWhiteBoard()).click();
		
		for(String switchKanbanBoardToLeankorHomePage : driver.getWindowHandles())
		{
			driver.switchTo().window(switchKanbanBoardToLeankorHomePage);
		}
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnPlusIconOnLeankorHomePage()));
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardSettingLocators.clickOnPlusIconOnLeankorHomePage()).click();
		
		//actions.sendKeys(Keys.END).build().perform();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.selectOpportunitiesObjectName()));
		findElement(KanbanBoardSettingLocators.selectOpportunitiesObjectName()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		/*explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnCrossIconOnLexWindow()));
		findElement(KanbanBoardSettingLocators.clickOnCrossIconOnLexWindow()).click();*/
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnNewButtonForCreateOpportunity()));
		findElement(KanbanBoardSettingLocators.clickOnNewButtonForCreateOpportunity()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.enterOpportunityNameInPutField()));
		findElement(KanbanBoardSettingLocators.enterOpportunityNameInPutField()).sendKeys("TestOpportunityOnWhiteBoard");
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.accountFieldName());
		findElement(WhiteBoardRegressionLocators.accountFieldName()).sendKeys("Global Media");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.selectOpportuntiyCloseDate()));
		findElement(KanbanBoardSettingLocators.selectOpportuntiyCloseDate()).click();
		
		selectValueFromDropdown(findElement(KanbanBoardSettingLocators.opportunityObjectStageDropdown()),"index","5");
		
		int opportunityObjectSaveButton = findElements(KanbanBoardSettingLocators.opportunityObjectSaveButtonList()).size();
		explicitWaitElementToBeVisibleAllListItems(findElements(KanbanBoardSettingLocators.opportunityObjectSaveButtonList()));
		findElements(KanbanBoardSettingLocators.opportunityObjectSaveButtonList()).get(opportunityObjectSaveButton-2).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		KanbanBoardSettingHelper.getOpportunityNameFromOpportunityObjectPage = driver.getTitle().substring(13,40);
		System.out.println("Opportunity Standard Object title LINE 2481:"+KanbanBoardSettingHelper.getOpportunityNameFromOpportunityObjectPage);
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		close();
		
		//driver.switchTo().window(temporaryVariableForWindowHandleOfWhiteBoard);		//Comment/remove this line when script run from start
		driver.switchTo().window(getWhiteBoardWindowHandleValue);		//Uncomment this line when script run from start
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	public String verifyOpportunityCardTitleAfterCreating()
	{
		String opportunityCardTitle = findElement(WhiteBoardRegressionLocators.getTitleOfOpportunityCard()).getText();//.substring(12);
		System.out.println("Opportunity card title from kanban card on WHITE BOARD LINE 2494:-"+opportunityCardTitle);
		return opportunityCardTitle;
	}
	
	//public static String temporaryVariableForWindowHandleOfWhiteBoard;		//temporary variable for window switch
	
	public void clickOn_DefaultLinkUnderPreferences()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		//temporaryVariableForWindowHandleOfWhiteBoard = driver.getWindowHandle();		//get window handle value of white board in full screen And remove this line later complete script for Default Link ,Use variable name getWhiteBoardWindowHandleValue in clickOn_LinkSideColumn() method for agian come to white board
		//System.out.println("White Board Preferences Setting Script, White Board window handle value WhiteBoardRegressionHelper class, clickOn_DefaultLinkUnderPreferences method LINE 2503:"+temporaryVariableForWindowHandleOfWhiteBoard);			//remove this line when script run from start LINE 2503
		
		actions.dragAndDropBy(findElement(WhiteBoardRegressionLocators.opportunityCard()), 180, -50).build().perform();
		
		//**************************************************Default Link On white Board**************************************************************************************
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		driver.switchTo().window(KanbanBoardRegressionHelper.handleValueOfKanbanBoardiFrameWindow);		//uncomment this line when script from start, this will switch to iFrame window of Plan Gantt
		//driver.switchTo().window(DummyClassHelper.dummyHandleValueOfKanbanBoardiFrame);		//uncomment this line when script run from start
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOn_NavIconScroller());
		findElement(KanbanBoardRegressionLocators.clickOn_NavIconScroller()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnPlanGantt());
		findElement(KanbanBoardSettingLocators.clickOnPlanGantt()).click();
		
		switchToiFrame("boardIfram");
		
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.planGanttLoaderDynamically());
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnPlusIconToAddActivity());
		findElement(KanbanBoardSettingLocators.clickOnPlusIconToAddActivity()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.addActivity()));
		findElement(KanbanBoardSettingLocators.addActivity()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		try 
		{
			robot = new Robot();
		}
		catch(AWTException awtEx) {}
		robot.keyPress(KeyEvent.VK_ENTER);
		
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.planGanttLoaderDynamically());
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		driver.switchTo().window(getWhiteBoardWindowHandleValue);			//uncomment this line when script run from start
		//driver.switchTo().window(temporaryVariableForWindowHandleOfWhiteBoard);	//this is dummy variable for switch window,this will switch to white board screen
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnDefaultLinkOptionUnderPreference());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardSettingLocators.clickOnDefaultLinkOptionUnderPreference()).click();
				
		int projectCardLinkToProjectBoardDropdownWhiteBoard = findElements(KanbanBoardSettingLocators.projectLinkToProjectBoardAndCardCommonDropdown()).size(); 
		System.out.println("Default link page all dropdown LINE 2559:"+projectCardLinkToProjectBoardDropdownWhiteBoard);
		
		//Click on Project Dropdown
		findElements(KanbanBoardSettingLocators.projectLinkToProjectBoardAndCardCommonDropdown()).get(projectCardLinkToProjectBoardDropdownWhiteBoard-3).click();
				
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnFolderName()));
		findElement(KanbanBoardSettingLocators.clickOnFolderName()).click();
		explicitWaitElementBy("elementToBeLocated",KanbanBoardSettingLocators.clickOnProjectName());
		findElement(KanbanBoardSettingLocators.clickOnProjectName()).click();
				
		//Click on Link to project board		
		findElements(KanbanBoardSettingLocators.projectLinkToProjectBoardAndCardCommonDropdown()).get(projectCardLinkToProjectBoardDropdownWhiteBoard-2).click();
		explicitWaitElementBy("invisibilityOfElementLocated",KanbanBoardSettingLocators.loadMaskAfterSave());
		explicitWaitElementBy("elementToBeLocated",KanbanBoardSettingLocators.selectPlanBoard());
		findElement(KanbanBoardSettingLocators.selectPlanBoard()).click();
				
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		//Click On Card dropdown
		findElements(KanbanBoardSettingLocators.projectLinkToProjectBoardAndCardCommonDropdown()).get(projectCardLinkToProjectBoardDropdownWhiteBoard-1).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.selectActivityToLink());
		findElement(WhiteBoardRegressionLocators.selectActivityToLink()).click();
				
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnSaveButton()));
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();		
				
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//driver.switchTo().window(DummyClassHelper.dummyHandleValueOfKanbanBoardiFrame);						//comment/remove this line after complete script for Default Link
		driver.switchTo().window(KanbanBoardRegressionHelper.handleValueOfKanbanBoardiFrameWindow);		//uncomment this line when script run from start, this will switch to
		
		switchToiFrame("boardIfram");
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.planGanttSettingGearIcon());
		findElement(KanbanBoardSettingLocators.planGanttSettingGearIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.planGanttZoomToFit());
		findElement(KanbanBoardSettingLocators.planGanttZoomToFit()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	public boolean verifyWhiteBoardCardMiniatureOnActivity()
	{
		boolean cardIsVisible = false;
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.waitUntillActivityIsVisible());
		int cardCount = findElements(WhiteBoardRegressionLocators.getMiniatureCountOnActivity()).size();
		System.out.println("Miniature count on activity for white board cards LINE 2609:"+cardCount);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		for(int i=1; i<=cardCount; i++)
		{
			cardIsVisible = findElement(By.xpath("//div[@id='customganttpanel-1011-timelineview']//following-sibling::table[3]//div[contains(@id,'customganttpanel-')]//div[@class='task-body-parent-custom projectgantt']/child::div[2]/div["+i+"]")).isDisplayed();
			System.out.print(cardIsVisible +" ");
		}
		System.out.println("\nActivity Miniature:"+cardIsVisible);
		return cardIsVisible;
	}
	
	public void clickOn_BoardSettingUnderPreferences()
	{
		//**************************************************Board Setting Script*****************************************************************
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnBoardSettingUnderPrefeneces());
		findElement(WhiteBoardRegressionLocators.clickOnBoardSettingUnderPrefeneces()).click();
		int cardEffortIndicatorAndUseChatterFromLinkedRecord = findElements(KanbanBoardSettingLocators.boardSettingBothDropdownList()).size();
		System.out.println("Card Effort Indicator and Use Chatter From Linked Record Both Dropdown list count White Board LINE 2633:"+cardEffortIndicatorAndUseChatterFromLinkedRecord);
		
		//click On Card Effort Indicator Dropdown
		webElement = findElements(KanbanBoardSettingLocators.boardSettingBothDropdownList()).get(cardEffortIndicatorAndUseChatterFromLinkedRecord-2);
		explicitWaitVisibilityOf(webElement);
		webElement.click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectValueFromCardEffortIndicatorDropdownHours());
		findElement(KanbanBoardSettingLocators.selectValueFromCardEffortIndicatorDropdownHours()).click();
						
		//Click on Use Chatter From Linked Record dropdown
		webElement = findElements(KanbanBoardSettingLocators.boardSettingBothDropdownList()).get(cardEffortIndicatorAndUseChatterFromLinkedRecord-1);
		explicitWaitVisibilityOf(webElement);
		webElement.click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectValueFromChatterFromLinkedRecordDropdownCasesChatter());
		findElement(KanbanBoardSettingLocators.selectValueFromChatterFromLinkedRecordDropdownCasesChatter()).click();
		int boardSettingAllCheckBoxSize = findElements(KanbanBoardSettingLocators.boardSettingAllCheckBox()).size();
		System.out.println("Board Setting all checkboxes size:"+boardSettingAllCheckBoxSize);
		
		for(int i=4; i<=8; i++)
		{
			findElement(By.xpath("//div[contains(@id,'ext-boardSetting-')]//div[contains(@class,'x-pack-start')]/div["+i+"]/div[@class='x-component-outer']")).click();
		}
				
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnSaveButton()));
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());		
						
		//Uncheck all checkbox Setting from Board Setting
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnBoardSettingUnderPrefeneces());		
		findElement(WhiteBoardRegressionLocators.clickOnBoardSettingUnderPrefeneces()).click();		
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		//Click on Use Chatter From Linked Record dropdown and select Opportunities Chatter value
		webElement = findElements(KanbanBoardSettingLocators.boardSettingBothDropdownList()).get(cardEffortIndicatorAndUseChatterFromLinkedRecord-1);
		explicitWaitVisibilityOf(webElement);
		webElement.click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectValueFromChatterFromLinkedRecordDropdownOpportunitiesChatter());
		findElement(KanbanBoardSettingLocators.selectValueFromChatterFromLinkedRecordDropdownOpportunitiesChatter()).click();
		//uncheck All checkBox
		for(int i=4; i<=8; i++)
		{
			findElement(By.xpath("//div[contains(@id,'ext-boardSetting-')]//div[contains(@class,'x-pack-start')]/div["+i+"]/div[@class='x-component-outer']")).click();
		}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnSaveButton()));
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
				
				
		//Click On Board Setting, change default value from Card Effort Indicator and Use Chatter From Linked Record dropdown
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnBoardSettingUnderPrefeneces());
		findElement(WhiteBoardRegressionLocators.clickOnBoardSettingUnderPrefeneces()).click();
				
		//click On Card Effort Indicator Dropdown and select Days from dropdown
		webElement = findElements(KanbanBoardSettingLocators.boardSettingBothDropdownList()).get(cardEffortIndicatorAndUseChatterFromLinkedRecord-2);
		explicitWaitVisibilityOf(webElement);
		webElement.click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectValueFromCardEffortIndicatorDropdownDays());
		findElement(KanbanBoardSettingLocators.selectValueFromCardEffortIndicatorDropdownDays()).click();
		
		//Click on Use Chatter From Linked Record dropdown and select Kanban Cards Chatter value
		webElement = findElements(KanbanBoardSettingLocators.boardSettingBothDropdownList()).get(cardEffortIndicatorAndUseChatterFromLinkedRecord-1);
		explicitWaitVisibilityOf(webElement);
		webElement.click();		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectValueFromChatterFromLinkedRecordDropdownKanbanCardsChatter());
		findElement(KanbanBoardSettingLocators.selectValueFromChatterFromLinkedRecordDropdownKanbanCardsChatter()).click();
				
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnSaveButton()));
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
	}
	
	public void clickOn_InboundEmailUnderPreferences()
	{
		//*******************************************************************************************************
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnInboundEmailsUnderPreferences());	
		findElement(WhiteBoardRegressionLocators.clickOnInboundEmailsUnderPreferences()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.defaultOwnerDropdown());
		findElement(KanbanBoardSettingLocators.defaultOwnerDropdown()).click(); 
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.inputFieldUnderOwnerDropdown());
		findElement(KanbanBoardSettingLocators.inputFieldUnderOwnerDropdown()).sendKeys("chirayu malviya");
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnSearchIconUnderDropdown());
		findElement(KanbanBoardSettingLocators.clickOnSearchIconUnderDropdown()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		try {Thread.sleep(1000);} catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.selectOwnerAfterSearch()));
		findElement(KanbanBoardSettingLocators.selectOwnerAfterSearch()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.defaultCategoryDropdown());
		findElement(KanbanBoardSettingLocators.defaultCategoryDropdown()).click();
		
		explicitWaitElementToBeClickable(findElement(WhiteBoardRegressionLocators.selectCategoryFromDefaultCategoryDropdown()));
		findElement(WhiteBoardRegressionLocators.selectCategoryFromDefaultCategoryDropdown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnSaveButton()));
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
	}
	
	public void cloneCompleteWhiteBoardWithStartDate()
	{
		//********************************************************************************************************************
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.cloneKanbanBoardOption());
		findElement(KanbanBoardSettingLocators.cloneKanbanBoardOption()).click();
	
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.cloneProjectBoardName());
		findElement(KanbanBoardSettingLocators.cloneProjectBoardName()).sendKeys("Clone White Board by Automation with Start Date");
	
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectProjectDropdown());
		findElement(KanbanBoardSettingLocators.selectProjectDropdown()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectProjectFromDropdownForClone());
		findElement(KanbanBoardSettingLocators.selectProjectFromDropdownForClone()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.cloneProjectStartDateCalender());
		findElement(KanbanBoardSettingLocators.cloneProjectStartDateCalender()).click();
	
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectHighlightedDate());
		String getSelectedDateOfToday = findElement(KanbanBoardSettingLocators.selectHighlightedDate()).getText();
		System.out.println("Select highlighted date on White board while cloning with start date LINE 2792:"+getSelectedDateOfToday);
		
		int getDayPanelList = findElements(KanbanBoardSettingLocators.dayPanelList()).size();
		System.out.println("List of all days :"+getDayPanelList);
		
		for(int i=1; i<=getDayPanelList; i++)
		{
			String getTextOfAllLiElements = findElement(By.xpath("//div[contains(@class,'datepicker-dropdown')]//div[@class='datepicker-panel']/ul[3]/li["+i+"]")).getText();
			
			if(getSelectedDateOfToday.equals(getTextOfAllLiElements))
			{
				try {Thread.sleep(1500);}catch(InterruptedException ie) {}
				//findElement(By.xpath("//div[contains(@class,'datepicker-dropdown')]//ul[3]/li["+(Integer.parseInt(getTextOfAllLiElements)+2)+"]")).click();
				findElement(By.xpath("//div[contains(@class,'datepicker-dropdown')]//ul[3]/li["+(i+2)+"]")).click();
			}
		}
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.createButtonForCloneKanbanBoard()));
		findElement(KanbanBoardSettingLocators.createButtonForCloneKanbanBoard()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		for(String webhandle : driver.getWindowHandles())
		{
			driver.switchTo().window(webhandle);
		}
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	
	public String isWhiteBoardClonedWithStartDate()
	{
		String getTitleOfClonedKanbanBoard = driver.getTitle();
		System.out.println("Cloned white board title with start date LINE 2825: "+getTitleOfClonedKanbanBoard);
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}	
		return getTitleOfClonedKanbanBoard;
	}
	
	
	public void cloneCompleteWhiteBoardWithDueDate()
	{
		//********************************************************************************************************************
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
	
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.cloneKanbanBoardOption());
		findElement(KanbanBoardSettingLocators.cloneKanbanBoardOption()).click();
	
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.cloneProjectBoardName());
		findElement(KanbanBoardSettingLocators.cloneProjectBoardName()).sendKeys("Clone White Board by Automation with Due Date");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectProjectDropdown());
		findElement(KanbanBoardSettingLocators.selectProjectDropdown()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectProjectFromDropdownForClone());
		findElement(KanbanBoardSettingLocators.selectProjectFromDropdownForClone()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.cloneProjectDueDateCalender());
		findElement(KanbanBoardSettingLocators.cloneProjectDueDateCalender()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectHighlightedDate());
		String getSelectedDateOfToday = findElement(KanbanBoardSettingLocators.selectHighlightedDate()).getText();
		System.out.println("Select highlighted date on white board while cloning with due date LINE 2858:"+getSelectedDateOfToday);
		
		int getDayPanelList = findElements(KanbanBoardSettingLocators.dayPanelList()).size();
		System.out.println("List of all days :"+getDayPanelList);
				
		for(int i=1; i<=getDayPanelList; i++)
		{
			String getTextOfAllLiElements = findElement(By.xpath("//div[contains(@class,'datepicker-dropdown')]//div[@class='datepicker-panel']/ul[3]/li["+i+"]")).getText();
			
			if(getSelectedDateOfToday.equals(getTextOfAllLiElements))
			{
				try {Thread.sleep(1500);}catch(InterruptedException ie) {}
				//findElement(By.xpath("//div[contains(@class,'datepicker-dropdown')]//ul[3]/li["+(Integer.parseInt(getTextOfAllLiElements)+7)+"]")).click();
				findElement(By.xpath("//div[contains(@class,'datepicker-dropdown')]//ul[3]/li["+(i-2)+"]")).click();
			}
		}
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.createButtonForCloneKanbanBoard()));
		findElement(KanbanBoardSettingLocators.createButtonForCloneKanbanBoard()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		for(String webhandle : driver.getWindowHandles())
		{
			driver.switchTo().window(webhandle);
		}
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	
	public String isWhiteBoardClonedWithDueDate()
	{
		String getTitleOfClonedKanbanBoard = driver.getTitle();
		System.out.println("Cloned white board title with due date LINE 2891: "+getTitleOfClonedKanbanBoard);
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		return getTitleOfClonedKanbanBoard;
	}
	
	
	public void clickOnPlusAndMinusIconWhiteBoard()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		for(int i=1; i<=5; i++)
		{
			explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.plusIcon());
			findElement(WhiteBoardRegressionLocators.plusIcon()).click();
			try {Thread.sleep(1500);}catch(InterruptedException ie) {}
			
			if(i==5)
			{
				for(int j=5; j>=1; j--)
				{
					explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.minusIcon());
					findElement(WhiteBoardRegressionLocators.minusIcon()).click();
					try {Thread.sleep(1500);}catch(InterruptedException ie) {}
				}
			}
		}
	}
	
	
	public void panAndResetWhiteBoard()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.panBoardIcon());
		findElement(KanbanBoardSettingLocators.panBoardIcon()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.whiteBoardBackground());
		actions.moveToElement(findElement(WhiteBoardRegressionLocators.whiteBoardBackground())).build().perform();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		actions.clickAndHold(findElement(WhiteBoardRegressionLocators.whiteBoardBackground())).build().perform();
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.randomArea());
		actions.moveToElement(findElement(WhiteBoardRegressionLocators.randomArea())).release().build().perform();
				
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.resetKanbanBoardIcon());
		findElement(KanbanBoardSettingLocators.resetKanbanBoardIcon()).click();
	}
	
	
	public void viewAllChatterOnWhiteBoard()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		//temporaryVariableForWindowHandleOfWhiteBoard = driver.getWindowHandle();			//Need to remove this line after complete chatter script
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.viewAllChatterIcon());
		findElement(KanbanBoardSettingLocators.viewAllChatterIcon()).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.kanbanBoardChatterOpenButton());
		findElement(WhiteBoardRegressionLocators.kanbanBoardChatterOpenButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		KanbanBoardSettingHelper.getIframeSRCAttribute = findElement(KanbanBoardSettingLocators.inspectIframe()).getAttribute("src");
		System.out.println("src attribute value of white board chatter LINE 2957:"+KanbanBoardSettingHelper.getIframeSRCAttribute);
		
		driver.switchTo().frame(findElement(KanbanBoardSettingLocators.iFrameSrcValueAndSwitchTo()));
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnPostLink()));
		findElement(KanbanBoardSettingLocators.clickOnPostLink()).click();
		
		explicitWaitElementToBeLocated(KanbanBoardSettingLocators.afterClickOnPostLinkWindowsVisibility());
		boolean postWindowVisibility = findElement(KanbanBoardSettingLocators.afterClickOnPostLinkWindowsVisibility()).isDisplayed();
		System.out.println("Post window is visible LINE 2966:"+postWindowVisibility);
				
		if(postWindowVisibility==true)
		{	
			KanbanBoardSettingHelper.childiFrameValue = findElement(KanbanBoardSettingLocators.inspectChildiFrame()).getAttribute("class");
			System.out.println("Child iFrame classs attribute value :"+KanbanBoardSettingHelper.childiFrameValue);
			
			driver.switchTo().frame(findElement(KanbanBoardSettingLocators.getChildiFrameClassAttributeValue()));
			
			explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnChatterTextArea()));
			findElement(KanbanBoardSettingLocators.clickOnChatterTextArea()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			boolean chatterWindow = findElement(KanbanBoardSettingLocators.writeOnChatterTextArea()).isDisplayed();
			System.out.println("Chatter Window visibility LINE 2980:"+chatterWindow);
			
			if(chatterWindow=true)
			{
				explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.writeOnChatterTextArea()));
				findElement(KanbanBoardSettingLocators.writeOnChatterTextArea()).sendKeys("Hello..!! White Board Chatter!!");
				driver.switchTo().parentFrame();
				explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.chatterShareButton()));
				findElement(KanbanBoardSettingLocators.chatterShareButton()).click();
				
				try {Thread.sleep(1500);}catch(InterruptedException ie) {}
				
				explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getTextFromChatterSubWindow());
				String getChatterTextViewAllChatterWhiteBoard = findElement(WhiteBoardRegressionLocators.getTextFromChatterSubWindow()).getText();
				System.out.println("Get chatter text for white board chatter LINE 2994:"+getChatterTextViewAllChatterWhiteBoard);
				
				driver.switchTo().defaultContent();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.closeChatterWindow()));
				findElement(KanbanBoardSettingLocators.closeChatterWindow()).click();
			}
		}
		
		openNewBrowserWindowTab(KanbanBoardSettingHelper.getIframeSRCAttribute);
		
		
		boolean isUrlVisible = wait.until(ExpectedConditions.urlContains(KanbanBoardSettingHelper.getIframeSRCAttribute));
		System.out.println("is URL visible White board LINE 3008:"+isUrlVisible);
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getTextFromChatterSubWindow());
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
	}
	
	
	public String isViewAllChatterOnWhiteBoard()
	{
		String text = findElement(WhiteBoardRegressionLocators.getTextFromChatterSubWindow()).getText();
		System.out.println("New window opened get text from chatter window for White board LINE 3018:"+text+"\n*****************************************************************************************************");
		return text;
	}
	
	
	public void viewAllChatterOnCaseCard()
	{
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnCaseCardUnderViewAllChatterOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.clickOnCaseCardUnderViewAllChatterOnWhiteBoard()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		KanbanBoardSettingHelper.getIframeSRCAttribute = findElement(KanbanBoardSettingLocators.inspectIframe()).getAttribute("src");
		System.out.println("src LINE 3035:"+KanbanBoardSettingHelper.getIframeSRCAttribute);
		
		driver.switchTo().frame(findElement(KanbanBoardSettingLocators.iFrameSrcValueAndSwitchTo()));
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnPostLink()));
		findElement(KanbanBoardSettingLocators.clickOnPostLink()).click();
		
		explicitWaitElementToBeLocated(KanbanBoardSettingLocators.afterClickOnPostLinkWindowsVisibility());
		boolean postWindowVisibility = findElement(KanbanBoardSettingLocators.afterClickOnPostLinkWindowsVisibility()).isDisplayed();
		System.out.println("Post window is visible LINE 3044:"+postWindowVisibility);
				
		if(postWindowVisibility==true)
		{	
			KanbanBoardSettingHelper.childiFrameValue = findElement(KanbanBoardSettingLocators.inspectChildiFrame()).getAttribute("class");
			System.out.println("Child iFrame classs attribute value :"+KanbanBoardSettingHelper.childiFrameValue);
			
			driver.switchTo().frame(findElement(KanbanBoardSettingLocators.getChildiFrameClassAttributeValue()));
			
			explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnChatterTextArea()));
			findElement(KanbanBoardSettingLocators.clickOnChatterTextArea()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			boolean chatterWindow = findElement(KanbanBoardSettingLocators.writeOnChatterTextArea()).isDisplayed();
			System.out.println("Chatter Window visibility LINE 3058:"+chatterWindow);
			
			if(chatterWindow=true)
			{
				explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.writeOnChatterTextArea()));
				findElement(KanbanBoardSettingLocators.writeOnChatterTextArea()).sendKeys("Hello..!! Chatter on Finance category case card on White board.");
				driver.switchTo().parentFrame();
				explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.chatterShareButton()));
				findElement(KanbanBoardSettingLocators.chatterShareButton()).click();
				
				/*explicitWaitElementBy("elementToBeLocated",KanbanBoardSettingLocators.textDivArea());
				KanbanBoardSettingHelper.textAreaIDAttribute = findElement(KanbanBoardSettingLocators.textDivArea()).getAttribute("id");
				System.out.println("Sales category Kanban Card Chatter text Area Class Attribute LINE 3078:"+KanbanBoardSettingHelper.textAreaIDAttribute);
				String chatterText = findElement(KanbanBoardSettingLocators.getChatterTextFromHomePage()).getText();
				System.out.println("After Chatter get text from chatter sub window:"+chatterText);*/
				
				explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getTextFromChatterSubWindow());
				String getChatterTextForCaseCardOnWhiteBoard = findElement(WhiteBoardRegressionLocators.getTextFromChatterSubWindow()).getText();
				System.out.println("Get chatter text for white board on case card LINE 3076:"+getChatterTextForCaseCardOnWhiteBoard);
				
				driver.switchTo().defaultContent();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.closeChatterWindow()));
				findElement(KanbanBoardSettingLocators.closeChatterWindow()).click();
			}
		}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.closeChatterWindow());
		findElement(KanbanBoardSettingLocators.closeChatterWindow()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.selectCaseCardForVerifyChatter());
		findElement(WhiteBoardRegressionLocators.selectCaseCardForVerifyChatter()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.salesCategoryCardLoadMask());
		driver.switchTo().frame(findElement(KanbanBoardSettingLocators.iFrameSrcValueAndSwitchTo()));
	}
	
	public String verifyChatterOnCaseCard()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getTextFromChatterSubWindow());
		String financeCategoryCaseCardChatterTextOnWhiteBoard = findElement(WhiteBoardRegressionLocators.getTextFromChatterSubWindow()).getText();
		System.out.println("Finance Category Case Card Chatter text on White board LINE 3101:"+financeCategoryCaseCardChatterTextOnWhiteBoard);
		return financeCategoryCaseCardChatterTextOnWhiteBoard;
	}
	
	
	public void viewAllChatterOnOpportunityCard()
	{
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		/*explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.viewAllChatterIcon());
		findElement(KanbanBoardSettingLocators.viewAllChatterIcon()).click();*/
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnOpportunityCardUnderViewAllChatterOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.clickOnOpportunityCardUnderViewAllChatterOnWhiteBoard()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		KanbanBoardSettingHelper.getIframeSRCAttribute = findElement(KanbanBoardSettingLocators.inspectIframe()).getAttribute("src");
		System.out.println("src LINE 3120:"+KanbanBoardSettingHelper.getIframeSRCAttribute);
		
		driver.switchTo().frame(findElement(KanbanBoardSettingLocators.iFrameSrcValueAndSwitchTo()));
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnPostLink()));
		findElement(KanbanBoardSettingLocators.clickOnPostLink()).click();
		
		explicitWaitElementToBeLocated(KanbanBoardSettingLocators.afterClickOnPostLinkWindowsVisibility());
		boolean postWindowVisibility = findElement(KanbanBoardSettingLocators.afterClickOnPostLinkWindowsVisibility()).isDisplayed();
		System.out.println("Post window is visible LINE 3129:"+postWindowVisibility);
				
		if(postWindowVisibility==true)
		{	
			KanbanBoardSettingHelper.childiFrameValue = findElement(KanbanBoardSettingLocators.inspectChildiFrame()).getAttribute("class");
			System.out.println("Child iFrame classs attribute value :"+KanbanBoardSettingHelper.childiFrameValue);
			
			driver.switchTo().frame(findElement(KanbanBoardSettingLocators.getChildiFrameClassAttributeValue()));
			
			explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnChatterTextArea()));
			findElement(KanbanBoardSettingLocators.clickOnChatterTextArea()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			boolean chatterWindow = findElement(KanbanBoardSettingLocators.writeOnChatterTextArea()).isDisplayed();
			System.out.println("Chatter Window visibility LINE 3143:"+chatterWindow);
			
			if(chatterWindow=true)
			{
				explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.writeOnChatterTextArea()));
				findElement(KanbanBoardSettingLocators.writeOnChatterTextArea()).sendKeys("Hello..!! Chatter on Marketing category opportunity card on White board.");
				driver.switchTo().parentFrame();
				explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.chatterShareButton()));
				findElement(KanbanBoardSettingLocators.chatterShareButton()).click();
				
				/*explicitWaitElementBy("elementToBeLocated",KanbanBoardSettingLocators.textDivArea());
				KanbanBoardSettingHelper.textAreaIDAttribute = findElement(KanbanBoardSettingLocators.textDivArea()).getAttribute("id");
				System.out.println("Sales category Kanban Card Chatter text Area Class Attribute LINE 3078:"+KanbanBoardSettingHelper.textAreaIDAttribute);
				String chatterText = findElement(KanbanBoardSettingLocators.getChatterTextFromHomePage()).getText();
				System.out.println("After Chatter get text from chatter sub window:"+chatterText);*/
				
				explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getTextFromChatterSubWindow());
				String getChatterTextForCaseCardOnWhiteBoard = findElement(WhiteBoardRegressionLocators.getTextFromChatterSubWindow()).getText();
				System.out.println("Get chatter text for white board on case card LINE 3161:"+getChatterTextForCaseCardOnWhiteBoard);
				
				driver.switchTo().defaultContent();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.closeChatterWindow()));
				findElement(KanbanBoardSettingLocators.closeChatterWindow()).click();
			}
		}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.closeChatterWindow());
		findElement(KanbanBoardSettingLocators.closeChatterWindow()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.selectOpportunityForVerifyChatter());
		findElement(WhiteBoardRegressionLocators.selectOpportunityForVerifyChatter()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.salesCategoryCardLoadMask());
		
		driver.switchTo().frame(findElement(KanbanBoardSettingLocators.iFrameSrcValueAndSwitchTo()));
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	
	public String verifyChatterOnOpportunityCard()
	{
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.getTextFromChatterSubWindow());
		String marketingCategoryOpportunityCardChatterTextOnWhiteBoard = findElement(WhiteBoardRegressionLocators.getTextFromChatterSubWindow()).getText();
		System.out.println("Finance Category Case Card Chatter text on White board LINE 3189:"+marketingCategoryOpportunityCardChatterTextOnWhiteBoard);
		return marketingCategoryOpportunityCardChatterTextOnWhiteBoard;
	}
	
	
	public void history_ViewAllCardWhiteBoard()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.viewAllCardHistoryIcon());
		findElement(WhiteBoardRegressionLocators.viewAllCardHistoryIcon()).click();
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		try {robot = new Robot();}catch(AWTException awtEx) {}
		robot.mouseMove(100, 100);
		actions.click().build().perform();
	}
	
	
	
	public void boardDesignWhiteBoard()
	{//DummyClassHelper.dummyToBoard();
		//********************************************************Upload Image on Import Tab of Board Design********************************************************
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnBoardDesignIcon());
		findElement(WhiteBoardRegressionLocators.clickOnBoardDesignIcon()).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.importIconUnderBoardDesign());
		findElement(WhiteBoardRegressionLocators.importIconUnderBoardDesign()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.uploadFileOnImport());
		findElement(WhiteBoardRegressionLocators.uploadFileOnImport()).sendKeys("E:\\Wallpaper/nobita.jpg");
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.uploadButtonOnImportSubWindow());
		findElement(WhiteBoardRegressionLocators.uploadButtonOnImportSubWindow()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnSuccessMessageAfterImageUpload());
		findElement(WhiteBoardRegressionLocators.clickOnSuccessMessageAfterImageUpload()).click();
		
		//********************************************************Upload Image from Library Tab of Board Design to White Board******************************************************** 
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnLibraryIcon());
		findElement(WhiteBoardRegressionLocators.clickOnLibraryIcon()).click();
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.selectImageFromLibraryWindow());
		
		try {robot = new Robot();}catch(AWTException awtEx) {};
		robot.mouseMove(587,300);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnRemoveIconFromWhiteBoard());
		findElement(WhiteBoardRegressionLocators.clickOnRemoveIconFromWhiteBoard()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.yesButtonAfterDelete());
		findElement(WhiteBoardRegressionLocators.yesButtonAfterDelete()).click();
	}
	
	
	public void createCustomZoneOnWhiteBoard()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		//************************************************For creating custom zone on White board**************************************************************************
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnCreateIconOnWhiteBoard());
		findElement(WhiteBoardRegressionLocators.clickOnCreateIconOnWhiteBoard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.enterCustomZoneTitle());
		findElement(WhiteBoardRegressionLocators.enterCustomZoneTitle()).sendKeys("CreateCustomZoneForWhiteBoard");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.openZoneModeDropDown());
		findElement(WhiteBoardRegressionLocators.openZoneModeDropDown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.selectZoneModeAsRowFromDropDown());
		findElement(WhiteBoardRegressionLocators.selectZoneModeAsRowFromDropDown()).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnCreateButton());
		findElement(WhiteBoardRegressionLocators.clickOnCreateButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//********************************************************Move Opportunity card to Custom Created Zone on WhiteBoard***********************************************
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.selectOpportunityCardForMoveToZone());
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		actions.dragAndDropBy(findElement(WhiteBoardRegressionLocators.selectOpportunityCardForMoveToZone()), 300, 100).build().perform();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		//********************************************************Move Custom Created Zone on WhiteBoard***********************************************
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnMoveZoneTab());
		findElement(WhiteBoardRegressionLocators.clickOnMoveZoneTab()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.moveCustomCreatedZoneToAnotherPlaceOnWhiteBoard());
		actions.dragAndDropBy(findElement(WhiteBoardRegressionLocators.moveCustomCreatedZoneToAnotherPlaceOnWhiteBoard()), 300 , 200).build().perform();
		
		
		
		
		
		
		
		
		
		
		
	
				
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		    	
		    	try {Thread.sleep(2000);}catch(InterruptedException ie) {}

				explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickingOnfilterCard()));
				findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickingOnfilterCard()).click();
		    	
		    	
		    	try {Thread.sleep(1000);}catch(InterruptedException ie) {}

				explicitWaitElementToBeVisibleAllListItems(findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllfilterdropdownElement()));
				int SizeofallfilterElement = findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllfilterdropdownElement()).size();
		    	
		         findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllfilterdropdownElement()).get(SizeofallfilterElement - 3).click();
				 
				 
				
		
		
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		  	   /*
		  	   explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.WriteActivityNameInputTextfield()));
		  	   findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.WriteActivityNameInputTextfield()).clear();
		  	//	try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		  	   
		  	   findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.WriteActivityNameInputTextfield()).sendKeys("Activity");
		  	   findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.WriteActivityNameInputTextfield()).sendKeys(Keys.ENTER);
		  	   
		  	 */
		  	   		
		  	   
		  	   findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.WriteActivityNameInputTextfield()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
		  	   findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.WriteActivityNameInputTextfield()).sendKeys("Activity1");
		  	   
		         
		         
		         
		         
		
		         
		         
		         
		  		
		         
		         
		         
		         
		         
		         
		         
		         
		
	}
}