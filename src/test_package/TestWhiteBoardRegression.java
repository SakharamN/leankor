package test_package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common_package.CommonMethodsOfWebDriver;
import helper_package.KanbanBoardSettingHelper;
import helper_package.WhiteBoardRegressionHelper;
import pom_package.KanbanBoardRegressionLocators;
import pom_package.KanbanBoardSettingLocators;
import pom_package.WhiteBoardRegressionLocators;


public class TestWhiteBoardRegression extends CommonMethodsOfWebDriver {

	WhiteBoardRegressionHelper whiteBoardRegression = new WhiteBoardRegressionHelper();
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void folderProjectValueStream()
	{
		whiteBoardRegression.createFolderProjectValueStream();
	}
	
	@Test
	public void addTextToBoard()
	{
		whiteBoardRegression.addTextToOnWhiteBoard();
		softAssert.assertEquals(true, whiteBoardRegression.isTextToBoardVisible());
		softAssert.assertAll();
	}
	
	@Test
	public void linkTextWhiteBoard()
	{
		whiteBoardRegression.linkWhiteBoardTextToKanbanBoardCard();
	}
	
	@Test
	public void resizeTextWhiteBoard()
	{
		whiteBoardRegression.resizeTextOnWhiteBoard();
	}
	
	@Test
	public void shuffleTextUpAndDownArrowOnWhiteBoard()
	{
		whiteBoardRegression.shuffleTextUpOnWhiteBoard();
	}
	
	@Test
	public void chatterOnTextWhiteBoard()
	{
		whiteBoardRegression.chatterOnFirstTextOnWhiteBoard();
	}
	
	@Test
	public void editTextOnWhiteBoard()
	{
		whiteBoardRegression.updateFirstTextOfWhiteBoard();
	}
	
	@Test
	public void deleteTextFromWhiteBoard()
	{
		whiteBoardRegression.deleteBothTextFromWhiteBoard();
	}
	
	
	@Test
	public void addVisualAnalyticWhiteBoard()
	{
		whiteBoardRegression.addVisualAnalyticsOnWhiteBoard();
	}
	
	@Test
	public void cloneVisualAnalyticChart()
	{
		whiteBoardRegression.cloneVisualAnalyticChart();
	}
	
	@Test
	public void delectVisualAnalyticChart()
	{
		whiteBoardRegression.delectVisualAnalytics();
	}
	
	@Test
	public void addImageOnWhiteBoard()
	{
		whiteBoardRegression.addImageToWhiteBoard();
	}
	
	@Test
	public void cloneImageWhiteBoard()
	{
		whiteBoardRegression.cloneImageOnWhiteBoard();
	}
	
	@Test
	public void resizeImageWhiteBoard()
	{
		whiteBoardRegression.resizeImageOnWhiteBoard();
	}
	
	@Test
	public void shuffleImageOnWhiteBoard()
	{
		whiteBoardRegression.shuffleImageUpAndDownOnWhiteBoard();
	}
	
	@Test
	public void chatterOnImageWhiteBoard()
	{
		whiteBoardRegression.chatterOnFirstImage();
	}
	
	@Test
	public void linkOnImageWhiteBoard()
	{
		whiteBoardRegression.linkImageToCard();
	}
	
	@Test
	public void deleteImageWhiteBoard()
	{
		whiteBoardRegression.deleteImageFromWhiteBoard();
	}
	
	@Test
	public void addKanbanCardWhiteBoard()
	{
		whiteBoardRegression.addCardToWhiteBoard();
		softAssert.assertEquals("Marketing", whiteBoardRegression.verifyCardCategory());
		softAssert.assertEquals("0.1", whiteBoardRegression.verifyCardDuration());
		softAssert.assertEquals("0", whiteBoardRegression.verifyCardHarveyBall());
		softAssert.assertEquals("New Card", whiteBoardRegression.verifyCardTitleDescriptino());
		softAssert.assertEquals(whiteBoardRegression.cardStartDateWhileCreating, whiteBoardRegression.verifyCardDueDate());
		softAssert.assertEquals("priorityRedStar", whiteBoardRegression.verifyCardPriority());
		softAssert.assertAll();
	}
	
