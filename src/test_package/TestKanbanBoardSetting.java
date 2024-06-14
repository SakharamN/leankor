package test_package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common_package.CommonMethodsOfWebDriver;
import helper_package.KanbanBoardRegressionHelper;
import helper_package.KanbanBoardSettingHelper;
import pom_package.KanbanBoardRegressionLocators;
import pom_package.KanbanBoardSettingLocators;

public class TestKanbanBoardSetting extends CommonMethodsOfWebDriver {
	
	//KanbanBoardRegressionHelper KBRH = new KanbanBoardRegressionHelper();
	KanbanBoardSettingHelper kanbanBoardSettingHelper = new KanbanBoardSettingHelper();
	SoftAssert softAssert = new SoftAssert();
	
	
	
	
	  @Test(priority=0)
      public void creatingSingleKanbanCard() 
	  {
	  
		  kanbanBoardSettingHelper.creatingSingleKanbanCard();
	  
	  }
	  
	 
	  @Test(priority=1) 
	  public void KanbanCardTask()
	  {
		  
		  kanbanBoardSettingHelper.clickOn_TasksideColoum();
	  
	  }
	 

	@Test(priority=2)
	public void kanbanBoardMyPreference()
	{
		kanbanBoardSettingHelper.kanbanBoardPreferences();
		softAssert.assertEquals("1", kanbanBoardSettingHelper.getChatterCountFromUpdatedCardFaceAfterTaskCompletion());
		softAssert.assertAll();
	}
	
	@Test(priority=3)
	public void kanbanBoardSecurity()
	{
		kanbanBoardSettingHelper.clickOn_SecurityUnderPreference();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		softAssert.assertEquals(true, kanbanBoardSettingHelper.verifyDisableMoveCheckBox());
		softAssert.assertEquals(true, kanbanBoardSettingHelper.verifyDisableEditCheckbox());
		softAssert.assertAll();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeClickableByLocator", KanbanBoardSettingLocators.clickOnSaveButton());
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
	}
	

	@Test(priority=4)
	public void kanbanBoardSecurityUncheck()
	{
		kanbanBoardSettingHelper.clickOn_SecurityForUncheck();
		softAssert.assertEquals(true, kanbanBoardSettingHelper.verifyDisableMoveCheckBoxAfterUncheck());
		softAssert.assertEquals(true, kanbanBoardSettingHelper.verifyDisableEditCheckboxAfterUncheck());
		softAssert.assertAll();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeClickableByLocator", KanbanBoardSettingLocators.clickOnSaveButton());
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
	}
	
	
	@Test(priority=5,enabled=false)
	public void casesCard()
	{
		kanbanBoardSettingHelper.clickOn_CasesUnderPreference();
		//softAssert.assertEquals(KanbanBoardSettingHelper.getCaseNameFromCaseObjectPage, kanbanBoardSettingHelper.verifyCaseCardTitleAfterCreating());
		//softAssert.assertAll();
		driver.switchTo().window(KanbanBoardRegressionHelper.multipleTabsOpen.get(1));
		
	}
	
	
	@Test(priority=6,enabled=false)
	public void opportunityCard()
	{
		kanbanBoardSettingHelper.clickOn_OpportunitiesUnderPreference();
		//softAssert.assertEquals("Opportunity:"+KanbanBoardSettingHelper.getOpportunityNameFromOpportunityObjectPage, kanbanBoardSettingHelper.verifyOpportunityCardTitleAfterCreating());
		//softAssert.assertAll();
	}
	 
	@Test(priority=7)
	public void defaultLinkKanbanBoard()
	{
		kanbanBoardSettingHelper.clickOn_DefaultLinkOnKanbanBoard();
		//softAssert.assertEquals(true, kanbanBoardSettingHelper.verifyMiniatureOnActivity());
		//softAssert.assertAll();
		driver.switchTo().window(KanbanBoardSettingHelper.multipleTabsOpen.get(1));
	}
	
	@Test(priority=8,enabled=false)
	public void boardSetting()
	{
		kanbanBoardSettingHelper.clickOnBoardSettingUnderPreference();
	}
	
	
	@Test(priority=9)
	public void inboundEmail()
	{
		kanbanBoardSettingHelper.clickOnInBoundEmailUnderPreference();
	}
	
	
	@Test(priority=10)
	public void saveKanbanBoard()
	{
		kanbanBoardSettingHelper.saveKanbanBoardData();
	}
	
	@Test(priority=11,enabled=false)
	public void cloneKanbanBoardStartDate()
	{
		kanbanBoardSettingHelper.cloneCompleteKanbanBoardWithStartDate();
		//softAssert.assertEquals("Clone Project by Automation with Start Date", kanbanBoardSettingHelper.isKanbanBoardClonedWithStartDate());
		//softAssert.assertAll();
	}
	
