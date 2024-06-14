package test_package;

import org.testng.annotations.Test;

import helper_package.UpdateKanbanCardsDeatailHelper;

public class TestUpdateKanbanCardsDeatail {
	
	UpdateKanbanCardsDeatailHelper updatekanban=new UpdateKanbanCardsDeatailHelper();
	
	@Test(priority=0)
	public void Open_KAnbanBoard() throws InterruptedException
	{
		updatekanban.Open_KanbanBoard();	
	}
	@Test(priority=1)
	public void Open_KanbanCard()
	{
		updatekanban.count_KanbanCard();
	}
	
	
	@Test(priority=2)
	public void AddTaskToBacklogMasterContainer()
	{
		updatekanban.addTaskToBacklogMasterContainerCards();
	}

	
	@Test(priority=3)
	public void AddTaskToInProgressMasterContainer()
	{
		updatekanban.addTaskToInProgressMasterContainerCards();
	}
	
	@Test(priority=4)
	public void AddTaskToReviewAndApprovalMasterContainer()
	{
		updatekanban.addTaskToReviewAndApprovalMasterContainerCards();
	}
	
	@Test(priority=5)
	public void AddTaskToDoneContainer()
	{
		updatekanban.addTaskToDoneContainerCards();
	}
	
	@Test(priority=6)
	public void AddTaskToArchiveContainer()
	{
		updatekanban.addTaskToArchiveContainerCards();
	}
	
	
	

}
