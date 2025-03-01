package test_package;

import org.testng.annotations.Test;

import helper_package.AddNewColumsOnPGHelper;

public class TestAddNewColumnOnPG {

	AddNewColumsOnPGHelper addNewColumn = new AddNewColumsOnPGHelper();

	@Test(priority = 0)
	public void Create_SingleActivity() {
		addNewColumn.Create_SingleActivity();
	}

	@Test(priority = 1)
	public void addPercentageDoneColumn() {
		addNewColumn.addPercentageDoneColumn();
	}

	@Test(priority = 2)
	public void addAssignedResourceColumn() {
		addNewColumn.addAssignedResourceColumn();
	}

	@Test(priority = 3)
	public void addCategoryColumn() {
		addNewColumn.addCategoryColumn();
	}

	@Test(priority = 4)
	public void addDescriptionColumn() {
		addNewColumn.addDescriptionColumn();
	}

	@Test(priority = 5)
	public void addDiscussColumn() {
		addNewColumn.addDiscussColumn();
	}

	@Test(priority = 6)
	public void addElapsedTimeColumn() {
		addNewColumn.addElapsedTimeColumn();
	}

	@Test(priority = 7)
	public void addFilesColumn() {
		addNewColumn.addFilesColumn();
	}

	@Test(priority = 8)
	public void addOnHoldColumn() {
		addNewColumn.addOnHoldColumn();
	}

	@Test(priority = 9)
	public void addPredecessorColumn() {
		addNewColumn.addPredecessorColumn();
	}

	@Test(priority = 10) // priority column functionality nit added in 1.300.14 version
	public void addPriorityColumn() {
		addNewColumn.addPriorityColumn();
	}

	@Test(priority = 11)
	public void addRiskColumn() {
		addNewColumn.addRiskColumn();
	}

	@Test(priority = 12)
	public void addSequenceColumn() {
		addNewColumn.addSequenceColumn();
	}

	@Test(priority = 13)
	public void addStickersColumn() {
		addNewColumn.addStickersColumn();
	}

	@Test(priority = 14)
	public void addSuccessorsColumn() {
		addNewColumn.addSuccessorsColumn();
	}

	@Test(priority = 15)
	public void addTimetoLaunchColumn() {
		addNewColumn.addTimetoLaunchColumn();
	}

	@Test(priority = 16)
	public void removePercentageDoneColumn() {
		addNewColumn.removePercentageDoneColumn();
	}

	@Test(priority = 17)
	public void removeAssignedResourceColumn() {
		addNewColumn.removeAssignedResourceColumn();
	}

	@Test(priority = 18)
	public void removeCategoryColumn() {
		addNewColumn.removeCategoryColumn();
	}

	@Test(priority = 19)
	public void removeDescriptionColumn() {
		addNewColumn.removeDescriptionColumn();
	}

	@Test(priority = 20)
	public void removeDiscussColumn() {
		addNewColumn.removeDiscussColumn();
	}

	@Test(priority = 21)
	public void removeElapsedTimeColumn() {
		addNewColumn.removeElapsedTimeColumn();
	}

	@Test(priority = 22)
	public void removeFilesColumn() {
		addNewColumn.removeFilesColumn();
	}

	@Test(priority = 23)
	public void removeOnHoldColumn() {
		addNewColumn.removeOnHoldColumn();
	}

	@Test(priority = 24)
	public void removePredecessorColumn() {
		addNewColumn.removePredecessorColumn();
	}

	@Test(priority = 25)
	public void removePriorityColumn() {
		addNewColumn.removePriorityColumn();
	}

	@Test(priority = 26)
	public void removeRiskColumn() {
		addNewColumn.removeRiskColumn();
	}

	@Test(priority = 27)
	public void removeSequenceColumn() {
		addNewColumn.removeSequenceColumn();
	}

	@Test(priority = 28)
	public void removeStickersColumn() {
		addNewColumn.removeStickersColumn();
	}

	@Test(priority = 29)
	public void removeSuccessorsColumn() {
		addNewColumn.removeSuccessorsColumn();
	}

	@Test(priority = 30)
	public void removeTimeToLaunch() {
		addNewColumn.removeTimeToLaunch();
	}

}