	@Test
	public void updateKanbanCardOnWhiteBoard()
	{
		whiteBoardRegression.updateKanbanCard();
		softAssert.assertEquals("Operations", whiteBoardRegression.verifyUpdatedCardCategory());
		softAssert.assertEquals("15", whiteBoardRegression.verifyUpdatedCardDuration());
		softAssert.assertEquals("Update card title from New Card to LATEST CARD", whiteBoardRegression.verifyUpdatedCardTitleDescription());
		softAssert.assertEquals(whiteBoardRegression.getUpdatedCardDuedate, whiteBoardRegression.verifyUpdatedCardDueDate());
		softAssert.assertEquals("priorityBlueStar", whiteBoardRegression.verifyUpdatedCardPriority());
		softAssert.assertAll();
	}
	
	@Test
	public void kanbanCardStatusWhiteBoard()
	{
		whiteBoardRegression.clickOn_StatusSideColumn();
		softAssert.assertEquals(whiteBoardRegression.cardStartDateWhileCreating, whiteBoardRegression.verifyDateOfStatusRegister());
		softAssert.assertEquals("Card is upto date.", whiteBoardRegression.verifyStatusRegisterDescription());
		softAssert.assertEquals("Green", whiteBoardRegression.verifyOnTimeColoumn());
		softAssert.assertEquals("Amber", whiteBoardRegression.verifyOnQualityColoumn());
		softAssert.assertEquals("Red", whiteBoardRegression.verifyOnBudgetColoumn());
		softAssert.assertAll();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}
	
	@Test
	public void kanbanCardTaskWhiteBoard()
	{
		whiteBoardRegression.clickOn_TaskSideColumn();
		softAssert.assertEquals("Task 1", whiteBoardRegression.verifyTaskName());
		softAssert.assertEquals(true, whiteBoardRegression.verifyTaskDate());
		softAssert.assertEquals("Not Started", whiteBoardRegression.verifyTaskStatus());
		softAssert.assertAll();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}
	
	@Test
	public void updateTaskWhiteBoard()
	{
		whiteBoardRegression.updateTaskWhiteBoard();
		softAssert.assertEquals("This is updated task name : Task2", whiteBoardRegression.verifyEditTaskSubject());
		softAssert.assertEquals(true, whiteBoardRegression.verifyEditTaskDate());
		softAssert.assertEquals("In Progress", whiteBoardRegression.verifyEditTaskStatus());
		softAssert.assertAll();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}
	
	@Test
	public void kanbanCardLogtimeWhiteBoard()
	{
		whiteBoardRegression.clickOn_LogtimeSideColumn();
		softAssert.assertEquals(whiteBoardRegression.cardStartDateWhileCreating, whiteBoardRegression.verifyLogTimeDateOnWhiteBoard());
		softAssert.assertEquals("This is updated task name : Task2", whiteBoardRegression.verifyLogTimeTaskNameOnWhiteBoard());
		softAssert.assertEquals("16", whiteBoardRegression.verifyLogTimeHoursColumnOnWhiteBoard());
		softAssert.assertEquals(true, whiteBoardRegression.verifyLogTimeDescriptionOnWhiteBoard());
		softAssert.assertAll();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}
	
