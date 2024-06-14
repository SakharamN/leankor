package test_package;

import org.testng.annotations.Test;

import helper_package.CreateKanbanCardWithThreeTaskHelper;

public class TestCreateKanbanCardWithThreeTask {
	
	CreateKanbanCardWithThreeTaskHelper kanbanCardWithThreeTask = new CreateKanbanCardWithThreeTaskHelper();
	
	

	
	@Test
	public void CreateHundredKanbanCardWithThreeTaskEach() throws InterruptedException
	{
		kanbanCardWithThreeTask.kanbanCard();
	}
	
	
	@Test
	public void CloneBackLogMasterContainerCardsToInProgressMasterContainer()
	{
		kanbanCardWithThreeTask.cloneCardsIninProgressMasterContainer();
	}
	
	
	@Test
	public void CloneBackLogMasterContainerCardsToReviewAndApprovalMasterContainer()
	{
		kanbanCardWithThreeTask.cloneCardsInReviewAndApprovalMasterContainer();
	}
	
	@Test
	public void CloneBackLogMasterContainerCardsToDoneMasterContainer()
	{
		kanbanCardWithThreeTask.cloneCardsInDoneMasterContainer();
	}
	
	
	@Test
	public void CloneBackLogMasterContainerCardsToArchiveMasterContainer()
	{
		kanbanCardWithThreeTask.cloneCardsInArchiveMasterContainer();
	}
	
	
	@Test
	public void CloneKanbanBoard()
	{
		kanbanCardWithThreeTask.cloneKanbanBoard();
	}
}