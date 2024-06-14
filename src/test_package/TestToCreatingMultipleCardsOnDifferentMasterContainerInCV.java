package test_package;

import java.awt.AWTException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import helper_package.ToCreatingMultipleCardsOnDifferentMasterContainerInCVHelper;

public class TestToCreatingMultipleCardsOnDifferentMasterContainerInCV {
	
	
	ToCreatingMultipleCardsOnDifferentMasterContainerInCVHelper multipleCards= new ToCreatingMultipleCardsOnDifferentMasterContainerInCVHelper();
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test(priority=0)
	public void KanbanBoard() throws InterruptedException
	{
		multipleCards.create_KanbanBoard();
	}
	
	@Test(priority=1,enabled=false)
	public void kanbanCard() throws AWTException
	{
		multipleCards.create_KanbanCard();	
	}
	
	@Test(priority=3)
	public void CardsCreateOnTemplateMasterContainer()
	{
		multipleCards.CardsCreateOnTemplateMasterContainer();
	}
	
	@Test(priority=4)
	public void CardsCreateOnBacklogMasterContainer()
	{
		multipleCards.CardsCreateOnBacklogMasterContainer();
	}
	
	@Test(priority=5)
	public void CardsCreateOnInprogressMasterContainer()
	{
	    multipleCards.CardsCreateOnInprogressMasterContainer();
	}
	
	@Test(priority=6)
	public void CardsCreateOnReviewAndApproveMasterContainer()
	{
		multipleCards.CardsCreateOnReviewAndApproveMasterContainer();
	}
	
	@Test(priority=7)
	public void CardsCreateOnDoneMasterContainer()
	{
		multipleCards.CardsCreateOnDoneMasterContainer();
	}
	
	@Test(priority=8)
	public void CardsCreateOnArchiveMasterContainer() 
	{
		multipleCards.CardsCreateOnArchiveMasterContainer();
	}
	
	@Test(priority=9)
	public void CollapseAndExpandMasterContainers()
	{
		multipleCards.CollapseAndExpandMasterContainers();
	}
	
	
	
	
	
	
	

}
