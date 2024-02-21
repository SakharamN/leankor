package test_package;

import org.testng.annotations.Test;

import helper_package.ApplyStickerToAllKanbanCardHelper;
import helper_package.CreateKanbanCardsOnDifferentMasterContainersHelper;

public class TestApplyStickerToAllKanbanCard {
  
	
	CreateKanbanCardsOnDifferentMasterContainersHelper addcards=new CreateKanbanCardsOnDifferentMasterContainersHelper();
	
	ApplyStickerToAllKanbanCardHelper applySticker = new ApplyStickerToAllKanbanCardHelper();
	
	
	@Test(priority=0)
	public void create_KanbanBoard() throws InterruptedException
	{
		addcards.create_KanbanBoard();
	}
	@Test(priority=1)
	public void create_KanbanCard()
	{
		addcards.create_KanbanCard();
	}
	
	@Test(priority=2)
	public void ApplyStickersOnBacklogMasterContainer()
	{
		applySticker.addStickersOnBacklogMasterContainerKanbanCards();
	}
}
	
	
	/*@Test(priority=2)
	public void ApplyStickersOnInProgressMasterContainer()
	{
		applySticker.addStickersOnInProgressMasterContainerKanbanCards();
	}
	
	@Test(priority=2)
	public void ApplyStickersOnReviewAndApprovalMasterContainer()
	{
		applySticker.addStickersOnReviewAndApprovalMasterContainerKanbanCards();
	}
	
	@Test(priority=3)
	public void ApplyStickersOnDoneMasterContainer()
	{
		applySticker.addStickersOnDoneMasterContainerKanbanCards();
	}
	
	@Test(priority=4)
	public void ApplyStickersOnArchiveMasterContainer()
	{
		applySticker.addStickersOnArchiveMasterContainerKanbanCards();
	}
}*/