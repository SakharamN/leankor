package test_package;

import org.testng.annotations.Test;

import helper_package.CreateMilestoneAndAutomateThreedotfunctionalityOnPgHelper;

public class TestCreateMilestoneAndAutomateThreedotfunctionalityOnPg {

	CreateMilestoneAndAutomateThreedotfunctionalityOnPgHelper milestonethreedotfunctionality = new CreateMilestoneAndAutomateThreedotfunctionalityOnPgHelper();

	@Test(priority = 0)
	public void singleMilestone() {
		milestonethreedotfunctionality.singleMilestone();
	}

	@Test(priority = 1)
	public void quickActionsOnMilstone() {
		milestonethreedotfunctionality.quickActionsOnMilstone();
	}

	@Test(priority = 2)
	public void addButtonfunctionality() {
		milestonethreedotfunctionality.addButtonfunctionality();
	}

	@Test(priority = 3, enabled = false)
	public void discusstabOnmilestone() {
		milestonethreedotfunctionality.discusstabOnmilestone();
	}

	@Test(priority = 4)
	public void converToActivityGroup() {
		milestonethreedotfunctionality.convertToActivityGroup();
	}

	@Test(priority = 5)
	public void performIndentOutdentExternalDependancyCloneAndDeleteOperation() {
		milestonethreedotfunctionality.performIndentOutdentExternalDependancyCloneAndDeleteOperation();
	}

	@Test(priority = 6)
	public void convertTomilestone() {
		milestonethreedotfunctionality.convertTomilestone();
	}

}
