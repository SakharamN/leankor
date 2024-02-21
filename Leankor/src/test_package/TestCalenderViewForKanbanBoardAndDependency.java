package test_package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import helper_package.CalenderViewForKanbanBoardAndDependencyHelper;
import helper_package.FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMC;

public class TestCalenderViewForKanbanBoardAndDependency {
	
	CalenderViewForKanbanBoardAndDependencyHelper calenderViewIcon = new CalenderViewForKanbanBoardAndDependencyHelper();
	
	FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMC FKC =new FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMC();
	SoftAssert softAssertion = new SoftAssert();
	
	@Test(priority=0)
	public void clickOn_CreateFolderProjectKanbanBoard()
	{
		FKC.clickOn_CreateFolderProjectKanbanBoard();
	}
	
	@Test(priority=1)
	public void createKanbanCard()
	{
		FKC.createKanbanCard();
	}
	
	
	
	@Test(priority=2)
	public void CalenderViewIcon()
	{
		calenderViewIcon.clickOn_CalenderViewIcon();
	}
	
	
	@Test(priority=3,enabled=false)
	public void WebtableAutomate()
	{
		calenderViewIcon.WebtableAutomate();
	}
	
	@Test(priority=4)
	public void DependencyFinishToFinish()
	{
		calenderViewIcon.calenderViewCardDependencyCreationFinishToFinish();
	}
	
	@Test(priority=4,enabled=false)
	public void DependencyFinishToStart()
	{
		calenderViewIcon.calenderViewCardDependencyCreationFinishToStart();
	}
}