	@Test
	public void kanbanCardEditLogtimeWhiteBoard()
	{
		whiteBoardRegression.editLogTimeWhiteBoard();
		softAssert.assertEquals(true,whiteBoardRegression.verifyLogTimeDateAfterUpdateOnWhiteBoard());
		softAssert.assertEquals("This is updated task name : Task2", whiteBoardRegression.verifyLogTimeTaskNameAfterUpdateOnWhiteBoard());
		softAssert.assertEquals("40",whiteBoardRegression.verifyLogTimeHoursColumnAfterUpdateOnWhiteBoard());
		softAssert.assertEquals("Update log time detail", whiteBoardRegression.verifyLogTimeDescriptionAfterUpdateOnWhiteBoard());
		softAssert.assertAll();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}
	
	
	@Test
	public void kanbanCardRiskOnWhiteBoard()
	{
		whiteBoardRegression.clickOn_RiskSideColumn();
		softAssert.assertEquals(whiteBoardRegression.cardStartDateWhileCreating, whiteBoardRegression.verifyRiskDateBeforeUpdateOnWhiteBoard());
		softAssert.assertEquals("This is updated task name : Task2", whiteBoardRegression.verifyTaskNameOnRiskBeforeUpdateOnWhiteBoard());
		softAssert.assertEquals("6",whiteBoardRegression.verifyRiskScoreBeforeUpdateOnWhiteBoard());
		softAssert.assertEquals("Issue", whiteBoardRegression.verifyRiskTypeBeforeUpdateOnWhiteBoard());
		softAssert.assertEquals("Relationship between conditions, events, or tasks such that one cannot begin or be-completed until one or more other conditions, events, or tasks have occurred, begun, or completed",whiteBoardRegression.verifyRiskDetailBeforeUpdateOnWhiteBoard());
		softAssert.assertAll();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}
	
	@Test
	public void kanbanCardEditRiskOnWhiteBoard()
	{
		whiteBoardRegression.editRiskOnWhiteBoard();
		softAssert.assertEquals(true,whiteBoardRegression.verifyRiskDateAfterUpdateOnWhiteBoard());
		softAssert.assertEquals("This is updated task name : Task2",whiteBoardRegression.verifyTaskNameOnRiskAfterUpdateOnWhiteBoard());
		softAssert.assertEquals("6",whiteBoardRegression.verifyRiskScoreAfterUpdateOnWhiteBoard());
		softAssert.assertEquals("Business Dependency", whiteBoardRegression.verifyRiskTypeAfterUpdateOnWhiteBoard());
		softAssert.assertEquals("Detail of Risk is updated : Now it is changed from Issue to Business Dependency",whiteBoardRegression.verifyRiskDetailAfterUpdateOnWhiteBoard());
		softAssert.assertAll();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}
	
	@Test
	public void kanbanCardLinkingWhiteBoard()
	{
		whiteBoardRegression.clickOn_LinkSideColumn();
		softAssert.assertEquals(true, whiteBoardRegression.isMinatureOfWhiteBoardVisible());
		softAssert.assertAll();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		close();
	}
	
	@Test
	public void kanbanCardSubscriberWhiteBoard()
	{
		whiteBoardRegression.clickOn_SubscriberSideColumn();
		softAssert.assertEquals(true, whiteBoardRegression.verifySubscriberMovedCheckBox());
		softAssert.assertEquals(true, whiteBoardRegression.verifySubscriberDoneCheckBox());
		softAssert.assertEquals(true, whiteBoardRegression.verifySubscriberCardPastDueCheckBox());
		softAssert.assertEquals(true, whiteBoardRegression.verifySubscriberTaskPastDueCheckBox());
		softAssert.assertEquals(true, whiteBoardRegression.verifySubscriberTaskCompletedCheckBox());
		softAssert.assertAll();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}
	
