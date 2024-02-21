

package test_package;

import org.testng.annotations.Test;
import helper_package.CreateKanbanCardsOnDifferentMasterContainersHelper;

public class TestCreateKanbanCardsOnDifferentMasterContainers {
	
	CreateKanbanCardsOnDifferentMasterContainersHelper createKanbanDiffMaster = new CreateKanbanCardsOnDifferentMasterContainersHelper();
	
	@Test(priority=0)
	public void kanbanBoard() throws InterruptedException
	{
		createKanbanDiffMaster.create_KanbanBoard();
	}
    
	@Test(priority=1)
	public void kanbanCard() 
	{
		createKanbanDiffMaster.create_KanbanCard();
	}

	@Test(priority=2)
	public void AddTaskToBacklogMasterContainer()
	{
		createKanbanDiffMaster.addTaskToBacklogMasterContainerCards();
	}

	@Test(priority=3)
	public void AddTaskToInProgressMasterContainer()
	{
		createKanbanDiffMaster.addTaskToInProgressMasterContainerCards();
	}
	
	@Test(priority=4)
	public void AddTaskToReviewAndApprovalMasterContainer()
	{
		createKanbanDiffMaster.addTaskToReviewAndApprovalMasterContainerCards();
	}
	
	@Test(priority=5)
	public void AddTaskToDoneContainer()
	{
		createKanbanDiffMaster.addTaskToDoneContainerCards();
	}
	
	@Test(priority=6)
	public void AddTaskToArchiveContainer()
	{
		createKanbanDiffMaster.addTaskToArchiveContainerCards();
	}
	
		
}

