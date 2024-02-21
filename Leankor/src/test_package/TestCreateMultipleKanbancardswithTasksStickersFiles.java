package test_package;

import org.testng.annotations.Test;

import helper_package.CreateMultipleKanbancardswithTasksStickersFilesHelper;

public class TestCreateMultipleKanbancardswithTasksStickersFiles {
	
	
	CreateMultipleKanbancardswithTasksStickersFilesHelper CreatekanbanTaskStickers=new 	CreateMultipleKanbancardswithTasksStickersFilesHelper();
	
	@Test(priority=0)
	public void kanbanBoard() throws InterruptedException
	{
		CreatekanbanTaskStickers.create_KanbanBoard();
	}
    
	@Test(priority=1)
	public void kanbanCard() 
	{
		CreatekanbanTaskStickers.create_KanbanCard();
	}

	@Test(priority=2)
	public void AddTaskToBacklogMasterContainer()
	{
		CreatekanbanTaskStickers.addTaskToBacklogMasterContainerCards();
	}

}
