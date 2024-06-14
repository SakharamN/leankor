package test_package;

 //import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common_package.CommonMethodsOfWebDriver;
import helper_package.KanbanBoardRegressionHelper;
import pom_package.KanbanBoardRegressionLocators;

public class TestKanbanBoardRegression extends CommonMethodsOfWebDriver {//we extend common method bcoz we need to use reusable methods in thi class if noneed use this methods then no need to extend commom methods class dueto which browser launch two times and takeing more time

	/*public TestKanbanBoardRegression() {
		super(driver);
		// TODO Auto-generated constructor stub
	}*/

	KanbanBoardRegressionHelper kanbanBoardRegression = new KanbanBoardRegressionHelper();
	SoftAssert softAssert = new SoftAssert();
	
	@Test(priority=0)
	public void SingleKanbanCard()
	{
	//	Assert.assertEquals(expectedValue, actualValue); // this is hard assert If this fails, the test stops here.and // The following code will not be executed if the assertion fails.
		
		kanbanBoardRegression.creatingSingleKanbanCard();
		//softAssert.assertEquals("Marketing", kanbanBoardRegression.getVerifyCardCategory());//When a soft assertion (e.g., softAssert.assertEquals(), softAssert.assertTrue()) fails, it records the failure but allows the test to continue running. It doesn't immediately terminate the test method.
		//softAssert.assertEquals("New Card", kanbanBoardRegression.getVerifyCardTitleAndDescription());//Soft assertions are useful when you want to capture multiple assertion failures within the same test case without stopping the test immediately. 
		//softAssert.assertEquals(kanbanBoardRegression.getCardDuedate, kanbanBoardRegression.getVerifyCardDueDate());//o mark the entire test method as failed based on the collected assertion failures, you need to explicitly call softAssert.assertAll() at the end of the test method. If any assertion failed, this method will throw an exception, causing the test to fail.
		//softAssert.assertEquals("Mark001", kanbanBoardRegression.getVerifyCardId());
		//softAssert.assertEquals("7", kanbanBoardRegression.getVerifyCardEfforts());
		//softAssert.assertAll();//if we not write it at the end it will not showing any Error in assertion
		
	}
	
	
	@Test(priority=1,enabled=false)
	public void UpdateKanbanCard()
	{
		kanbanBoardRegression.updateKanbanCard();
		//softAssert.assertEquals("Operations", kanbanBoardRegression.getUpdatedCardCategory());
		//softAssert.assertEquals("Update card title from New Card to LATEST CARD", kanbanBoardRegression.getUpdatedCardTitle());
		//softAssert.assertEquals(kanbanBoardRegression.getUpdatedCardDuedate, kanbanBoardRegression.getUpdatedCardDueDate());
		//softAssert.assertEquals("M999", kanbanBoardRegression.getUpdatedCardId());
		//softAssert.assertEquals("15", kanbanBoardRegression.getUpdatedCardEffort());
		//softAssert.assertEquals(kanbanBoardRegression.getUserNameWhileCardUpdate, kanbanBoardRegression.getUpdatedCardOwner());
		//softAssert.assertAll();
	}

	

	@Test(priority=2,enabled=false)
	public void KanbanCardStatus()
	{
		kanbanBoardRegression.clickOn_SideStatusColumn();
		//softAssert.assertEquals(KanbanBoardRegressionHelper.cardStartDateWhileCreating, kanbanBoardRegression.verifyDateOfStatusRegister());
		softAssert.assertEquals("Card is upto date.", kanbanBoardRegression.verifyStatusRegisterDescription());
		softAssert.assertEquals("Green", kanbanBoardRegression.verifyOnTimeColoumn());
		softAssert.assertEquals("Amber", kanbanBoardRegression.verifyOnQualityColoumn());
		softAssert.assertEquals("Red", kanbanBoardRegression.verifyOnBudgetColoumn());
		softAssert.assertAll();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
		
	}
	

	
	//Add Task on kanban Card
	
	@Test(priority=3)
	public void KanbanCardTask()
	{
		
		kanbanBoardRegression.clickOn_TasksideColoum();
		
		//softAssert.assertEquals("Task1", kanbanBoardRegression.verifyTaskName());
		//softAssert.assertEquals(true, kanbanBoardRegression.verifyTaskDate());
		//softAssert.assertEquals("Not Started", kanbanBoardRegression.verifyTaskStatus());
		//softAssert.assertAll();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
		
	}
	
	

	//Edit that Task on kanban card
	@Test(priority=4)
	public void EditKanbanCardTask()
	{
		kanbanBoardRegression.editTask();
		softAssert.assertEquals("This is updated task name : Task2", kanbanBoardRegression.verifyEditTaskSubject());
		softAssert.assertEquals(true,kanbanBoardRegression.verifyEditTaskDate());
		softAssert.assertEquals("In Progress",kanbanBoardRegression.verifyEditTaskStatus());
		softAssert.assertAll();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}
	


	
	