	@Test
	public void kanbanCardCustomFieldWhiteBoard()
	{
		whiteBoardRegression.clickOn_CustomFieldSideColumn();
		//softAssert.assertEquals("1540.00", whiteBoardRegression.getCurrencyCustomFieldValue());
		//softAssert.assertEquals("Custom field created on white board's kanban card.", whiteBoardRegression.getTextCustomFieldValue());
		//softAssert.assertAll();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}
	
	@Test
	public void cardModeKanbanCardWhite()
	{
		whiteBoardRegression.clickOn_CardModeSideColumn();
		softAssert.assertEquals(false, whiteBoardRegression.verifyCardModeEstimationDays());
		softAssert.assertEquals(false, whiteBoardRegression.verifyCardModeDuration());
		softAssert.assertAll();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		refresh();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("invisibilityOfElementLocated", WhiteBoardRegressionLocators.whiteBoardLoadMask());
	}
	
	@Test
	public void uploadStickerWhiteBoard()
	{
		whiteBoardRegression.uploadSticker_OnWhiteBoard();
		softAssert.assertEquals(true, whiteBoardRegression.isStickerVisible());
		softAssert.assertAll();
	}
	
	@Test
	public void cloneWhiteBoardCardWithStartDateAndDueDate()
	{
		whiteBoardRegression.cliclOn_CloneSideColumn();
		softAssert.assertEquals(true, whiteBoardRegression.isKanbanCardCloned());
		softAssert.assertAll();
	}
	
	@Test
	public void hyperJumpWhiteBoardCard()
	{
		whiteBoardRegression.clickOn_HyperjumpSideColumn();
	}
	
	@Test
	public void hierarchyWhiteBoard()
	{
		whiteBoardRegression.clickOn_HierarchySideColumn();
		close();
	}
	
	@Test
	public void filesUploadOnWhiteBoard()
	{
		whiteBoardRegression.clickOnFiles_SideColumn();
	}
	
	@Test
	public void deleteWhiteBoardCard()
	{
		whiteBoardRegression.clickOnDelete_SideColumn();
	}
	
	@Test
	public void whiteBoardPreferences()
	{
		whiteBoardRegression.whiteBoardPreferences();
	}
	
	@Test
	public void whiteBoardSecurityCheck()
	{
		whiteBoardRegression.clickOn_WhiteBoardSecurityCheckUnderPreferences();
		softAssert.assertEquals(true, whiteBoardRegression.verifyDisableMoveCheckBoxWhenChecked());
		softAssert.assertEquals(true, whiteBoardRegression.verifyDisableEditCheckboxWhenChecked());
		softAssert.assertAll();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnSaveButton());
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
	}
	
