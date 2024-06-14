package test_package;

import org.testng.annotations.Test;

import helper_package.AddMilestoneOnMasterContainerInCVHelper;
import helper_package.AddKanbanCardRegressionOnCalendarViewHelper;

public class TestAddMilestoneOnMasterContainerInCV 
{

	AddMilestoneOnMasterContainerInCVHelper Addmile=new AddMilestoneOnMasterContainerInCVHelper();
	AddKanbanCardRegressionOnCalendarViewHelper CreateBoard=new AddKanbanCardRegressionOnCalendarViewHelper();
	
	
	
	@Test(priority=0)
	public void KanbanBoard() throws InterruptedException
	{
		CreateBoard.create_KanbanBoard();
	}
    @Test(priority=1)
	public void CreateMilestoneOnCardInCV() 
	{

		Addmile.Create_milestoneOnCv();
	}
    @Test(priority=2)
    public void EditMilestoneOnCV()
    {
    	Addmile.update_milestoneOnCv();
    }
    
  
    @Test(priority=3,enabled=false)
    public void DiscussChatter_OnMilestone()
    {
    	Addmile.ClickOnDiscuss_OnMilestone();
    }
    
    @Test(priority=4)
    public void Cloned_milestoneByStartDate()
    {
    	Addmile.ClickOn_ClonemilestoneByStartDate();
    }
  
    @Test(priority=5)
    public void Cloned_milestoneByDueDate()
    {
    	Addmile.Clone_milestoneByDueDate();
    }
   
    @Test(priority=6)
    public void ClickOn_QuickActionOnMilestone()
    {
    	Addmile.ClickOn_QuickActionOnMilestone();
    }
    
    @Test(priority=7)
    public void Delete_milestone()
    {
    	Addmile.Delete_milestoneOnCv();
    }
    
 
	
}
