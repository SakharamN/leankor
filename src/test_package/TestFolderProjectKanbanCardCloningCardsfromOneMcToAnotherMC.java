package test_package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import helper_package.FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMC;

public class TestFolderProjectKanbanCardCloningCardsfromOneMcToAnotherMC {
	
	FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMC fpkCardHelper = new FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMC();
	
	SoftAssert softAssertion = new SoftAssert();
	
	@Test(priority=0)
	public void CreateFolderProjectKanbanBoard()
	{
		fpkCardHelper.clickOn_CreateFolderProjectKanbanBoard();
	}
	
	@Test(priority=1)
	public void CreateKanbanCard()
	{
		fpkCardHelper.createKanbanCard();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		softAssertion.assertEquals(true, fpkCardHelper.cardCategory());
		softAssertion.assertEquals(true, fpkCardHelper.cardTitle());
		softAssertion.assertEquals(true, fpkCardHelper.cardDate());
		softAssertion.assertEquals(true, fpkCardHelper.cardId());
		softAssertion.assertEquals(true, fpkCardHelper.cardEffort());
		softAssertion.assertAll();
	}	
	
	
	@Test(priority=2,enabled=false)
	public void Stickers()
	{
		//fpkCardHelper.clickOn_StickerSideColumn();
		//softAssertion.assertEquals(true, fpkCardHelper.verifyStickersOnCard());
		softAssertion.assertAll();
	}
}