	@Test
	public void whiteBoardSecurityUncheck()
	{
		whiteBoardRegression.clickOn_WhiteBoardSecurityUncheckUnderPreferences();
		softAssert.assertEquals(true, whiteBoardRegression.verifyDisableMoveCheckBoxAfterUncheck());
		softAssert.assertEquals(true, whiteBoardRegression.verifyDisableEditCheckboxAfterUncheck());
		softAssert.assertAll();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnSaveButton());
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
	}
	
	@Test
	public void caseCardOnWhiteBoard()
	{
		whiteBoardRegression.clickOn_CasesForAddCaseCardOnWhiteBoard();
		softAssert.assertEquals(KanbanBoardSettingHelper.getCaseNameFromCaseObjectPage, whiteBoardRegression.verifyCaseCardTitleAfterCreating());
		softAssert.assertAll();
	}
	
	@Test
	public void opportunityCardOnWhiteBoard()
	{
		whiteBoardRegression.clickOn_OpportunitiesAddOpportunityCardOnWhiteBoard();
		softAssert.assertEquals("Opportunity:"+KanbanBoardSettingHelper.getOpportunityNameFromOpportunityObjectPage, whiteBoardRegression.verifyOpportunityCardTitleAfterCreating());
		softAssert.assertAll();
	}
	
	@Test
	public void defaultLinkWhiteBoard()
	{
		whiteBoardRegression.clickOn_DefaultLinkUnderPreferences();
		//softAssert.assertEquals(true, whiteBoardRegression.verifyWhiteBoardCardMiniatureOnActivity());
		//softAssert.assertAll();
		try {Thread.sleep(2500);}catch(InterruptedException ie) {}
		driver.switchTo().window(WhiteBoardRegressionHelper.getWhiteBoardWindowHandleValue);			//uncomment this line when script run from start
		//driver.switchTo().window(WhiteBoardRegressionHelper.temporaryVariableForWindowHandleOfWhiteBoard);	//this is dummy variable for switch window,this will switch to white board screen
	}
	
	@Test
	public void boardSettingWhiteBoard()
	{
		whiteBoardRegression.clickOn_BoardSettingUnderPreferences();
	}
	
	@Test
	public void inboundEmailsWhiteBoard()
	{
		whiteBoardRegression.clickOn_InboundEmailUnderPreferences();
	}
	
	@Test
	public void whiteBoardCloneWithStartDate()
	{
		whiteBoardRegression.cloneCompleteWhiteBoardWithStartDate();
		softAssert.assertEquals("Clone White Board by Automation with Start Date", whiteBoardRegression.isWhiteBoardClonedWithStartDate());
		softAssert.assertAll();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		driver.switchTo().window(WhiteBoardRegressionHelper.getWhiteBoardWindowHandleValue);					//uncomment this line when script run from start
		//driver.switchTo().window(WhiteBoardRegressionHelper.temporaryVariableForWindowHandleOfWhiteBoard);				//remove/comment this line after complete script for clone with start date
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	@Test
	public void whiteBoardCloneWithDueDate()
	{
		whiteBoardRegression.cloneCompleteWhiteBoardWithDueDate();
		softAssert.assertEquals("Clone White Board by Automation with Due Date", whiteBoardRegression.isWhiteBoardClonedWithDueDate());
		softAssert.assertAll();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		driver.switchTo().window(WhiteBoardRegressionHelper.getWhiteBoardWindowHandleValue);					//uncomment this line when script run from start
		//driver.switchTo().window(WhiteBoardRegressionHelper.temporaryVariableForWindowHandleOfWhiteBoard);				//remove/comment this line after complete script for clone with start date
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	@Test
	public void zoomInZoomOutIconWhiteBoard()
	{
		whiteBoardRegression.clickOnPlusAndMinusIconWhiteBoard();
	}
	
	@Test
	public void panAndResetWhiteBoard()
	{
		whiteBoardRegression.panAndResetWhiteBoard();
	}
	
	@Test
	public void chatterOnWhiteBoard()
	{
		whiteBoardRegression.viewAllChatterOnWhiteBoard();
		softAssert.assertEquals("Hello..!! White Board Chatter!!", whiteBoardRegression.isViewAllChatterOnWhiteBoard());
		softAssert.assertAll();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		close();
		driver.switchTo().window(WhiteBoardRegressionHelper.getWhiteBoardWindowHandleValue);			//uncomment this line after script complete for View All Chatter
		//driver.switchTo().window(WhiteBoardRegressionHelper.temporaryVariableForWindowHandleOfWhiteBoard);		//Remove this line after complete script
	}
	
	@Test
	public void chatterOnCaseCardWhiteBoard()
	{
		whiteBoardRegression.viewAllChatterOnCaseCard();
		softAssert.assertEquals("Hello..!! Chatter on Finance category case card on White board.", whiteBoardRegression.verifyChatterOnCaseCard());
		softAssert.assertAll();
		driver.switchTo().parentFrame();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.closeChatterWindow());
		findElement(KanbanBoardSettingLocators.closeChatterWindow()).click();
	}
	
	@Test
	public void chatterOnOpportunityCardWhiteBoard()
	{
		whiteBoardRegression.viewAllChatterOnOpportunityCard();
		softAssert.assertEquals("Hello..!! Chatter on Marketing category opportunity card on White board.", whiteBoardRegression.verifyChatterOnOpportunityCard());
		softAssert.assertAll();
		driver.switchTo().parentFrame();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.closeChatterWindow());
		findElement(KanbanBoardSettingLocators.closeChatterWindow()).click();
	}
	
	@Test
	public void viewAllCardHistoryWhiteBoard()
	{
		whiteBoardRegression.history_ViewAllCardWhiteBoard();
	}
	
	
	@Test
	public void boardDesignWhiteBoard()
	{
		whiteBoardRegression.boardDesignWhiteBoard();
	}
	
	@Test
	public void createZoneOnWhiteBoard()
	{
		whiteBoardRegression.createCustomZoneOnWhiteBoard();
	}
}