	@Test(priority=5)
	public void KanbanCardLogTime()
	{
		kanbanBoardRegression.clickOn_LogTimeSideColumn();
		//softAssert.assertEquals(KanbanBoardRegressionHelper.cardStartDateWhileCreating, kanbanBoardRegression.verifyLogTimeDate());
		//softAssert.assertEquals("This is updated task name : Task2", kanbanBoardRegression.verifyLogTimeTaskName());
		//softAssert.assertEquals("16", kanbanBoardRegression.verifyLogTimeHoursColumn());
		//softAssert.assertEquals(true, kanbanBoardRegression.verifyLogTimeDescription());
		//softAssert.assertAll();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}

	@Test(priority=6)
	public void EditKanbanCardLogTime()
	{
		try {Thread.sleep(1800);}catch(InterruptedException ie) {}
		kanbanBoardRegression.editLogtime();
		//softAssert.assertEquals(true,kanbanBoardRegression.verifyLogTimeDateAfterEdit());
		softAssert.assertEquals("This is updated task name : Task2", kanbanBoardRegression.verifyLogTimeTaskNameAfterEdit());
		softAssert.assertEquals("40",kanbanBoardRegression.verifyLogTimeHoursColumnAfterEdit());
		softAssert.assertEquals("Update log time detail", kanbanBoardRegression.verifyLogTimeDescriptionAfterEdit());
		softAssert.assertAll();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}
	
	@Test(priority=7)
	public void KanbanCardRisk()
	{
		kanbanBoardRegression.clickOn_RiskSideColumn();
		//softAssert.assertEquals(KanbanBoardRegressionHelper.cardStartDateWhileCreating, kanbanBoardRegression.verifyRiskDate());
		softAssert.assertEquals("This is updated task name : Task2", kanbanBoardRegression.verifyTaskNameOnRisk());
		softAssert.assertEquals("6",kanbanBoardRegression.verifyRiskScore());
		softAssert.assertEquals("Issue", kanbanBoardRegression.verifyRiskType());
		softAssert.assertEquals("Relationship between conditions, events, or tasks such that one cannot begin or be-completed until one or more other conditions, events, or tasks have occurred, begun, or completed",kanbanBoardRegression.verifyRiskDetail());
		softAssert.assertAll();
		try {Thread.sleep(1300);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}	
	
	
	@Test(priority=8)
	public void EditKanbanCardRisk()
	{
		kanbanBoardRegression.editRisk();
		softAssert.assertEquals("setCheck", kanbanBoardRegression.verifyRiskResolvedCheckAfterEdit());
		softAssert.assertEquals(true,kanbanBoardRegression.verifyRiskDateAfterEdit());
		softAssert.assertEquals("This is updated task name : Task2",kanbanBoardRegression.verifyTaskNameOnRiskAfterEdit());
		softAssert.assertEquals("6",kanbanBoardRegression.verifyRiskScoreAfterEdit());
		softAssert.assertEquals("Business Dependency", kanbanBoardRegression.verifyRiskTypeAfterEdit());
		softAssert.assertEquals("Detail of Risk is updated : Now it is changed from Issue to Business Dependency",kanbanBoardRegression.verifyRiskDetailAfterEdit());
		softAssert.assertAll();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	

	
	
	
    @Test(priority=9)
	public void quickActionKanbanCard()
	{
		kanbanBoardRegression.clickOn_QuickActionOnKanbanCard();
		
		//if(KanbanBoardRegressionHelper.classAttributeValueOfQuickActionSideColumn.equals("aParent disablemenucls"))	//when quick action is Disable
		//{
		//	softAssert.assertEquals("9", kanbanBoardRegression.getVerifyCardDurationAfterQuickAction(), "Quick Action Option is Disable on Edit Left Panel,");
		//}
		//else if(KanbanBoardRegressionHelper.classAttributeValueOfQuickActionSideColumn.equals("aParent "))	//when quick action is Enable
		//{
		//	softAssert.assertEquals("9", kanbanBoardRegression.getVerifyCardDurationAfterQuickAction());
		//}
		//softAssert.assertAll();
	}
	
    
	@Test(priority=10)
	public void KanbanCardLink()
	{
		kanbanBoardRegression.clickOn_LinkSideColumn();
		softAssert.assertEquals(KanbanBoardRegressionHelper.linkColumnLinkToProjectName, kanbanBoardRegression.verifyProjectName());
		softAssert.assertEquals(KanbanBoardRegressionHelper.linkColumnLinkToProjectBoardKanbanBoardName, kanbanBoardRegression.verifyKanbanBoardName());
		softAssert.assertEquals(KanbanBoardRegressionHelper.linkColumnLinkToCardKanbanCardName, kanbanBoardRegression.verifyKanbanCardName());
		softAssert.assertEquals(true,kanbanBoardRegression.verifyLinkURL());
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
		//softAssert.assertEquals(true,kanbanBoardRegression.verifyLinkSignOnKanbanCard());
		softAssert.assertAll();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		//refresh();
	}
	
	@Test(priority=11)
	public void KanbanCardSubscriber()
	{
		kanbanBoardRegression.clickOn_SubscriberSideColumn();
		softAssert.assertEquals("setCheck" , kanbanBoardRegression.verifySubscriberMovedCheckBox());
		softAssert.assertEquals("setCheck" , kanbanBoardRegression.verifySubscriberDoneCheckBox());
		softAssert.assertEquals("setCheck" , kanbanBoardRegression.verifySubscriberCardPastDueCheckBox());
		softAssert.assertEquals("setCheck" , kanbanBoardRegression.verifySubscriberTaskPastDueCheckBox());
		softAssert.assertEquals("setCheck" , kanbanBoardRegression.verifySubscriberTaskCompletedCheckBox());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}
	
	
	@Test(enabled=false)
	public void KanbanCardCustomField()
	{
		kanbanBoardRegression.click_OnCustomFieldsSideColumn();
	}
	
	@Test(priority=12)
	public void kanbanCardResource()
	{
		kanbanBoardRegression.clickOn_ResourceSideColumnOnKanbanCard();
		//softAssert.assertEquals(kanbanBoardRegression.getUserNameWhileCardUpdate, kanbanBoardRegression.verifyResourceOnCard());
		//softAssert.assertEquals("75%", kanbanBoardRegression.verifyResourceAllocation());
		//softAssert.assertAll();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}
	
	@Test(priority=13)
	public void KanbancardCardMode()
	{
		kanbanBoardRegression.ClickOn_CardModeSideColumn();
		softAssert.assertEquals(false,kanbanBoardRegression.verifyCardModeEstimationDays());
		softAssert.assertEquals(false,kanbanBoardRegression.verifyCardModeDuration());
		softAssert.assertAll();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}
	
	@Test(priority=14)
	public void UploadStickerOnKanbanCard()
	{
		kanbanBoardRegression.uploadStickerOnKanbanBoardAndApplyOnKanbanCard();
		//softAssert.assertEquals(true,kanbanBoardRegression.verifyStickerUploadOnKanbanCard());
		softAssert.assertAll();
	}

	
	@Test(priority=15,enabled=false)
	public void CloneKanbanCard()
	{
		kanbanBoardRegression.clickOn_CloneSideColumn();
		softAssert.assertEquals(true,kanbanBoardRegression.verifyKanbanCardWhichISCloneByStartDate());
		softAssert.assertEquals(true,kanbanBoardRegression.verifyKanbanCardWhichIsCloneByDueDate());
		softAssert.assertAll();
		refresh();
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		
	}
	
	
	@Test(priority=16)
	public void KanbanCardHyperJump()
	{
		kanbanBoardRegression.clickOn_HyperJumpKanbanCardToAnotherProjectKanbanBoard();
	}
	
	@Test(priority=17)
	public void KanbanCardHierarchy()
	{
		kanbanBoardRegression.clickOn_HierarcySideColumn();
	}
	
	@Test(priority=18)
	public void KanbanCardFiles()
	{
		kanbanBoardRegression.clickOn_FilesSideColumn();
		//softAssert.assertEquals("Regression Kanban Board for link one card to it / Card For Link:One Card is link to this card",kanbanBoardRegression.getKanbanCardLinkFooterValue());
		//softAssert.assertEquals("67",kanbanBoardRegression.getKanbanCardDaysEffortValue());
		//softAssert.assertEquals("priority blue",kanbanBoardRegression.getKanbanCardPriority());
		//softAssert.assertEquals("1",kanbanBoardRegression.getKanbanCardChatterCount());
		//softAssert.assertEquals("1",kanbanBoardRegression.getkanbanCardTaskCount());
		//softAssert.assertEquals("50",kanbanBoardRegression.getKanbanCardStatusPercentage());
		//softAssert.assertEquals(true,kanbanBoardRegression.getKanbanCardStickerVisibility());
		//softAssert.assertEquals(kanbanBoardRegression.getUserNameWhileCardUpdate, kanbanBoardRegression.getKanbanCardOwner());
		//softAssert.assertAll();
	}
	
	@Test(priority=19)
	public void DeleteKanbanCard()
	{
		kanbanBoardRegression.clickOn_DeleteSideColumn();
	} 
}
