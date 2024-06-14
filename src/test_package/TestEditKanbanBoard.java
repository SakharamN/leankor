package test_package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common_package.BrowserLaunch;
import helper_package.EditKanbanBoardHelper;
import helper_package.KanbanBoardRegressionHelper;

public class TestEditKanbanBoard extends BrowserLaunch{

	KanbanBoardRegressionHelper KBR=new KanbanBoardRegressionHelper();
	EditKanbanBoardHelper editBoard = new EditKanbanBoardHelper();
	SoftAssert softAssert = new SoftAssert();
	
	
	
	@Test(priority=0)
	public void creatingSingleKanbanCard()
	{
		KBR.creatingSingleKanbanCard();
		
	}
	
	@Test(priority=1)
	public void createEditMasterContainer()
	{
		editBoard.createMasterContainer();
		//softAssert.assertEquals(0, editBoard.verifyIsMiniatureVisible());
		//softAssert.assertAll();
		driver.switchTo().window(KanbanBoardRegressionHelper.multipleTabsOpen.get(1));
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
}