package test_package;

import org.testng.annotations.Test;

import helper_package.AutomateConstraintColumnfieldOnCalendarViewHelper;

public class TestAutomateConstraintColumnfieldOnCalendarView {
	
	
	AutomateConstraintColumnfieldOnCalendarViewHelper EditConstraintColumnField =new AutomateConstraintColumnfieldOnCalendarViewHelper();
	
	
	@Test(priority=0)
	public void OpenKanban_Board() throws InterruptedException
	{
		EditConstraintColumnField.Open_KanbanBoard();
	}
	
	@Test(priority=1)
	public void DoubleclickOnPercentageCell()
	{
		EditConstraintColumnField.EditPercentageColumn();
	}
	
	@Test(priority=2,enabled=false)
	public void DoubleClickOnDiscussColumn()
	{
		EditConstraintColumnField.EditDiscussColumn();
	}
	
	@Test(priority=3)
	public void DoubleclickOnEditEndColumnDate()
	{
		EditConstraintColumnField.EditEndColumnDate();
	}
	
	@Test(priority=4)
	public void UploadFile()
	{
		EditConstraintColumnField.EditfileColumn();
	}
	
	@Test(priority=5)
	public void EditIDcolumn()
	{
		EditConstraintColumnField.EditIDcolumn();
	}
	
	@Test(priority=6)
	public void EditOnHoldCheckboxColumn()
	{
		EditConstraintColumnField.EditOnHoldCheckboxColumn();
	}
	
	@Test(priority=7)
	public void OwnerColumn()
	{
		EditConstraintColumnField.OwnerColumn();
	}  
	
	@Test(priority=8)
	public void clickingOnRiskColumn()
	{
		EditConstraintColumnField.clickingOnRiskColumn();
	}
	
	@Test(priority=9)
	public void ClickOnStartDateColumn()
	{
		EditConstraintColumnField.ClickOnStartDateColumn();
	}
	
	@Test(priority=10)
	public void ClickingOnStickersColumn()
	{
		EditConstraintColumnField.ClickingOnStickersColumn();
	}
	
	@Test(priority=11,enabled=false)
	public void DependancyStartTostart()
	{
		EditConstraintColumnField.DependancyStartTostart();
	}
	
	@Test(priority=12)
	public void DependancyfromStartTofinish()
	{
		EditConstraintColumnField.DependancyfromStartTofinish();
	}
	
	@Test(priority=13)
	public void DependancyfinishTofinish()
	{
		EditConstraintColumnField.DependancyfinishTofinish();
	}
	
	@Test(priority=14)
	public void DependancyfinishTostart()
	{
		EditConstraintColumnField.DependancyfinishTostart();
	}

	
	@Test(priority=15)
	public void DependancySSfromCardTwo()
	{
		EditConstraintColumnField.DependancySSfromCardTwo();
	}
	
	@Test(priority=16)
	public void DependancySffromCardTwo()
	{
		EditConstraintColumnField.DependancySffromCardTwo();
	}
	
	@Test(priority=17)
	public void DependancyFFfromCardTwo()
	{
		EditConstraintColumnField.DependancyFFfromCardTwo();
	}
	
	@Test(priority=18)
	public void DependancyFSfromCardTwo()
	{
		EditConstraintColumnField.DependancyFSfromCardTwo();
	}

	
	
	
	
	
	
	
}