	@Test(priority=12,enabled=false)
	public void cloneKanbanBoardDueDate()
	{
		kanbanBoardSettingHelper.cloneCompleteKanbanBoardWithDueDate();
		//softAssert.assertEquals("Clone Project by Automation with Due Date", kanbanBoardSettingHelper.isKanbanBoardClonedWithDueDate());
		//softAssert.assertAll();
	}

	
	/*
	
	@Test(priority=13,enabled=false)
	public void filter()
	{
		kanbanBoardSettingHelper.filterOnKanbanBoard();
	}

	
	@Test(priority=14)
	public void collapseExpandMasterContainer()
	{
		kanbanBoardSettingHelper.collapseExpandMasterContainerByClickingOnEachCheckbox();
		softAssert.assertEquals(false, kanbanBoardSettingHelper.isExpandAllMasterContainer());
		softAssert.assertAll();
	}
	
	@Test(priority=15)
	public void collapseAllMasterContainerCheckbox()
	{
		kanbanBoardSettingHelper.collapseMasterContainerByClickingCollapseAllCheckBox();
		softAssert.assertEquals("selected", kanbanBoardSettingHelper.isAllMasterContainerCheckTrue());
		softAssert.assertAll();
		
	}
	
	@Test(priority=16)
	public void expandAllMasterContainerCheckbox()
	{
		kanbanBoardSettingHelper.expandMasterContainerByClickingCollapseAllCheckBox();
		softAssert.assertEquals(false, kanbanBoardSettingHelper.isAllMasterContainerExpandAfterUncheck());
		softAssert.assertAll();
		try {Thread.sleep(1000);} catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.collapseExpandIcon());
		findElement(KanbanBoardSettingLocators.collapseExpandIcon()).click();
	}
	
	@Test(priority=17)
	public void panBoard()
	{
		kanbanBoardSettingHelper.panKanbanBoard();
		softAssert.assertEquals(false, kanbanBoardSettingHelper.verifyPanBoard());
		softAssert.assertAll();
	}
	
	@Test(priority=18)
	public void resetBoard()
	{
		kanbanBoardSettingHelper.resetkanbanBoard();
		softAssert.assertEquals(true, kanbanBoardSettingHelper.verifyResetKanbanBoard());
		softAssert.assertAll();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	
	@Test(priority=19)
	public void viewSaveAsPdf()
	{
		kanbanBoardSettingHelper.view_SaveAsPDF();
	}
	
	@Test(priority=20)
	public void viewAllChatter()
	{
		kanbanBoardSettingHelper.kanbanBoardViewAllChatters();
		softAssert.assertEquals("Hello..!! Kanban Board Chatter!!", kanbanBoardSettingHelper.verifyViewAllChatters());
		softAssert.assertAll();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		close();
	}
	
	
	@Test(priority=21)
	public void chatterOnCardCategory()
	{
		kanbanBoardSettingHelper.viewAllChatterSalesCategoryChatter();
		//softAssert.assertEquals("Hello..!! Chatter on Kanban Card Sales Category Card.", kanbanBoardSettingHelper.verifyViewAllChatterSalesCategoryCardCount());
		//softAssert.assertAll();
		driver.switchTo().defaultContent();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.closeKanbanBoardChatterPopup());
		findElement(KanbanBoardSettingLocators.closeKanbanBoardChatterPopup()).click();
	}
	
	
	@Test(priority=22)
	public void viewAllCardHistoryOfkanbanBoard()
	{
		kanbanBoardSettingHelper.notificationBellIcon();
	}
	
	@Test (priority=23)
	public void createCardNewIcon()
	{
		kanbanBoardSettingHelper.addCardToBoardNewIcon();
	}
	
	@Test(priority=24)
	public void undo()
	{
		kanbanBoardSettingHelper.undoOnKanbanBoard();
		softAssert.assertEquals("Card Creating by new icon", kanbanBoardSettingHelper.verifyCardAfterUndo());
		softAssert.assertAll();
	}
	
	@Test(priority=25)
	public void cloneBacklogMasterContainer()
	{
		kanbanBoardSettingHelper.backlogMasterContainerCloneCards();
		softAssert.assertEquals(true, kanbanBoardSettingHelper.isBacklogMasterContainerCardsCloned());
		softAssert.assertAll();
	}
	
	@Test(priority=26)
	public void hyperjumpReviewAndApproveMasterContainer()
	{
		kanbanBoardSettingHelper.reviewAndApproveMasterContainerHyperjumpCards();
		//softAssert.assertEquals(true, kanbanBoardSettingHelper.isReviewAndApproveMasterContainerCardsHyperjumped());
		//softAssert.assertAll();
	}
	*/
	
}
