
package test_package;

import org.testng.annotations.Test;

import helper_package.ToAddingConstraintsColumnInCVHelper;

public class TestToAddingConstraintsColumnInCV {
	
	ToAddingConstraintsColumnInCVHelper Addconstraintcolumn = new ToAddingConstraintsColumnInCVHelper();
	
	
	@Test(priority=0)
	public void create_KanbanBoard() throws Exception
	{	
		Addconstraintcolumn.create_KanbanBoard();
			
	}
	
	@Test(priority=1,enabled=false)// we add all columns by saperating method
	public void AddcardDetailsColumn()
	{
		Addconstraintcolumn.AddcardDetailsColumn();
	}
	
	
	
	@Test(priority=2)
	public void AddingPercentageColumn()
	{
		Addconstraintcolumn.AddingPercentageColumn();
	}
	
	
	@Test(priority=3)
	public void AddingAssignedResourcesColumn()
	{
		Addconstraintcolumn.AddingAssignedResourcesColumn();
	}
	
	/*
	@Test(priority=4)
	public void AddingCategoryColumn()
	{
		Addconstraintcolumn.AddingCategoryColumn();
	}
	@Test(priority=5)
	public void AddingConstraintsColumn()
	{
		Addconstraintcolumn.AddingConstraintsColumn();
	}
	
	@Test(priority=6)
	public void AddingDiscussColumn()
	{
		Addconstraintcolumn.AddingDiscussColumn();
	}
	
	@Test(priority=7)
	public void AddingEarlyEndColumn()
	{
		Addconstraintcolumn.AddingEarlyEndColumn();
	}
	
	@Test(priority=8)
	public void AddingEarlyStart()
	{
		Addconstraintcolumn.AddingEarlyStart();
	}
	
	@Test(priority=9)
	public void AddingEndColumn()
	{
		Addconstraintcolumn.AddingEndColumn();
	}
	@Test(priority=10)
	public void AddingfilesColumn()
	{
		Addconstraintcolumn.AddingfilesColumn();
	}
	
	
	@Test(priority=11)
	public void AddingIDColumn()
	{
		Addconstraintcolumn.AddingIDColumn();
	}
	@Test(priority=12)
	public void AddingLateEndColumn()
	{
		Addconstraintcolumn.AddingLateEndColumn();
	}
	@Test(priority=13)
	public void AddingLateStartColumn()
	{
		Addconstraintcolumn.AddingLateStartColumn();
	}
	@Test(priority=14)
	public void AddingOnHoldColumn()
	{
		Addconstraintcolumn.AddingOnHoldColumn();
	}
	@Test(priority=15)
	public void AddingOwnerColumn()
	{
		Addconstraintcolumn.AddingOwnerColumn();
	}
	@Test(priority=16)
	public void AddingPredecessorColumn()
	{
		Addconstraintcolumn.AddingPredecessorColumn();
	}
	@Test(priority=17)
	public void AddingPriorityColumn()
	{
		Addconstraintcolumn.AddingPriorityColumn();
	}
	@Test(priority=18)
	public void AddingRiskColumn()
	{
		Addconstraintcolumn.AddingRiskColumn();
	}
	@Test(priority=19)
	public void AddingSequenceColumn()
	{
		Addconstraintcolumn.AddingSequenceColumn();
	}
	@Test(priority=20)
	public void AddingStartColumn()
	{
		Addconstraintcolumn.AddingStartColumn();
	}
	@Test(priority=21)
	public void AddingStickersColumn()
	{
		Addconstraintcolumn.AddingStickersColumn();
	}
	@Test(priority=22)
	public void AddingSuccessorsColumn()
	{
		Addconstraintcolumn.AddingSuccessorsColumn();
	}
	@Test(priority=23)
	public void AddingTimetoLaunchColumn()
	{
		Addconstraintcolumn.AddingTimetoLaunchColumn();
	}
		
	@Test(priority=24)
	public void removePercentageConstraintColumn()
	{
		Addconstraintcolumn.removePercentageConstraintColumn();
	}
	
	
	@Test(priority=25)
	public void removeAssignresourceConstraintColumn()
	{
		Addconstraintcolumn.removeAssignresourceConstraintColumn();
	}
		
	@Test(priority=26)
	public void removeCategoryColumn()
	{
		Addconstraintcolumn.removeCategoryColumn();
	}
			
	@Test(priority=27)
	public void removeConstraintColumn()
	{
		Addconstraintcolumn.removeConstraintColumn();
	}
	@Test(priority=28)
	public void removeDiscussColumn()
	{
		Addconstraintcolumn.removeDiscussColumn();
	}
	
	@Test(priority=29)
	public void removeEarlyendColumn()
	{
		Addconstraintcolumn.removeEarlyEndColumn();
	}
	@Test(priority=30)
	public void removeEarlyStartcolumn()
	{
		Addconstraintcolumn.removeEarlyStartColumn();
	}
	
	@Test(priority=31)
	public void removeEndColumn()
	{
		Addconstraintcolumn.removeEndColumn();
	}
	@Test(priority=32)
	public void removefilesColumn()
	{
		Addconstraintcolumn.removeFilesColumn();
	}
	
	@Test(priority=33)
	public void removeIDcolumn()
	{
		Addconstraintcolumn.removeIDcolumn();
	}
	
	@Test(priority=34)
	public void removeLateEndColumn()
	{
		Addconstraintcolumn.removeLateEndcolumn();
	}
	
	@Test(priority=35)
	public void removeLateStartColumn()
	{
		Addconstraintcolumn.removeLateStartcolumn();
	}
	
	@Test(priority=36)
	public void removeOnHoldColumn()
	{
		Addconstraintcolumn.removeOnHoldColumn();
	}
	
	@Test(priority=37)
	public void removeOwnerColumn()
	{
		Addconstraintcolumn.removeOwnerColumn();
	}
	
	@Test(priority=38)
	public void removePredecessorColumn()
	{
		Addconstraintcolumn.removePredecessorColumn();	
	}
	
	@Test(priority=39)
	public void removePriorityColumn()
	{
		Addconstraintcolumn.removePriorityColumn();
	}
	
	@Test(priority=40)
	public void removeRiskColumn()
	{
		Addconstraintcolumn.removeRiskColumn();
	}
	
	@Test(priority=41)
	public void removeSequenceColumn()
	{
		Addconstraintcolumn.removeSequenceColumn();
	}
	
	@Test(priority=42)
	public void removeStartColumn()
	{
		Addconstraintcolumn.removeStartColumn();
	}
	
	@Test(priority=43)
	public void removeStickersColumn()
	{
		Addconstraintcolumn.removeStickersColumn();
	}
	
	@Test(priority=44)
	public void removeSuccessorsColumn()
	{
		Addconstraintcolumn.removeSuccessorsColumn();
	}
	
	@Test(priority=45)
	public void removeTimeToLaunch()
	{
		Addconstraintcolumn.removeTimeTolaunchColumn();
	}
	*/

}
