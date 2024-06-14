package test_package;

import org.testng.annotations.Test;

import helper_package.ToCheckingHeaderButtonsOnCalendarViewHelper;

public class TestToCheckingHeaderButtonsOnCalendarView {

	
	ToCheckingHeaderButtonsOnCalendarViewHelper HeaderButton = new ToCheckingHeaderButtonsOnCalendarViewHelper();
	
	@Test(priority=0)
	public void CreateKAnbanBoard() throws Exception
	{
		
		HeaderButton.create_KanbanBoard();
	}
	
	
	@Test(priority=1)
	public void AddTaskonAllmasterContainersCards()
	{
		HeaderButton.AddTaskOnAllmastercontainerCards();
	}
	

	@Test(priority=2,enabled=false)
	public void InspectHeaderElements()
	{
		HeaderButton.InspectHeaderElements();
	}
	

	
	@Test(priority=3,enabled=false)
	public void UndoButtonFunctionality()
	{
		HeaderButton.UndoButtonFunctionality();
	}
	
	@Test(priority=4,enabled=false)
	public void PerformedSetPercentComplete()
	{
		HeaderButton.PerformedSetPercentComplete();
	}
	
	
	
	@Test(priority=5)
	public void CaptureProjectAndKanbanBoardName()
	{
		HeaderButton.CaptureProjectAndKanbanBoardName();
	}
	
	@Test(priority=6)
	public void showhundredpercecards()
	{
		HeaderButton.showhundredpercentCards();
	}
	@Test(priority=7)
	public void ShowAllTasks()
	{
		HeaderButton.ShowAllTasks();
	}
	
	@Test(priority=8)
	public void ShowCriticalPath()
	{
		HeaderButton.ShowCriticalPath();
	}
	
	@Test(priority=9)
	public void SetCalendarPreferences()
	{
		HeaderButton.SetCalendarPreferences();
	}
	
	
	@Test(priority=10)
	public void filterOnCalendarView()
	{
		HeaderButton.filterOnCalendarView();
	}
	
	@Test(priority=11)
	public void AddSickersfromStickersColumnAndAutomateStickerfilterdropdown()
	{
		HeaderButton.AddStickersfromStickersColumnAndAutomateStickerfilterdropdown();
	}   

	
	 
}
